package org.hine.easy.util;

public class DoublyListNode {

    public int val;
    public DoublyListNode prev;
    public DoublyListNode next;

    public DoublyListNode() {}
    public DoublyListNode(int val) {
        this.val = val;
    }

    public DoublyListNode(int val, DoublyListNode next) {
        this.val = val;
        this.next = next;
    }

    public DoublyListNode(int val, DoublyListNode next, DoublyListNode prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public DoublyListNode getPrev() {
        return prev;
    }

    public void setPrev(DoublyListNode prev) {
        this.prev = prev;
    }

    public DoublyListNode getNext() {
        return next;
    }

    public void setNext(DoublyListNode next) {
        this.next = next;
    }
}
