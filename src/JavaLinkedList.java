import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class JavaLinkedList {

    /**
     * 1. LinkedList Hierarchy:
     *
     * The LinkedList class extends AbstractSequentialList class and implements List and Deque interfaces.
     * Here 'E' is the type of values linkedlist stores.
     *
     * 2. LinkedList Features:
     *
     * Doubly linked list implementation which implements List and Deque interfaces. Therefore, It can also be used as a Queue, Deque or Stack.
     * Permits all elements including duplicates and NULL.
     * LinkedList maintains the insertion order of the elements.
     * It is not synchronized. If multiple threads access a linked list concurrently, and at least one of the threads modifies the list structurally, it must be synchronized externally.
     * Use Collections.synchronizedList(new LinkedList()) to get synchronized linkedlist.
     * The iterators returned by this class are fail-fast and may throw ConcurrentModificationException.
     * It does not implement RandomAccess interface. So we can access elements in sequential order only. It does not support accessing elements randomly.
     * We can use ListIterator to iterate LinkedList elements.
     *
     * 3. LinkedList Constructors:
     *
     * LinkedList() : initializes an empty LinkedList implementation.
     * LinkedListExample(Collection c) : initializes a LinkedList containing the elements of the specified collection, in the order they are returned by the collection’s iterator.
     *
     * 4. LinkedList Methods
     *
     * boolean add(Object o) : appends the specified element to the end of a list.
     * void add(int index, Object element) : inserts the specified element at the specified position index in a list.
     * void addFirst(Object o) : inserts the given element at the beginning of a list.
     * void addLast(Object o) : appends the given element to the end of a list.
     * int size() : returns the number of elements in a list
     * boolean contains(Object o) : return true if the list contains a specified element, else false.
     * boolean remove(Object o) : removes the first occurence of the specified element in a list.
     * Object getFirst() : returns the first element in a list.
     * Object getLast() : returns the last element in a list.
     * int indexOf(Object o) : returns the index in a list of the first occurrence of the specified element, or -1 if the list does not contain specified element.
     * lastIndexOf(Object o) : returns the index in a list of the last occurrence of the specified element, or -1 if the list does not contain specified element.
     * Iterator iterator() : returns an iterator over the elements in this list in proper sequence.
     * Object[] toArray() : returns an array containing all of the elements in this list in proper sequence.
     * List subList(int fromIndex, int toIndex) : returns a view of the portion of this list between the specified fromIndex (inclusive) and toIndex (exclusive).
     */

    /**
     * 5. Java LinkedList Example
     * 5.1. Add, remove, iterate
     * Java program to demo the usage of basic methods in linkedlist class.
     * @param args
     */

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        System.out.println(linkedList);

        //Add elements at specified position
        linkedList.add(5, "F");
        linkedList.add(6, "G");
        System.out.println(linkedList);

        //Remove elements from LinkedList
        linkedList.remove("A");
        linkedList.remove(0);

        //Iterate over list elements
        ListIterator<String> itrator = linkedList.listIterator();
        while (itrator.hasNext()) {
            System.out.println(itrator.next());
        }

        /**
         * Program output
         * [A, B, C, D]
         * [A, B, C, D, F, G]
         * C
         * D
         * E
         * F
         * G
         */

        /**
         * 5.2. Convert between Array and LinkedList
         * Java program to convert LinkedList to array and convert array to linkedlist.
         *
         */

        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("W");
        linkedList1.add("X");
        linkedList1.add("Y");
        linkedList1.add("Z");

        //1. LinkedList to Array
        String[] arr = new String[linkedList1.size()];
        linkedList1.toArray(arr);
        System.out.println(Arrays.toString(arr));

        //2. Array to LinkedList
        LinkedList<String> linkedListNew = new LinkedList<>(Arrays.asList(arr));

        System.out.println(linkedListNew);
        System.out.println("==================================================================");


        /***
         * 5.3. How to sort LinkedList
         * Java example to sort a LinkedList using Collections.sort() method. Please note that for custom sorting of objects, we can use Collections.sort(linkedList, comparator) method.
         */

        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("P");
        linkedList2.add("U");
        linkedList2.add("R");
        linkedList2.add("N");
        linkedList2.add("A");
        linkedList2.add("C");
        linkedList2.add("H");
        linkedList2.add("A");
        linkedList2.add("N");
        linkedList2.add("D");
        linkedList2.add("R");
        linkedList2.add("A");

        //Unsorted list
        System.out.println(linkedList2);

        //To Sort the list
        Collections.sort(linkedList2);
        System.out.println("Sorted list is: "+ linkedList2);

        //To do custom sorting the list
        Collections.sort(linkedList2,Collections.reverseOrder());
        System.out.println("Custom sorted list is :" +linkedList2);
    }

}
