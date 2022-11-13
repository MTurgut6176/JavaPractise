
package day02_variables;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz...");
        String kullaniciIsmi = input.next();

        //Soru 1 ) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplatan bir program yazdirin
        //( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Çemberin Yarıçapını giriniz...");
        double r = scan.nextDouble();



        System.out.println(" Çemberin Çevresi = " +2*314*r/100);
        System.out.println("Dairenin Alanı = "+3.14*r*r);

        //Soru 2) Kullanıcıdan bir dikdörtgenin uzun ve kısa kenarlarını isteyip o dikdörtgenin alan ve
        // çevre hesabını yapan bir program yazınız.

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lütfen kısa kenar uzunluğunu giriniz...");
        double kisa = scan2.nextDouble();

        System.out.println("Lütfen uzun kenar uzunluğunu giriniz...");
        double uzun = scan2.nextDouble();

        System.out.println("Dikdörtgenin alanı : "+kisa*uzun);
        System.out.println("Dikdörtgenin çevresi : "+(2*kisa+2*uzun));

        //Soru 3) Kenar uzunluklari kullanicidan alinana bir ucgenin cevresini hesaplayan bir program yaziniz.(byte kullanin)
        // Ucgenin cevresi=a+b+c

        Scanner  scan3 = new Scanner(System.in);
        System.out.println("Üçgenin 3 kenar uzunluğunu sırayla giriniz...");
        byte a = scan3.nextByte();
        byte b = scan3.nextByte();
        byte c = scan3.nextByte();

        int cevre = a+b+c;
        System.out.println("Üçgenin çevresi = "+cevre);

        // Soru4)   /*Kullanicidan aldiginiz sekille asagidaki gibi bir gorunum olusturan bir kod yaziniz

    /*
             A
            A A
           A A A
    */

        Scanner scan4=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz ");
        char ch=scan4.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch);
        System.out.println(ch+" "+ch+" "+ch);




    }

}