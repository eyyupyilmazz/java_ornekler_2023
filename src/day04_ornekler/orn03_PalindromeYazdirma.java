package day04_ornekler;

import java.util.Scanner;

public class orn03_PalindromeYazdirma {
    public static void main(String[] args) {


    /*13----
    Bir palindrom, madam veya racecar veya 10801 sayısı gibi
    ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.

    Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.

    Test Data:
    madam

    Beklenen Çıktı:
    True
    */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen palindrom kontrolu icin bir cumle giriniz");
        String cumle= scanner.nextLine();
         String [] arr=cumle.split("");
         String palindromCumle="";

        for (int i = cumle.length()-1; i >= 0; i--) {
            palindromCumle+=arr[i];

        }
        if (palindromCumle.equalsIgnoreCase(cumle)){
            System.out.println("kelime palindrom kelimedir");
        }else {
            System.out.println("kelime palindrom kelime degildir");
        }
        System.out.println(palindromCumle);// cumleyi tekrar gormek icin yazdirildi. yazmak zorunda degilsiniz

        System.out.println((palindromCumle.equalsIgnoreCase(cumle)));
    }

}
