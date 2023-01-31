package com.bridgelabz.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.show();

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.append(56);
        linkedList2.append(30);
        linkedList2.append(70);
        linkedList2.show();


        LinkedList<Integer> linkedList3=new LinkedList<>();
        System.out.println("\n******** : Insert a node in between : *********");
        linkedList3.append(56);
        linkedList3.append(70);
        System.out.println("********** : Display linked list without insert : *********");
        linkedList3.show(); // Display Node elements
        System.out.println("******** : Display linked list insert a node in between : *******");
        linkedList3.searchAndAdd(56,30);
        linkedList3.show(); // Display Node elements

        LinkedList<Integer> linkedList4=new LinkedList<>();
        System.out.println("\n********* : Delete a Node from head using pop method : **********");
        linkedList4.push(70);
        linkedList4.push(30);
        linkedList4.push(56); // Head Node Delete
        System.out.println("********** : Display linked list without delete : *********");
        linkedList4.show();  // Display Node Elements
        System.out.println("********** : Display linked list after delete the element : *********");
        linkedList4.deleteFirstNode(); // Delete a head node
        linkedList4.show(); // Display Node Elements
    }
}
