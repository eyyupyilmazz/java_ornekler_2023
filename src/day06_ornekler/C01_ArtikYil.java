package day06_ornekler;

import java.util.Scanner;

public class C01_ArtikYil {

    public static void main(String[] args) {


    /*19----
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol etmek için bir Java Methodu yazınız.

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen artik degerini hesaplayacaginiz yili giriniz");
        int yil= scanner.nextInt();

        if ((yil%4==0 && yil%100!=0)||yil%400==0){
            System.out.println(yil+" yili artik yildir");
        }else
            System.out.println(yil+ " yili artik yil degildir");

    }

}
