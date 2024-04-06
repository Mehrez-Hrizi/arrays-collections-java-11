package com.mehrez;

import java.util.*;
import java.util.stream.Collectors;

public class QueueMain {

    public static void main(String ...args) {

        Queue<Mountain> mountains = new PriorityQueue<>((o1, o2) -> o2.getHeight() - o1.getHeight());
        mountains.add(new Mountain("m1", 1547));
        mountains.add(new Mountain("m2", 2547));
        mountains.add(new Mountain("m3", 547));
        assert mountains.peek() != null;
        System.out.println(mountains.peek().getName());
        System.out.println(mountains.stream().map(Mountain::getHeight).collect(Collectors.toList()));

        Queue<Integer> integers = new PriorityQueue<>(Comparator.reverseOrder());
        integers.add(2); integers.add(5); integers.add(3);
        while (!integers.isEmpty()) {
            System.out.println(integers.poll()); // Poll removes and returns the highest priority element
        }

        Deque<Mountain> mountainDQueue = new ArrayDeque<>();
        mountainDQueue.push(new Mountain("m1", 1547));
        mountainDQueue.push(new Mountain("m2", 2547));
        mountainDQueue.add(new Mountain("m3", 547));
        System.out.println(mountainDQueue.peek() != null ? mountainDQueue.peek().getName() : null);
    }
}
