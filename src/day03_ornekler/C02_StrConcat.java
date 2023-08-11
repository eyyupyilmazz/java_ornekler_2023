package day03_ornekler;

import java.util.Scanner;

public class C02_StrConcat {

    public static void main(String[] args) {


    /*9----
    2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.

    Test Data:
    str1: Java is
    str2: fun

    Beklenen Çıktı:
    java is fun

    */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen concat yapmak istediginiz metinleri giriniz");
        String str1= scanner.nextLine();
        String str2= scanner.nextLine();

        System.out.println(str1+" ".concat(str2));

    }

}
