package day07_ornekler;

public class C02_ArraydeArananDegeriBulma {
    public static void main(String[] args) {

    /*24----
    Yazılan değerin array içerisinde arayan Java Kodu yazınız.

    Array: [1551,1223,1443,1267,1789,1023,2020]


    Aranan Değer:2020
    Beklenen Çıktı:True

    Aranan Değer:2010
    Beklenen Çıktı :False

    */

        int [] arr={1551,1223,1443,1267,1789,1023,2020};
        System.out.println(arananiBul(arr, 2020));
        System.out.println(arananiBul(arr, 2010));


    }
    public static boolean arananiBul(int [] arr, int aranan){
        for (int i = 0; i <arr.length ; i++) {
            if (aranan==arr[i]){
                return true;
            }

        }
        return false;
    }
}
