package day10_arrays;

import java.util.ArrayList;
import java.util.List;

public class C06_Arrays {
    public static void main(String[] args) {
        //Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
       // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6

        int arr[]={ 1,2,-3,4,-5,-6};
        List<Integer> list=new ArrayList<>();
        for(int w:arr){
            list.add(w);
        }
        System.out.println(list);
        for (Integer w:list){

            list.set(list.indexOf(w),w*-1);
        }
        System.out.println(list);
    }

}
