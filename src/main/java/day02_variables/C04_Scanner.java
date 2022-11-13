package day02_variables;

import java.util.Scanner;

public class C04_Scanner {

    //  Soru 1)   Kullanicinin  girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yazdiriniz

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("4 basamakli bir sayi girinz");
        int sayi = scanner1.nextInt();

        //bir sayinin birler basamagindaki rakami %10 ile hesaplatabiliriz.

        int sonRakam=sayi%10;
        int ilkRakam=sayi/1000;
        System.out.println("ilk rakam+son rakam"+(ilkRakam+sonRakam));

          /* Ornek : Inputs : 853
    Output : Girdiginiz sayinin birler basamagi : 3
             Girdiginiz sayinin onlar basamagi : 5

             Girdiginiz sayinin yuzler basamagi : 8
*/
        Scanner scan2=new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi2= scan2.nextInt();

        int birler=sayi2%10;
        System.out.println("Girdiginiz sayinin birler basamagi"+birler);
        int yeniSayi=sayi2/10;
        System.out.println("yenisayi==yenisayi");

        //10 lar bas
        int onlar =sayi2/10;
        System.out.println("girdiginiz sayinin onlar basamagi"+onlar);



        //yuzler basamagi
        int yuzler=sayi2/=10;





        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
        //         *   Ex :
        //         *   input  : 12345==>1+2+4+5=12
        //         *   o




    }
}
