package com.company;

import java.util.Scanner;

public class Main {

    /*
    * Summary
    * Comparison of collection performance
    * */
    public static void ShowResult()
    {
        CollectionsTest collectionsTest = new CollectionsTest();
        collectionsTest.ShowResult();
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choose;

        do {
            System.out.println("Choose type of test \n* Select test - 1\n* Show result - 2 \ninput:");
            choose = Integer.parseInt(in.nextLine());
        }while (choose <=0 && choose >=3);

        switch (choose)
        {
             case 1:
             {
                 CollectionsTest problem2 = new CollectionsTest();
                 do {
                     System.out.println("Choose method: \n* get -  1\n* remove - 2 \n* set - 3");
                     choose = Integer.parseInt(in.nextLine());
                 }while (choose <= 0 && choose >= 4);

                 switch (choose)
                 {
                     case 1: problem2.modulListGet(); break;
                     case 2: problem2.modulListRemove(); break;
                     case 3: problem2.modulListSet(); break;
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
