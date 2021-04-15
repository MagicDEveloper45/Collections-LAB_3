package com.company;

import java.util.Scanner;

public class Main {

    /*
    * Summary
    * Comparison of collection performance
    * */
    public static void ShowResult()
    {
        CollectionsTests collectionsTests = new CollectionsTests();

        collectionsTests.ShowResult();

        System.out.println("\nResult");
        System.out.println("* Add: \n ArrayList: " + collectionsTests.addArrL + " ms, LinkedList " + collectionsTests.addLinkL + " ms, " + "per " + collectionsTests.arrListLenght + " iterations" );
        System.out.println("* Get: \n ArrayList: " + collectionsTests.getArrL + " ms, LinkedList " + collectionsTests.getLinkL + " ms, " + "per " + collectionsTests.arrListLenght + " iterations");
        System.out.println("* Set: \n ArrayList: " + collectionsTests.setArrL + " ns, LinkedList " + collectionsTests.setArrL + " ns, " + "per " + collectionsTests.arrListLenght / 2 + " iterations");
        System.out.println("* Remove: \n ArrayList: " + collectionsTests.removeArrL + " ms, LinkedList " + collectionsTests.removeLinkL + " ms, " + "per " + collectionsTests.arrListLenght / 2 + " iterations");
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choose;

        do {
            System.out.println("Choose type of collection \n* Type of tests - 1\n* Show result - 2 \ninput:");
            choose = Integer.parseInt(in.nextLine());
        }while (choose <=0 && choose >=4);

        switch (choose)
        {
             case 1:
             {
                 CollectionsTests problem2 = new CollectionsTests();
                 do {
                     System.out.println("Choose method: \n* add - 1 \n* get - 2 \n* remove - 3 \n* set - 4 \n* result - 5 ");
                     choose = Integer.parseInt(in.nextLine());
                 }while (choose <= 0 && choose >= 6);

                 switch (choose)
                 {
                     case 1: problem2.arrList_ADD(); break;
                     case 2: problem2.arrListGet(true); break;
                     case 3: problem2.arrListRemove(true); break;
                     case 4: problem2.arrListSet(true); break;
                     case 5: problem2.ShowResult(); break;
                     default: return;
                 }
                 break;
             }

             case 2: {
                 ShowResult();
                 break;
             }
        default: return;
        }





    }
}
