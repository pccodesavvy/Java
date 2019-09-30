import java.util.Arrays;
import java.util.HashSet;

public class ArrayInter {

    public static void main(String[] args){

        /***
         * Integer array intersection
         */
        Integer[] firstarr = {0,1,2,3,4,5,6,7,8};
        Integer[] secondarr ={3,5,6,7};

        HashSet<Integer> iset = new HashSet<>();
        iset.addAll(Arrays.asList(firstarr));
        iset.retainAll(Arrays.asList(secondarr));
        System.out.println(iset);

        Integer[] intersection = {};
        intersection = iset.toArray(intersection);
        System.out.println(Arrays.toString(intersection));

        /***
         * String Array intersection
         */

        String[] firstArray = {"A", "B", "C", "D"};
        String[] secondArray = {"D", "A", "E", "F"};

        HashSet<String> set = new HashSet<>();

        set.addAll(Arrays.asList(firstArray));

        set.retainAll(Arrays.asList(secondArray));

        System.out.println(set);

        //convert to array
        String[] sintersection = {};
        sintersection = set.toArray(sintersection);

        System.out.println(Arrays.toString(sintersection));

    }
}
