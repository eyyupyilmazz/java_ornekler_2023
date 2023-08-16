package day05_ornekler;

public class C01_IstenilenKarakteriYazdirma {

    public static void main(String[] args) {

    /*15----
    Grilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.

    Test Data:
    Java is fun


    Beklenen Çıktı
    0. pozisyondaki karakter : J

    5. pozisyondaki karakter : i
    */
        String cumle= "Java is fun";

        System.out.println(cumle.substring(0,1));
        System.out.println(cumle.substring(5,6));


    }
}
