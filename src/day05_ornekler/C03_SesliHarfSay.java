package day05_ornekler;

public class C03_SesliHarfSay {

    public static void main(String[] args) {

/*18----
    Girilen Stringdeki tüm sesli harfleri saymak için bir Java Methodu yazınız.

    */

        String cumle="java candir";
        int toplam=0;

        for (int i = 0; i <cumle.length() ; i++) {
            char harf=cumle.toLowerCase().charAt(i);
            if (harf=='a' || harf=='e' || harf=='i' || harf=='o' || harf=='u'){
                toplam++;
            }

        }

        System.out.println("metinde " +toplam+" adet sesli harf kullanilmistir");
    }


}
