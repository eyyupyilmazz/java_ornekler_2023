package day03_ornekler;

import java.util.Scanner;

public class C03_KelimeBulma {

    public static void main(String[] args) {



    /*10-----
    Kullanıcıdan alınan String kümesi içerisinde aranan String i bulan Java Kodunu yazınız.

    Test Data:
    Java cok guzel

    Aranan String: cok

    Bektenen Çıktı:
    True

    Aranan String: ve

    Beklenen Çıktı:False

    */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz");
        String metin=scanner.nextLine();
        System.out.println("lutfen aranan kelimeyi giriniz");
        String arananKelime=scanner.nextLine();

        System.out.println(metin.contains(arananKelime));

        }

    }




