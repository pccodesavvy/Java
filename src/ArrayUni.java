import java.util.Arrays;
import java.util.HashSet;

public class ArrayUni {

    public static void main(String[] args){

        /***
         * Integer Array Union
         */
        Integer[] firstarr = {0,1,2,3,4};
        Integer[] secondarr = {0,5,6,7,8};

        HashSet<Integer> hset = new HashSet();
        hset.addAll(Arrays.asList(firstarr));
        hset.addAll(Arrays.asList(secondarr));

        System.out.println(hset);

        Integer[] union = {};
        union = hset.toArray(union);
        System.out.println(Arrays.toString(union));

        /***
         * String Array Union
         */

        String[] strarr1 = {"A","B","C","D","E"};
        String[] strarr2 = {"A","B","C","D","E","H","I"};

        HashSet<String> sset = new HashSet<>();
        sset.addAll(Arrays.asList(strarr1));
        sset.addAll(Arrays.asList(strarr2));
        System.out.println(sset);

        String[] sunion ={};
        sunion = sset.toArray(sunion);
        System.out.println(Arrays.toString(sunion));


    }
}
