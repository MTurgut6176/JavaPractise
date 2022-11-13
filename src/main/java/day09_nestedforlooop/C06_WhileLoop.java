package day09_nestedforlooop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        // kullanicidan aldiginiz sayilari toplayin
        // sayi adeti 10 u yada toplami 500 gecerse,"bu kadar sayi yeter.

      Scanner input=new Scanner(System.in);

      int sayi=0;
      int toplam=0;
      int sayac=0;


      while (sayac<10 && toplam<500){

          System.out.println("Lutfen toplanacak sayilari giriniz...");
          sayi=input.nextInt();
          toplam+=sayi;
          sayac++;

      }if(toplam>500){
            System.out.println(sayac+"adet sayi girdiniz"+ toplam);
        }else System.out.println("bu kadar sayi yeter"+sayac+"adet sayi girdiniz.Toplami"+ toplam);


        //        1 2 3 4 5 6
        //         2 3 4 5 6
       //          3 4 5 6
       //           4 5 6
       //            5 6
       //             6




                for (int satir = 1; satir <= 6; satir++) {//satır kontrolü
                    for (int bosluk = 1; bosluk < satir; bosluk++) {// boşluk yazdırma
                        System.out.print(   " ");
                    }
                    for (int rakam = satir; rakam <= 6; rakam++) {//sutun kontrolu
                        System.out.print(  rakam + " ");
                    }
                    System.out.println( );
                }
            }
        }





