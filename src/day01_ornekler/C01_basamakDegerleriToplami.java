package day01_ornekler;

import java.util.Scanner;

public class C01_basamakDegerleriToplami {

    public static void main(String[] args) {
         /*1---
    Kullanicidan bir sayi isteyin. Sayinin Sayi degerlerinin toplamasini yapan Java kodu yaziniz.

    Test Data
    34
    Beklenen Cikti
    7
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen basamak degerlerinin toplanmasini istediginiz sayiyi giriniz");
        int sayi = scanner.nextInt();
        int tolam = 0;
        int birlerBasamagi = 0;
        for (int i = 1; i <= sayi; i++) {
            birlerBasamagi = (sayi % 10);

            tolam += birlerBasamagi;
            sayi /= 10;
  }


            System.out.println("Basamaklar toplami= " + tolam);
        }


    }
