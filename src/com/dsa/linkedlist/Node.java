package com.dsa.linkedlist;

import java.util.LinkedList;

public class Node<T> {
    public T data;
    public Node<T> next;


    public Node(T data) {
        this.data = data;
        this.next = null;


    }
}
