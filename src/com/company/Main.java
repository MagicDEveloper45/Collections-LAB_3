package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void ShowResult()
    {
        LinkedListTests linkedListTests = new LinkedListTests();
        ArrListTests arrListTests = new ArrListTests();

        linkedListTests.ShowResult();
        arrListTests.ShowResult();

        System.out.println("\nResult");
        System.out.println("* Add: \n ArrayList: " + arrListTests.add + " ms, LinkedList " + linkedListTests.add + " ms" );
        System.out.println("* Get: \n ArrayList: " + arrListTests.get + " ms, LinkedList " + linkedListTests.get + " ms");
        System.out.println("* Clone: \n ArrayList: " + arrListTests.clone + " ns, LinkedList " + linkedListTests.clone + " ns" );
        System.out.println("* Set: \n ArrayList: " + arrListTests.set + " ns, LinkedList " + linkedListTests.set + " ns");
        System.out.println("* Remove: \n ArrayList: " + arrListTests.remove + " ms, LinkedList " + linkedListTests.remove + " ms");
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choose;

        do {
            System.out.println("Choose type of collection \n* ArrayList - 1\n* LinkedList - 2\n* Show result - 3 \ninput:");
            choose = Integer.parseInt(in.nextLine());
        }while (choose <=0 && choose >=4);

        switch (choose)
        {
            case 1:
            {
                ArrListTests problem1 = new ArrListTests();
                do {
                    System.out.println("Choose method: \n*add - 1 \n*get - 2 \n*clone - 3 \n*remove - 4 \n*set - 5 \n*result - 6 ");
                    choose = Integer.parseInt(in.nextLine());
                }while (choose <= 0 && choose >= 7);

                switch (choose)
                {
                    case 1: problem1.arrList_ADD(); break;
                    case 2: problem1.arrListGet(true); break;
                    case 3: problem1.arrListClone(true); break;
                    case 4: problem1.arrListRemove(true); break;
                    case 5: problem1.arrListSet(true); break;
                    case 6: problem1.ShowResult(); break;
                    default: return;
                }
                break;

            }
             case 2:
             {
                 LinkedListTests problem2 = new LinkedListTests();
                 do {
                     System.out.println("Choose method: \n* add - 1 \n* get - 2 \n* clone - 3 \n* remove - 4 \n* set - 5 \n* result - 6 ");
                     choose = Integer.parseInt(in.nextLine());
                 }while (choose <= 0 && choose >= 7);

                 switch (choose)
                 {
                     case 1: problem2.arrList_ADD(); break;
                     case 2: problem2.arrListGet(true); break;
                     case 3: problem2.arrListClone(true); break;
                     case 4: problem2.arrListRemove(true); break;
                     case 5: problem2.arrListSet(true); break;
                     case 6: problem2.ShowResult(); break;
                     default: return;
                 }
                 break;
             }
             case 3: {
                 ShowResult();
                 break;
             }
        default: return;
        }





    }
}
