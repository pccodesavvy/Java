import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class ia {

    public static void main(String[] args){
        int[] a = new int[]{1,2};

        /***
         * printing 1-D Array
         */
        System.out.println("One dimensional Array is: "+Arrays.toString(a));

        int[] b = new int[] {4,5,6};
        int[] c = new int[] {7,8,9};
        int[][] d = new int[][] {b,c};


        /***
         * printing 2-D Array
         */
        System.out.println(Arrays.deepToString(d));

        int [][] cordinates = { {1,2}, {2,4}, {3,6,9} };

        System.out.println("Two dimensional Array is: "+ Arrays.deepToString(cordinates) );


        /***
         * Cloning the arrays
         */

        String [] names = {"Alex", "Brian", "Charles", "David"};

        String [] cloneOfNames = names.clone();

        System.out.println("Array Elements are: "+Arrays.toString(names));
        System.out.println("Clone of Array is: "+Arrays.toString(cloneOfNames));

        /***
         * Copy of the arrays
         */
        String [] copyOfArrays = Arrays.copyOf(names,names.length);
        System.out.println("Copy of Array is: "+Arrays.toString(copyOfArrays));

        /***
         * arrayCopy method to copy ArrayElements
         */
        String [] newNames = {"Purna","Rathna","Krishna","Vijaya"};
        String [] copyofnewNames = new String[newNames.length];
        System.arraycopy(newNames,0,copyofnewNames,0,copyofnewNames.length);
        System.out.println("Array elements of newNames are: "+Arrays.toString(newNames));
        System.out.println("Copy of newNames are: " + Arrays.toString(copyOfArrays));


        /***
         * Java SubArray from Array
         */

        String [] arr = {"Artificial","Intelligence","Machine","Learning"};
        String [] partialSubarr = Arrays.copyOfRange(arr,0,2);
        String [] partialSubarr2 = Arrays.copyOfRange(arr,2,arr.length);
        System.out.println("PartialArray1/SubArray list from arr is: "+Arrays.toString(partialSubarr));
        System.out.println("PartialArray2/SubArray list from arr is: "+Arrays.toString(partialSubarr2));

        /***
         *  Java Arrays to SubList
         */

        String [] snames = {"Artificial","Intel","Machine","Learn"};
        List<String> ssnames = Arrays.asList(Arrays.copyOfRange(snames,0,2));
        System.out.println("SubList from Array is:" + ssnames.get(1));

        /***
         * Array copy is shallow copy [This can be covered later]
         */

        /***
         *  Converting String to String Array
         */

        String s = "purna,chandra,dasari,aiml";
        String[] ss = null;
        ss = s.split(",");
        System.out.println("Array of Strings are: "+Arrays.toString(ss));


        /***
         * Converting String to String array using pattern
         */

        String s1 = "Purna,Chandra,Dasari,Aiml";
        String[] ss1 = null;
        Pattern pattern = Pattern.compile(",");
        ss1 = pattern.split(s1);
        System.out.println("Array of Strings using pattern method are: "+Arrays.toString(ss1));

        /***
         * Converting String arrays to Strings
         */

        String[] sa = {"Purna","Chandra","Dasari","AIML"};
        String st = String.join(" ",sa);
        System.out.println(st);


    }
}
