import java.util.*;
import java.util.function.Consumer;

public class ArrList {

    public static void main(String[] args){
        //Usually we will create either an empty list and add elements to it.
        // Or we will create an arraylist with another exising collection.

        /***
         * Empty arraylist
         */

        List<String> name = new ArrayList<>();
        System.out.println("==================================================================");
        /***
         * Arraylist initialized with another collection
         */
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("==================================================================");
        /***
         * Arrays with type Safefy
         */
        List<String> names = new ArrayList<>();
        /***
         * Adding elements into the ArrayList
         */
        names.add("All");
        names.add("the");
        names.add("Glitters");
        names.add("Silver");
        System.out.println("==================================================================");
        /***
         * To set/update the Arraylist elements
         */

        names.set(1,"The");

        /***
         * To remove the elements in ArrayList
         */
        names.remove(3);

        System.out.println(names);
        System.out.println("==================================================================");
        /***
         * To Iterate over the ArrayList
         */

        ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Iterator<Integer> iter = digits.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("==================================================================");
        /***
         *  To add all elements in the end use addAll() method
         */
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.add("D");

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("E");
        l2.addAll(l1);
        System.out.println(l2);
        System.out.println("==================================================================");

        /***
         * Elements will be inserted from index 2
         */
        ArrayList<String> l3 = new ArrayList<>();    //list 2
        l3.add("F");
        l3.add("G");
        l3.addAll(2, l2);
        System.out.println(l3);
        System.out.println("==================================================================");
        /***
         * Arrays without type safety
         */

        ArrayList al = new ArrayList();
        al.add(1);
        al.add("All");
        al.add(4.55);
        al.add(Arrays.asList(4,56));
        System.out.println(al);
        System.out.println("==================================================================");
        /***
         * To clear the arrayList elements
         */

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("W");
        arrayList.add("X");
        arrayList.add("Y");
        arrayList.add("Z");
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);
        System.out.println("==================================================================");
        /***
         * Cloning the ArrayList (Shallow Copy)
         */

        ArrayList<String> cal = new ArrayList<>();
        cal.add("Purna");
        cal.add("Chandra");
        cal.add("Artificial");
        cal.add("Intelligence");
        System.out.println(cal);
        ArrayList<String> call = (ArrayList<String>) cal.clone();
        System.out.println(call);
        System.out.println("==================================================================");
        /***
         * ArrayList contains method
         */

        ArrayList<String> Alct = new ArrayList<>();
        Alct.add("All");
        Alct.add("The");
        Alct.add("Glitters");
        Alct.add("NotGold");

        System.out.println("ArrayList Contains the Object: "+Alct.contains("Glitters"));
        System.out.println("ArrayList Doesn't Contain the Object:"+Alct.contains("isNot"));
        System.out.println("==================================================================");
        /***
         * ArrayList indexOf method
         */
        ArrayList<String> Alio = new ArrayList<>();
        Alio.add("Somethings");
        Alio.add("Never");
        Alio.add("Change");

        System.out.println(Alio.indexOf("Never")>0);
        System.out.println("==================================================================");
        /***
         * ArrayList Ensure Capacity , Java program to use ensureCapacity() method to increase the size of an arraylist after it’s initialization.
         */

        ArrayList<String> Alc = new ArrayList<>(2);
        Alc.add("Bitter");
        Alc.add("Sweeter");
        Alc.add("Sour");

        Alc.ensureCapacity(10);
        System.out.println(Alc);
        System.out.println("==================================================================");
        /***
         * ArrayList forEach() method
         */

        ArrayList<String> namesFE = new ArrayList<>(Arrays.asList("A","B","C","D"));
        namesFE.forEach(nameLc -> System.out.println(nameLc.toLowerCase()));
        Consumer<String> lambdaExpression = x -> System.out.println(x.toLowerCase());
        namesFE.forEach(lambdaExpression);

        ///we can pass a static method in forEach() statement if we want to have multiple statements to handle the list value.

        ArrayList<String> namesPS = new ArrayList<>(Arrays.asList("A","B","C","D"));

