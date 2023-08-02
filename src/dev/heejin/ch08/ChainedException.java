package dev.heejin.ch08;

public class ChainedException {

    public static void main(){
        try {
            install();
        } catch (InstallException ie) {
            ie.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void install() throws InstallException {

        try {
            startInstall();
            copyFiles();
        } catch (SpaceException spaceException) {
            spaceException.printStackTrace();
            InstallException installException = new InstallException();
            installException.initCause(spaceException);
            throw installException;

        } catch (MemoryException memoryException) {
            memoryException.printStackTrace();
            InstallException installException = new InstallException();
            installException.initCause(memoryException);
            throw installException;

        } finally {
          deleteTempFiles();
        }

    }

    static void startInstall() throws MemoryException, SpaceException {
        if (!enoughSpace()) {
            throw new SpaceException("설치 공간이 부족합니다.");
        }

        if (!enoughMemory()) {
            throw new MemoryException("메모리 공간이 부족합니다.");
        }

        startInstall();
        copyFiles();
        deleteTempFiles();
    }

    static void copyFiles() { }

    static void deleteTempFiles() { }

    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory(){
        return true;
    }

}

class InstallException extends Exception {
    public InstallException() {
        super("설치중 예외가 발생했습니다.");
    }
}

class SpaceException extends Exception {
    public SpaceException(String message) {
        super(message);
    }
}

class MemoryException extends Exception {
    public MemoryException(String message) {
        super(message);
    }
}
