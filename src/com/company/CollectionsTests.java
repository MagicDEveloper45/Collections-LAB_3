package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
  * @author Igor Lukin, github - MagicDEveloper45
  * Class for demonstrating the time spent on calling methods for the LinkedList collection
 */

public class CollectionsTests {

    List<Integer> linkedList = new LinkedList<Integer>();
    List<Integer> arrayList = new ArrayList<Integer>();

    public final int arrListLenght = 1000; // lenght of array

    private long globalStartArrL, globalFinishArrL, globalElapsedArrL; // variables that store the starting, final, and elapsed time to execute each method in a specified amount
    private long globalStartLinkL, globalFinishLinkL, globalElapsedLinkL;
    public long addArrL, getArrL, cloneArrL, setArrL, removeArrL,addLinkL, getLinkL, cloneLinkL, setLinkL, removeLinkL ; // variables that store the total time spent on the corresponding method

   /*
    * Summary
    * Output of the time spent on each method
    */
    public void ShowResult()
    {
        arrList_ADD();
        arrList_GET();
        arrList_SET();
        arrList_REMOVE();

        /*System.out.println("\nResult");
        System.out.println("* Add: " + add + " ms" );
        System.out.println("* Get: " + get + " ms");
        System.out.println("* Clone: " + clone + " ns" );
        System.out.println("* Set: " + set + " ns");
        System.out.println("* Remove: " + remove + " ms,");*/
    }

    /*
    * Summary
    * In this method, the arrList is filled with random values. Inside the loop, the add() method is called and the time
    * spent on a single method call is output and the total time is output
    * @param leftBorder - the extreme minimum value for randomness
    * @param rightBorder - the extreme maximum value for randomness
    * @param value - variable for random number from 0 to 5000
    * @param start - start of the iteration count
    * @param finish - finish of the iteration count
    * @param elapsed - time spent processing the method
     */
    public void arrList_ADD()
    {
        System.out.println("\n 1. ArrayList & LinkedList add - tests");

        int leftBorder = 0;
        int rightBorder = 5000;

        globalStartLinkL = System.nanoTime();

        for (int i = 0; i < arrListLenght;i++)
        {
            int value =  leftBorder + (int) (Math.random() * rightBorder);

            long start = System.nanoTime();

            linkedList.add(i, value);

            long finish = System.nanoTime();
            long elapsed = finish - start;

            System.out.println(i + "th " + "add " + elapsed  + " ns");
        }

        globalFinishLinkL = System.nanoTime();
        globalElapsedLinkL = globalFinishLinkL - globalStartLinkL;

        globalStartArrL = System.nanoTime();

        for (int i = 0; i < arrListLenght;i++)
        {
            int value =  leftBorder + (int) (Math.random() * rightBorder);

            long start = System.nanoTime();

            arrayList.add(i, value);

            long finish = System.nanoTime();
            long elapsed = finish - start;

            System.out.println(i + "th " + "add " + elapsed  + " ns");
        }

        globalFinishArrL = System.nanoTime();
        globalElapsedArrL = globalFinishArrL - globalStartArrL;

        addArrL = globalElapsedArrL / 1000000;;
        addLinkL = globalElapsedLinkL / 1000000;;

        System.out.println("\nTotal time for Array List = " + globalElapsedArrL + " ns, or ~ " + globalElapsedArrL / 1000000 + " ms"
                + "\nTotal time for Linked List = "  + globalElapsedLinkL  + " ns, or ~ " + globalElapsedLinkL/ 1000000 + " ms");

    }

    /*
    * initialization of the collection, for a private call, that is, a method call, without a pre-called arrList_ADD method.
    * In other words, filling in an empty array to demonstrate
    */
    public void arrListGet(boolean way)
    {
        if (way == true) {
            randomInit();
        }
        arrList_GET();
    }
    /*
    * Summary
    * In this method, the next value is taken from the arrList. Inside the loop, the get() method is called and the time
    * spent on a single method call is output and the total time is output
    * @param start - start of the iteration count
    * @param number - curr value from collection
    * @param finish - finish of the iteration count
    * @param elapsed - time spent processing the method
    */
    private void arrList_GET()
    {
        System.out.println("\n 2. ArrayList get - tests");

        globalStartLinkL = System.nanoTime();

        for (int i = 0; i < arrListLenght;i++)
        {
            long start = System.nanoTime();

            int number = linkedList.get(i);

            long finish = System.nanoTime();
            long elapsed = finish - start;

            System.out.println(i + "th " + "add " + elapsed  + " ns");
        }

        globalFinishLinkL = System.nanoTime();
        globalElapsedLinkL = globalFinishLinkL - globalStartLinkL;

        // System.out.println("\nTotal time for Linked List = " + globalElapsedLinkL  + " ns, or ~ " + globalElapsedLinkL / 1000000 + " ms");

        globalStartArrL = System.nanoTime();

        for (int i = 0; i < arrListLenght;i++)
        {
            long start = System.nanoTime();

            int number = arrayList.get(i);

            long finish = System.nanoTime();
            long elapsed = finish - start;

            System.out.println(i + "th " + "add " + elapsed  + " ns");
        }

        globalFinishArrL = System.nanoTime();
        globalElapsedArrL = globalFinishArrL - globalStartArrL;

        getArrL = globalElapsedArrL / 1000000;
        getLinkL = globalElapsedLinkL / 1000000;

        System.out.println("\nTotal time for Array List = " + globalElapsedArrL + " ns, or ~ " + globalElapsedArrL / 1000000 + " ms"
                + "\nTotal time for Linked List = "  + globalElapsedLinkL  + " ns, or ~ " + globalElapsedLinkL/ 1000000 + " ms");

    }

