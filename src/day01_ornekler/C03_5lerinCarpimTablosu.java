package day01_ornekler;

public class C03_5lerinCarpimTablosu {

    public static void main(String[] args) {

        // Belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.

      /*  int belirlenenSayi=5;

        for (int i = 1; i <=10 ; i++) {
            System.out.println(belirlenenSayi+"*"+i+" = "+(belirlenenSayi*i));

        }
        */
        carpimsonucu();
    }

    private static void carpimsonucu() {
        int belirlenenSayi = 5;
        System.out.println("Belirlenen sayinin carpim sonucu :");


        for (int i = 1; i <= 10; i++) {
            System.out.println(belirlenenSayi + "*" + i + " = " + (belirlenenSayi * i));
        }



    }
}