        names.forEach(nameps -> printString(nameps));
        System.out.println("==================================================================");

        /***
         * Array List Get Method
         */

        // get the element from an ArrayList. We will be using ArrayList.get() method to get the object at the specified index of the arraylist.

        ArrayList<String> list = new ArrayList<>(Arrays.asList("alex", "brian", "charles", "dough"));
        String firstName = list.get(0);
        String secondName = list.get(1);

        System.out.println("First Element in the arrayList is: "+firstName);
        System.out.println("Second Element in the arrayList is: "+secondName);
        System.out.println("==================================================================");
        /***
         * ArrayList indexOf Method
         */

        //indexOf method is used to get the Object element position in arrayList, Return value is of int type.

        ArrayList<String> Alp = new ArrayList<>(Arrays.asList("Alex","Flip","Savior","Avenger"));
        System.out.println("Index of Alex in the ArrayList is: "+Alp.indexOf("Alex"));
        System.out.println("Index of Avenger in the ArrayList is: "+Alp.indexOf("Avenger"));
        System.out.println("==================================================================");
        /***
         * ArrayList LastIndexOf Method
         */

        //This method returns the index of the last occurrence of the specified element in this list. It will return '-1' if the list does not contain the element.

        ArrayList<String> Lastindex = new ArrayList<>(Arrays.asList("alex", "brian", "charles","alex","dough","gary","alex","harry"));
        System.out.println("Last Occurance of the element Alex in the ArrayList is: "+Lastindex.lastIndexOf("alex"));
        System.out.println("Last Occurance of the element brain in the ArrayList is: "+Lastindex.lastIndexOf("brian"));
        System.out.println("==================================================================");

        /**
         * ArrayList Iterator
         */

        // ArrayList listIterator() returns a list iterator over the elements in this list. It is a bi-directional iterator which is fail-fast in nature.

        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        ListIterator<String> listItr = alphabets.listIterator();
        System.out.println("===========Forward=========");
        while(listItr.hasNext()) {
            System.out.println(listItr.next());
        }
        System.out.println("===========Backward=========");

        while(listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }
        System.out.println("==================================================================");
        /***
         * ConcurrentModification Exception in ArrayList
         */

        ArrayList<String> alphabet = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        ListIterator<String> listtr = alphabets.listIterator();
        System.out.println(listtr.next());     //A
        System.out.println(listtr.next());     //B
        alphabets.add("E");
        System.out.println(alphabets);          //["A", "B", "C", "D", "E"]

        // To see the Exception please uncomment below line of code.
//        System.out.println(listtr.next());     //Error
        System.out.println("==================================================================");

        /***
         * ArrayList Remove Method
         */

        ArrayList<String> Rmethod = new ArrayList<>(Arrays.asList("India","ML","AI","PC","INTEL","ALPHA"));

        // To remove the element using object reference
        Rmethod.remove("PC");

        System.out.println("After removing element using object reference: "+Rmethod);
        // To remove the element using index reference
        Rmethod.remove(4);
        System.out.println("After removing element using Index reference: "+Rmethod);
        System.out.println("==================================================================");
        //To remove all occurrences of an object from the arraylist
        ArrayList<String> alphabes = new ArrayList<>(Arrays.asList("A", "B", "A", "D", "A"));
        System.out.println("Before Removing all the elements in the ArrayList is: "+alphabes);
        alphabes.removeAll(Collections.singleton("A"));
        System.out.println("After removing all the elements from ArrayList using Singleton is: "+alphabes);
        System.out.println("==================================================================");
        /***
         * ArrayList RemoveIf Method (Removing even number from the list)
         */

        // The removeIf() method takes single argument of type Predicate.
        // The Predicate interface is a functional interface that represents a condition (boolean-valued function) of one argument.
        // It checks that is a given argument met the condition or not.

        ArrayList<Integer> allnumbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        allnumbers.removeIf( number -> number%2 == 0 );
        System.out.println("All Odd numbers are: "+allnumbers);
        System.out.println("==================================================================");

