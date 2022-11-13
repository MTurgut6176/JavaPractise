package day_04_IfSatement;

import java.util.Scanner;

public class C02_IfStatement {

     /*
    Ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz
                 not hesaplayici
              90 ~100 => A  Cok Iyi
              80 ~ 89 => B  Iyi
              70 ~ 79 => C  Orta
              60 ~ 69 => D  Gecer
              0 ~ 59  => F  Zayif
   */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz 0 ile 100 arasina...");
        double not = input.nextDouble();
        if(not>=0&& not<60){
            System.out.println("Notunuz  F  Zayif");
        }else if(not<70){
            System.out.println("Notunuz D Gecer");
        }else if(not<80){
            System.out.println("Notunuz C ORta...");
        }else if(not<90){
            System.out.println("Notunu B iyi");
        }else if(not<101){
            System.out.println("Notunuz A Cok iyi");
        }else{
            System.out.println("Gecerli bir not giriniz.......");
        }
    }
}
