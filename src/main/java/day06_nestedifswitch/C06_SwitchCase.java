package day06_nestedifswitch;

import java.util.Scanner;

public class C06_SwitchCase {

    //Ex: Girilen Pozitif 3 basamaklı bir sayıyı yazı ile yazdırınız
    //Ex : 568
    //Besyuzaltmissekiz


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif 3 basamakli bir sayi giriniz");
        int sayi=input.nextInt();

        int birlerBas=(sayi%10);
        int onlarBas=(sayi/10)%10;
        int yuzlerBas=(sayi/100);


        if(sayi>99 && sayi<1000){
            ////100 LER BASAMAGI
            switch (yuzlerBas) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("Yuz");
                    break;
                case 2:
                    System.out.print("Ikiyuz");
                    break;
                case 3:
                    System.out.print("Ucyuz");
                    break;
                case 4:
                    System.out.println("Dortyuz");
                    break;
                case 5:
                    System.out.println("Besyuz");
                    break;
                case 6:
                    System.out.println("Altiyuz");
                    break;
                case 7:
                    System.out.println("Yediyuz");
                    break;
                case 8:
                    System.out.println("Sekizyuz");
                    break;
                case 9:
                    System.out.println("Dokuzyuz");
                    break;
            }
            //////////10 LAR BAS******************\\\\\\\\\\\\
            switch (onlarBas) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("on");
                    break;
                case 2:
                    System.out.print("yirmi");
                    break;

                case 3:
                    System.out.print("otuz");
                    break;

                case 4:
                    System.out.print("kirk");
                    break;

                case 5:
                    System.out.print("elli");
                    break;

                case 6:
                    System.out.print("altmis");
                    break;

                case 7:
                    System.out.print("yetmis");
                    break;

                case 8:
                    System.out.print("seksen");
                    break;

                case 9:
                    System.out.print("doksan");
                    break;
            }

            switch (birlerBas){
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("uc");
                    break;
                case 4:
                    System.out.println("dort");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("alti");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;


            }


        }else System.out.println( "Lutfen 3 basamakli bir sayi giriniz");



    }

}

