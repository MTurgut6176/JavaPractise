package day11_multidimenstionalarrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_MultidimensionalArrays {

    public static void main(String[] args) {

        /*
        INTERVIEW
        Kullanicidan alinan bir tam sayiya kadar fibonacci sayis
        0-1-1-2-3-5-8-13-21-34
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int sayi= input.nextInt();
        int a=0;
        int b=1;
        int f=0;
        System.out.print(a + " " + b +" ");
        for (int i = 0; i < sayi; i++) {
            f=a+b;
            if(sayi<=f){
                break;
            }
            System.out.print(f+ " ");
            a=b;
            b=f;
        }

       // 2.yol


        List<Integer> fibonacci=new ArrayList<>();
        Scanner input1=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi1= input.nextInt();

        fibonacci.add(0);
        fibonacci.add(1);
        int i=1;
        if (sayi1<=1){
            System.out.println("lutfen 1 den buyuk bir sayi giriniz");
        }else {
            while (fibonacci.get(i)<sayi1){
                fibonacci.add(fibonacci.get(i)+ fibonacci.get(i-1));//bir onceki eleman ile topladik
                i++;//bir basamak ilerlesin
            }
            if(fibonacci.get(fibonacci.size()-1)>sayi1){//fibonaccide yer almiyorsa
                fibonacci.remove(fibonacci.size()-1);//son elemani sil

                System.out.println("girdiginiz sayi fibonaccide yer almiyor. Girilen sayiya kadarki fibonachi "+fibonacci );

            }else {
                System.out.println("girdiginiz sayi bir fibonacci sayisidir "+fibonacci);
            }
        }

    }
}