package com.nopopay;

public class Node<T> {
    T data;
    Node prev, next;

    public Node(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
