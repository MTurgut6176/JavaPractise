import java.util.Arrays;
import java.util.Scanner;

public class C01_MultidimensionalArrays {

    public static void main(String[] args) {

        //Strinde gecen sesli harfleri yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir string ifade giriniz");

        String str = input.nextLine();

        String arr[] = str.split(""); // cumleyi Array e donusturdur

        System.out.println(Arrays.toString(arr));  // Array yazdirma sekli

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase("a") ||
                    arr[i].equalsIgnoreCase("e") ||
                    arr[i].equalsIgnoreCase("u") ||
                    arr[i].equalsIgnoreCase("o") ||
                    arr[i].equalsIgnoreCase("i")) {
                System.out.println(arr[i]);
            }
        }
    }
}
