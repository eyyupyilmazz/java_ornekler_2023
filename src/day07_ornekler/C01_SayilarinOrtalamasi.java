package day07_ornekler;

import java.util.Arrays;

public class C01_SayilarinOrtalamasi {
    public static void main(String[] args) {
/*22----
    Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

    Array =  [20, 30, 25, 35, -16, 60, -100 ]

    Beklenen Çıktı:
    Array Sayılarının ortalaması: 7.0*/
        int[] arr = {20, 30, 25, 35, -16, 60, -100};
      double sonuc=  arrOrtalama(arr);
        System.out.println(sonuc);


    }

    public static double arrOrtalama(int[] arr ) {
      double toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];

        }
       return  toplam/arr.length;


    }

}
