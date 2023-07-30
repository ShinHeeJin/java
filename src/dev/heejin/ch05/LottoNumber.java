package dev.heejin.ch05;

public class LottoNumber {
    public static void main() {

        int[] lottoNumbers = new int[45];

        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = i + 1;
        }

        for (int i = 0; i < lottoNumbers.length; i++) {
            int j = (int) (Math.random() * lottoNumbers.length) ;
            int tmp = lottoNumbers[j];
            lottoNumbers[i] = lottoNumbers[j];
            lottoNumbers[j] = tmp;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(lottoNumbers[i]);
        }


    }
}
