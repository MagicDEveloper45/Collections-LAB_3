package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
  * @author Igor Lukin, github - MagicDEveloper45
  * Class for demonstrating the time spent on calling methods for the LinkedList collection
 */

public class CollectionsTest {

    List<Integer> linkedList = new LinkedList<Integer>();
    List<Integer> arrayList = new ArrayList<Integer>();

    public final int arrListLenght = 1000; // length of array

    private long globalStart, globalFinish; // variables that store the starting, final, and elapsed time to execute each method in a specified amount

    public long TotalTimeLinkedList, TotalTimeArrayList;// variables that store the total time spent on the corresponding methods

   /*
    * Summary
    * Output of the time spent on each method
    */
    public void ShowResult()
    {
        System.out.println("\nResult");

        TotalTimeLinkedList = arrListAdd(linkedList);
        TotalTimeArrayList = arrListAdd(arrayList);
        System.out.println("* Add: \n LinkedList= " + TotalTimeLinkedList + " ns " + "ArrayList = " + TotalTimeArrayList + " ns" );

        TotalTimeLinkedList = arrListGet(linkedList);
        TotalTimeArrayList = arrListGet(arrayList);
        System.out.println("* Get: \n LinkedList= " + TotalTimeLinkedList + " ns " + "ArrayList = " + TotalTimeArrayList + " ns");

        TotalTimeLinkedList = arrlistSet(linkedList);
        TotalTimeArrayList = arrlistSet(arrayList);
        System.out.println("* Set: \n LinkedList= " + TotalTimeLinkedList + " ms " + "ArrayList = " + TotalTimeArrayList + " ms" );

        TotalTimeLinkedList =  arrListRemove(linkedList);
        TotalTimeArrayList = arrListRemove(arrayList);
        System.out.println("* Remove: \n LinkedList= " + TotalTimeLinkedList + " ns " + "ArrayList = " + TotalTimeArrayList + " ns");

    }

    /*
    * Summary
    * In this method, the List is filled with random values. Finally calculated total time for all calls add method
    * @param leftBorder - the extreme minimum value for randomness
    * @param rightBorder - the extreme maximum value for randomness
    * @param value - variable for random number from 0 to 5000
     */

    public long arrListAdd(List<Integer> list)
    {
        int leftBorder = 0;
        int rightBorder = 5000;

        int value =  leftBorder + (int) (Math.random() * rightBorder);

        globalStart = System.nanoTime();

        for (int i = 0; i < arrListLenght;i++)
        {
            list.add(i, value);
        }

        globalFinish = System.nanoTime();

        return globalFinish - globalStart;
    }

    /*
    * initialization of the collection, for a private call, that is, a method call, without a pre-called arrListAdd method.
    * In other words, filling in an empty array to demonstrate
    */
    public void modulListGet()
    {
        randomInit();
        arrListGet(linkedList);
        arrListGet(arrayList);
    }
    /*
    * Summary
    * In this method, the next value is taken from the List. Inside the loop, the get() method is called and the time
    * spent on the total time is output
    * @param number - curr value from collection
    */
    private long arrListGet(List<Integer> list)
    {
        globalStart = System.nanoTime();

        // Test arraylist.get
        for (int i = 0; i < arrListLenght;i++)
        {
            int number = list.get(i);
        }

        globalFinish = System.nanoTime();

        return  globalFinish - globalStart;
    }

    /*
     * initialization of the collection, for a private call, that is, a method call, without a pre-called arrList_ADD method.
     * In other words, filling in an empty array to demonstrate
     */
    public void modulListRemove()
    {
        randomInit();
        arrListRemove(linkedList);
        arrListRemove(arrayList);
    }
    /*
    * Summary
    * In this method, the value is removed from the array and the memory cells are shifted using the method remove()
    * and the total time is output
    * */
    private long arrListRemove(List<Integer> list) {

        globalStart = System.nanoTime();

        for (int i = 0; i < arrListLenght / 2 - 1; i++)
        {
            list.remove(i);
        }

        globalFinish = System.nanoTime();

        return  globalFinish - globalStart;

    }

    /*
     * initialization of the collection, for a private call, that is, a method call, without a pre-called arrList_ADD method.
     * In other words, filling in an empty array to demonstrate
     */
    public void modulListSet()
    {
        randomInit();
        arrlistSet(linkedList);
        arrlistSet(arrayList);
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
    private long arrlistSet(List<Integer> list)
    {
        globalStart = System.nanoTime();
        int value = 666;

        // Test arraylist.set
        for (int i = 0; i < arrListLenght / 2 - 1; i++)
        {
            list.set(i, value);
        }

        globalFinish = System.nanoTime();

        return  globalFinish - globalStart;
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
            linkedList.add(i, value);
        }

        for (int i = 0; i < arrListLenght;i++)
        {
            int value =  leftBorder + (int) (Math.random() * rightBorder);
            arrayList.add(i, value);
        }
    }


}
