package com.ds.practice.queue;


public class CustomQueue<T> {

    Object[] array;
    int first;
    int last;
    static final int DEFAULT_SIZE = 10;

    public CustomQueue() {
        array = new Object[DEFAULT_SIZE];
    }

    public static void main(String[] args) {
        CustomQueue<Integer> queue = new CustomQueue<>();
        queue.add(10);
        queue.add(11);
        queue.add(12);
        queue.add(13);
        queue.add(14);
        queue.add(15);

        queue.printQueue();
        System.out.println("Remove  "+ queue.remove());
        queue.printQueue();

    }

    public void add(T value){
        if(last == 0){
            array[first] = value;
            last++;
            return;
        }

        array[last] = value;
        last++;
    }

    public T peek(){
        return (T) array[last - 1];
    }

    public T remove(){
        T test = (T) array[first];
        first++;
        return test;
    }

    public void printQueue(){
        for (int i = first; i < last; i++) {
            System.out.println(array[i]);
        }
    }


}
