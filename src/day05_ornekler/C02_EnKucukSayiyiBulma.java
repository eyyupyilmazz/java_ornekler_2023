package day05_ornekler;

import java.util.Scanner;

public class C02_EnKucukSayiyiBulma {

    public static void main(String[] args) {
       /*17---
    Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */


        int enKucuk= (enKucukSayi(12, 24, 34));
        System.out.println(enKucuk);

    }

    private static int enKucukSayi(int a, int b, int c) {
int enKucuk= a;
if (b<enKucuk){
    enKucuk=b;
}
if (c<enKucuk){
    enKucuk=c;
}
return enKucuk;
    }

}