    /*
     * initialization of the collection, for a private call, that is, a method call, without a pre-called arrList_ADD method.
     * In other words, filling in an empty array to demonstrate
     */
    public void arrListRemove(boolean way)
    {
        if (way == true) {
            randomInit();
        }
        arrList_REMOVE();
    }
    /*
    * Summary
    * In this method, the value is removed from the array and the memory cells are shifted using the method remove()
    * and the total time is output
    * */
    private void arrList_REMOVE() {
        System.out.println("\n 3. ArrayList & LinkedList remove - tests");

        globalStartLinkL = System.nanoTime();

        for (int i = 0; i < arrListLenght / 2 - 1;i++)
        {
            long start = System.nanoTime();

            linkedList.remove(i);

            long finish = System.nanoTime();
            long elapsed = finish - start;

            System.out.println(i + "th " + "add " + elapsed  + " ns");
        }

        globalFinishLinkL = System.nanoTime();
        globalElapsedLinkL = globalFinishLinkL - globalStartLinkL;

        // System.out.println("\nTotal time for Linked List = " + globalElapsedLinkL  + " ns, or ~ " + globalElapsedLinkL / 1000000 + " ms");

        globalStartArrL = System.nanoTime();

        for (int i = 0; i < arrListLenght / 2 - 1;i++)
        {
            long start = System.nanoTime();

            arrayList.remove(i);

            long finish = System.nanoTime();
            long elapsed = finish - start;

            System.out.println(i + "th " + "add " + elapsed  + " ns");
        }

        globalFinishArrL = System.nanoTime();
        globalElapsedArrL = globalFinishArrL - globalStartArrL;

        removeArrL = globalElapsedArrL / 1000000;
        removeLinkL = globalElapsedLinkL / 1000000;

        System.out.println("\nTotal time for Array List = " + globalElapsedArrL + " ns, or ~ " + globalElapsedArrL / 1000000 + " ms"
                + "\nTotal time for Linked List = "  + globalElapsedLinkL  + " ns, or ~ " + globalElapsedLinkL/ 1000000 + " ms");

    }


    /*
     * initialization of the collection, for a private call, that is, a method call, without a pre-called arrList_ADD method.
     * In other words, filling in an empty array to demonstrate
     */
    public void arrListSet(boolean way)
    {
        if (way == true)
        {
            randomInit();
        }
        arrList_SET();
    }

    /*
    * Summary
    * In this method the value is placed in the array and the memory cells are shifted using the set method
    * and the total time is output
    * @param start - start of the iteration count
    * @param value - value for cells of collection
    * @param finish - finish of the iteration count
    * @param elapsed - time spent processing the method
    * */
    private void arrList_SET()
    {
        System.out.println("\n 4. ArrayList & LinkedList set - tests");

        globalStartLinkL = System.nanoTime();

        for (int i = 0; i < arrListLenght;i++)
        {
            long start = System.nanoTime();

            int value = 666;
            linkedList.set(i, value);

            long finish = System.nanoTime();
            long elapsed = finish - start;

            System.out.println(i + "th " + "add " + elapsed  + " ns");
        }

        globalFinishLinkL = System.nanoTime();
        globalElapsedLinkL = globalFinishLinkL - globalStartLinkL;

        // System.out.println("\nTotal time for Linked List = " + globalElapsedLinkL  + " ns, or ~ " + globalElapsedLinkL / 1000000 + " ms");

        globalStartArrL = System.nanoTime();

        for (int i = 0; i < arrListLenght;i++)
        {
            long start = System.nanoTime();

            int value = 666;
            arrayList.set(i, value);

            long finish = System.nanoTime();
            long elapsed = finish - start;

            System.out.println(i + "th " + "add " + elapsed  + " ns");
        }

        globalFinishArrL = System.nanoTime();
        globalElapsedArrL = globalFinishArrL - globalStartArrL;

        setArrL = globalElapsedArrL / 1000000;
        setLinkL = globalElapsedLinkL / 1000000;

        System.out.println("\nTotal time for Array List = " + globalElapsedArrL + " ns, or ~ " + globalElapsedArrL / 1000000 + " ms"
                + "\nTotal time for Linked List = "  + globalElapsedLinkL  + " ns, or ~ " + globalElapsedLinkL/ 1000000 + " ms");
    }

    /*
    * This method fills the array with random values used for a modular (separate) call to a single method
    * @param leftBorder - the extreme minimum value for randomness
    * @param rightBorder - the extreme maximum value for randomness
    * @param value - variable for random number from 0 to 5000
    * */
    private void randomInit()
    {
        int leftBorder = 0;
        int rightBorder = 5000;

        for (int i = 0; i < arrListLenght;i++)
        {
            int value =  leftBorder + (int) (Math.random() * rightBorder);
            arrayList.add(i, value);
            linkedList.add(i, value);
        }


    }


}
