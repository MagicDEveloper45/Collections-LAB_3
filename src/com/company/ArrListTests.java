package com.company;

import java.util.ArrayList;

/*
 * @author Igor Lukin, github - MagicDEveloper45
 * Class for demonstrating the time spent on calling methods for the LinkedList collection
 */


public class ArrListTests {

     ArrayList<Integer> arrayList = new ArrayList<>();

     private final int arrListLenght = 1000;

     private long globalStart, globalFinish, globalElapsed;
     public long add, get, clone, set, remove;

    /*Summary
     * Output of the time spent on each method
     */
     public void ShowResult()
     {
         arrList_ADD();
         arrList_GET();
         arrList_CLONE();
         arrList_SET();
         arrList_REMOVE();

         System.out.println("\nResult");
         System.out.println("* Add: " + add + " ms");
         System.out.println("* Get: " + get + " ms");
         System.out.println("* Clone: " + clone + " ns");
         System.out.println("* Set: " + set + " ns");
         System.out.println("* Remove: " + remove + " ms");


     }

    /* Summary
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
         System.out.println("\n 1. ArrayList add - tests");
         globalStart = System.nanoTime();

         int leftBorder = 0;
         int rightBorder = 5000;

         for (int i = 0; i < arrListLenght;i++)
         {
             int value =  leftBorder + (int) (Math.random() * rightBorder); // taking random number from 0 to 1000

             long start = System.nanoTime();

             arrayList.add(i, value);

             long finish = System.nanoTime();
             long elapsed = finish - start;

             System.out.println(i + "th " + "add " + elapsed  + " ns");
         }

         globalFinish = System.nanoTime();
         globalElapsed = globalFinish - globalStart;

         System.out.println("\nTotal time = " + globalElapsed  + " ns, or ~ " + globalElapsed / 1000000 + " ms");

         add = globalElapsed / 1000000;

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
        globalStart = System.nanoTime();

        // Test arraylist.get
        for (int i = 0; i < arrListLenght;i++)
        {
            long start = System.nanoTime();

            int number = arrayList.get(i);

            long finish = System.nanoTime();
            long elapsed = finish - start;

            System.out.println(i + "th " + "add " + elapsed  + " ns. Number = " + number);
        }

        long globalFinish = System.nanoTime();
        long globalElapsed = globalFinish - globalStart;

        System.out.println("\nTotal time = " + globalElapsed  + " ns, or ~ " + globalElapsed / 1000000 + " ms");

        get = globalElapsed / 1000000;

    }

    /*
     * initialization of the collection, for a private call, that is, a method call, without a pre-called arrList_ADD method.
     * In other words, filling in an empty array to demonstrate
     */
    public void arrListClone(boolean way)
    {
        if (way == true) {
            randomInit();
        }
        arrList_CLONE();
    }


    /*Summary
     * In this method, one array is cloned to another and the total time is output
     */
    private void arrList_CLONE()
    {
        System.out.println("\n 3. ArrayList clone - tests");
        globalStart = System.nanoTime();

        ArrayList arrayListClone = new ArrayList<>(arrayList.size());

        // Test arraylist.get
        arrayListClone = (ArrayList)arrayList.clone();

        globalFinish = System.nanoTime();
        globalElapsed = globalFinish - globalStart;

        System.out.println("\nTotal time = " + globalElapsed  + " ns, or ~ " + globalElapsed / 1000000 + " ms");

        clone = globalElapsed;

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
        System.out.println("\n 4. ArrayList remove - tests");
        globalStart = System.nanoTime();

        // Test arraylist.remove
        for (int i = 0; i < arrListLenght / 2 - 1; i++) {
            long start = System.nanoTime();

            arrayList.remove(i);

            long finish = System.nanoTime();
            long elapsed = finish - start;

            System.out.println(i + "th " + "add " + elapsed + " ns");
        }

        globalFinish = System.nanoTime();
        globalElapsed = globalFinish - globalStart;

        System.out.println("\nTotal time = " + globalElapsed + " ns, or ~ " + globalElapsed / 1000000 + " 1ms");

        remove = globalElapsed / 1000000;

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

    /* In this method the value is placed in the array and the memory cells are shifted using the set method
     * and the total time is output
     * @param start - start of the iteration count
     * @param value - value for cells of collection
     * @param finish - finish of the iteration count
     * @param elapsed - time spent processing the method
     * */
    private void arrList_SET()
    {
        System.out.println("\n 4. ArrayList set - tests");
        globalStart = System.nanoTime();

        // Test arraylist.set
        for (int i = 0; i < arrListLenght / 2 - 1; i++) {
            long start = System.nanoTime();

            int value = 666;
            arrayList.set(i, value);

            long finish = System.nanoTime();
            long elapsed = finish - start;

            System.out.println(i + "th " + "add " + elapsed + " ns");
        }

        globalFinish = System.nanoTime();
        globalElapsed = globalFinish - globalStart;

        System.out.println("\nTotal time = " + globalElapsed + " ns, or ~ " + globalElapsed / 1000000 + " 1ms");

        set = globalElapsed;
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
            int value =  leftBorder + (int) (Math.random() * rightBorder); // taking random number from 0 to 1000
            arrayList.add(i, value);
        }
    }

}
