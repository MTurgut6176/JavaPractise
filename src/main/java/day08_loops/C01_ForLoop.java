package day08_loops;

import java.util.Scanner;



public class C01_ForLoop {
    public static void main(String[] args) {

        //Kullanicidan baslangic , bitis ve artis miktarini alarak
        // aradaki tum sayilari aralarina virgul koyarak yazdirin
        // en sonda virgul olmayacak

        Scanner input= new Scanner(System.in);
        //System.out.println("lutfen sa"); // buraya 3 keere sout gir sirayla

        int baslangic=10;
        int bitis =50;
        int artisMiktari=5;
        for (int i = baslangic; i <= bitis; i+=artisMiktari) {

          if(i<bitis){
              System.out.println(i+",");
          }else System.out.print(i);

        }
      /*

       Interview Question
      Kullanicidan 100’den kucuk bir tamsayi isteyin.
      1’den baslayarak girilen sayiya kadar tum sayilari yazdirin.
      Ancak;
      - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
      - Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
      - Sayi hem 3’un hem 5’in kati ise sayi yerine " ** Java Guzeldir ** " yazdirin.
 */
     // Scanner input1 = new Scanner(System.in);
        int sayi1=30;
        for (int i1 = 1; i1 < 31; i1++) {
            if (i1 % 3 == 0 && i1 % 5 == 0) {
                System.out.println(" ** Java Guzeldir ** ");

            } else if (i1 % 3 == 0) {
                System.out.println("Java");
            } else if (i1 % 5 == 0) {

                System.out.println("Guzeldir");

            } else System.out.println(i1 + " ");


        }

    }

}
