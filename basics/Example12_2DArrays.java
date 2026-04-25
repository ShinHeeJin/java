package basics;

import java.util.Arrays;

// 2D 배열 학습
// 행과 열을 가진 배열

public class Example12_2DArrays {
    public static void main(String[] args) {
        System.out.println("=== 2D 배열 선언 및 초기화 ===");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("행의 수: " + matrix.length);
        System.out.println("첫 번째 행의 열 수: " + matrix[0].length);

        System.out.println("\n=== 2D 배열 접근 ===");
        System.out.println("matrix[0][0] = " + matrix[0][0]);
        System.out.println("matrix[1][1] = " + matrix[1][1]);
        System.out.println("matrix[2][2] = " + matrix[2][2]);

        System.out.println("\n=== 2D 배열 순회 (전체 출력) ===");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n=== 2D 배열 순회 (향상된 for) ===");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("\n=== 2D 배열 생성 (크기만 지정) ===");
        double[][] scores = new double[3][4];
        scores[0][0] = 85.5;
        scores[1][2] = 92.0;
        scores[2][3] = 88.5;

        System.out.println("\n=== 행의 합 계산 ===");
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            System.out.println("행 " + i + "의 합: " + sum);
        }

        System.out.println("\n=== 대각선 합 계산 ===");
        int diagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            diagonalSum += matrix[i][i];
        }
        System.out.println("대각선의 합: " + diagonalSum);

        System.out.println("\n=== 전치 행렬 (Transpose) ===");
        int[][] transpose = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose);

        System.out.println("\n=== 불규칙 배열 ===");
        int[][] irregular = {
            {1, 2},
            {3, 4, 5},
            {6, 7, 8, 9}
        };
        for (int[] row : irregular) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
