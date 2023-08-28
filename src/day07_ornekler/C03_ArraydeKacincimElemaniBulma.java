package day07_ornekler;

public class C03_ArraydeKacincimElemaniBulma {

    public static void main(String[] args) {
        /*25----
    Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

    Array: [12,15,43,23,56,76,78,90,77,43]

    Aranan değer:56

    Beklenen Çıktı:
    56 sayısı arrayin 4. elemanı
    */
        int[] arr= {12,15,43,23,56,76,78,90,77,43};
        arananElemaniBul(arr,77);


    }
    public static int arananElemaniBul(int[] arr, int aranan){
        for (int i = 0; i < arr.length; i++) {
            if (aranan==arr[i]){
                System.out.println("arrayin aranan elemani : "+aranan+" arrayin "+i+ ". indexindedir");
            }

        }
        return aranan;
    }
}
