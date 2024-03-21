/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageyourmusic;

/**
 *
 * @author pylyp
 */
public class DoublylinkedList<T> {
    protected DoublyLinkedNode<T> head;
    protected DoublyLinkedNode<T> tail;
    protected int size;

    public DoublylinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addLast(T data) {
        DoublyLinkedNode<T> newNode = new DoublyLinkedNode<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void remove(T data) {
        DoublyLinkedNode<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                } else if (current == head) {
                    head = head.next;
                    head.prev = null;
                } else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return;
            }
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void printList() {
        DoublyLinkedNode<T> current = head;
        while (current != null) {
            System.out.println(current.data.toString());
            current = current.next;
        }
    }

    public DoublyLinkedNode<T> getHead() {
        return head;
    }

    public DoublyLinkedNode<T> getTail() {
        return tail;
    }

    public static class DoublyLinkedNode<T> {
        T data;
        DoublyLinkedNode<T> prev;
        DoublyLinkedNode<T> next;

        public DoublyLinkedNode(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public DoublyLinkedNode<T> getPrev() {
            return prev;
        }

        public DoublyLinkedNode<T> getNext() {
            return next;
        }
    }
    
}