        /***
         * ArrayList RetainAll Method
         */

        /*
          ArrayList retainAll() retains only the elements in this list that are contained in the specified method argument collection.
          Rest all elements are removed from the list. This method is exact opposite to removeAll() method.
         */

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList("A","B","C","D","A","E","F","A"));
        arrList.retainAll(Collections.singleton("A"));
        System.out.println("Retained List elements are: "+arrList);
        System.out.println("==================================================================");
        /***
         * ArrayList Sort Method  (Cover this topic later)
         */

        /*
            ArrayList sort() method sorts the list according to the order induced by the specified Comparator instance.
            All elements in the list must must be mutually comparable
         */
//        ArrayList<String> ArrSort = new ArrayList<>(Arrays.asList("Purnachandra","Andhra","AIML","Expert"));
        System.out.println("==================================================================");
        /***
         * ArrayList SplitIterator Method
         */

        /*
            ArrayList spliterator() returns the instance of Spliterator which is last-binding and fail-fast.
            Java Spliterator is used for traversing and partitioning elements of a source such as array, Set, List or IO channel.
            Spliterator is fail-fast which means after the binding occurs, any interference with the elements is then detected, throwing a ConcurrentModificationException.
         */
        ArrayList<Integer> digitals = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Spliterator<Integer> sItr = digitals.spliterator();
        sItr.tryAdvance(d -> System.out.println(d));
        sItr.tryAdvance(d -> System.out.println(d));
        sItr.tryAdvance(d -> System.out.println(d));
        System.out.println("==================================================================");

        /*
            forEachRemaining() – Iterate all elements :::
            Java program to iterate all elements and perform an action on them.
            It is equivalent to iterator.hasNext() method along with iterator.next() in a loop.
         */

        sItr.forEachRemaining( d -> System.out.println( d ) );

        System.out.println("==================================================================");

        /***
         * ArrayList trySplit()Parallel Processing
         */

        /*
            If you are working on concurrent application and list has large number of elements then it’s good idea to divide the list into two parts and process parallely.
         */
        ArrayList<Integer> trySplitdigits = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Spliterator<Integer> Iter1 = trySplitdigits.spliterator();
        Spliterator<Integer> Iter2 = Iter1.trySplit();

        Iter1.forEachRemaining(d -> System.out.println(d));
        System.out.println("==================================================================");
        Iter2.forEachRemaining(d -> System.out.println(d));

        /***
         * ArrayList SubList() Mehtod
         */
        ArrayList<Integer> Aslist = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer> subList = new ArrayList<Integer>(Aslist.subList(2,5));
        System.out.println("==================================================================");
        System.out.println("Specified index length Sublist from a list is: "+subList);

        // If we want to get sublist from specified index to end of list, then pass the length of arraylist in second argument of method.
        System.out.println("==================================================================");
        ArrayList<Integer> subList2 = new ArrayList<Integer>(Aslist.subList(2,Aslist.size()));
        System.out.println("Complete Sublist from a list is: "+subList2);

        // When we have sublist view of arraylist, we can use this sublist to remove multiple items from arraylist also.

        System.out.println("==================================================================");
        ArrayList<Integer> RList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        RList.subList(2,5).clear();
        System.out.println("List after removed sublist from a list is: "+RList);

        /***
         * Converting ArrayList to Array using toArray() method.
         */

        // toArray() method returns an array containing all of the elements in the list in proper sequence (from first to last element).

        ArrayList<String> arl = new ArrayList<>();
        arl.add("A");
        arl.add("B");
        arl.add("C");
        arl.add("D");


        Object[] ar = arl.toArray();
        for(Object o: ar){
            String s = (String) o;
            System.out.println("==================================================================");
            System.out.println("Array from ArrayList is: "+s);
        }

        //Convert to string array
        String[] array = arl.toArray(new String[arl.size()]);
        System.out.println("==================================================================");
        System.out.println("String Array form from ArrayList: "+Arrays.toString(array));

    }





    private static void printString(String str) {
        System.out.println(str.toLowerCase());
    }




}
