package day03_ornekler;

import java.util.Scanner;

public class C01_TersteYazdirma {

    public static void main(String[] args) {
        /*8----
     Girilen String değerde tersten yazan Java kodunu yazınız.

    Test Data:
    java
    avaj
    */

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen terse cevirmek istedigibiz metni yazi");
        String str=scanner.nextLine();
        String [] arr=str.split("");
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(arr[i]);

        }

    }



}
