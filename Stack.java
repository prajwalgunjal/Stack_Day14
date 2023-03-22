package com.bridgelabz.Stack;

import com.bridgelabz.linkedlist.LinkedList;

public class Stack<T> {
    LinkedList<T> linkedList = new LinkedList<T>();

    public void add(T data){
        linkedList.add(data);
    }
    public  void display(){
        linkedList.display();
    }

}
