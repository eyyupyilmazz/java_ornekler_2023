package day04_ornekler;

import java.util.Scanner;

public class orn02_BuyukHarfeCevirme {

    public static void main(String[] args) {

    /*12----
    Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.

    Test Data:
    Java is fun

    Beklenen Sonuç:
    JAVA IS FUN
    */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle= scanner.nextLine().toUpperCase();

        System.out.println(cumle);
    }

}
