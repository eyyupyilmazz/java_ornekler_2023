package day04_ornekler;

import java.util.Scanner;

public class orn01_SonKarakteriSil {

    public static void main(String[] args) {

    /*11----
    Kullanıcıdan alınan Stringin son karakteirini silip ekrana yazan Java kodunu yazınız.

    Test Data:
    good

    Beklenen Çıktı:
    goo
    */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen son karakterini silmek istediginiz kelimeyi giriniz");
        String kelime= scanner.next();

        String sonHarfSil=kelime.substring(0,kelime.length()-1);

        System.out.println(sonHarfSil);

    }


}
