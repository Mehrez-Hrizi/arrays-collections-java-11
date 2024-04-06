package com.mehrez;

import java.util.*;
import java.util.stream.Collectors;

public class ListMain {
    public static void main(String ...args) {

        //These three declarations are all pre Java 5.0, they're not using generics
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList1 = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList(arrayList1);

        ArrayList<String> colors = new ArrayList<>();
        //when using collections, it's often best practice to reference the class by its parent interface rather than the implementation.
        // This helps prevent tightly coupled code.
        List<String> colors1 = new ArrayList<>();

        Collection<String> colors2 = new ArrayList<>();  //valid declaration because Collection is the parent interface for all collections

        /*ArrayList<String> = new Collection<>();*/ //invalid code, There's really two reasons for this.
        // One, you can't instantiate an interface, and Collection is an interface.
        // And second, you can't instantiate a parent from a more specific generic typing.

        colors.add("red");
        colors.add("blue");
        colors.add("black");
        colors.replaceAll(s -> s + "color");

        for (int i = 0; i < colors.size(); i++) {
            colors.remove(i);
        }
        System.out.println(colors);  //[bluecolor]


        /*colors.forEach(color -> colors.remove(color));*/  //Exception in thread "main" java.util.ConcurrentModificationException
                                                            // at java.base/java.util.ArrayList.forEach(ArrayList.java:1543)

        Object[] colorsObj = colors.toArray();  //we get a compilation error if we replace Object with String
        String[] colorsStrings = colors.toArray(new String[0]); //If you wanted to keep the colors as strings, you could use this.
                                                                // This method will actually try to use the array passed in to populate the ArrayList elements.
                                                                // If it's not big enough to hold the list elements, it simply creates a new one.
                                                                // In this case, we passed in a 0 length array, and a new array would have been created and returned.

        String[] shapes = new String[] {"square", "circle", "triangle"};
        List<String> shapesList = Arrays.asList(shapes);
        System.out.println(shapesList.getClass().getName());   //java.util.Arrays$ArrayList
                                                               //You might think that this is an actual ArrayList,
                                                               // but note that this is an inner class of Arrays. Arrays is the outer class,
                                                               // and ArrayList type is the inner class.
        System.out.println(colors.getClass().getName()); //java.util.ArrayList
        // When you call Arrays.asList, it returns a fixed size list that matches your string or array that you passed in.
        // You can change out the elements, but you can't remove any elements from the list.
        // So this type of list isn't quite immutable, meaning that you can't change it at all, but it is a different flavor of ArrayList than we're used to.

        List immutableShapes = List.of(shapes);  //he Java List interface defines a static method called of.
                                                // This returns a list, but it's also a special type of list. This is an actual immutable list,
                                                // meaning it can't be changed at all
       /* immutableShapes.add("rectangle");*/   //Exception in thread "main" java.lang.UnsupportedOperationException
                                                // at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:72)


        //how do you actually create just a normal ArrayList from a basic Java array? Hopefully,
        // you might have guessed that you have to do it the old-fashioned, difficult way.
        // You simply loop through the array and add the elements to an ArrayList one at a time.
        List<String> normalShapesList = new ArrayList<>(Arrays.asList(shapes));
        normalShapesList.remove("circle");
        System.out.println(normalShapesList); //[square, triangle]

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        linkedList.addFirst("four");
        linkedList.addLast("five");
        System.out.println(linkedList);  //[four, one, two, three, five]
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);  //[one, two, three]

        List<Integer> numList = new ArrayList<>();
        numList.add(15);numList.add(15);numList.add(7);numList.add(1);numList.add(12);
        Collections.sort(numList);
        System.out.println(numList);  //[1, 7, 12, 15, 15]

        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("m1", 1547));
        mountains.add(new Mountain("m2", 2547));
        mountains.add(new Mountain("m3", 547));
        Collections.sort(mountains);
        System.out.println(mountains.stream()
               .map(Mountain::getName)
               .collect(Collectors.toList())
       ); //[m3, m1, m2]

        /*
        *  Comparator<Mountain> comparator = new Comparator<Mountain>() {
            @Override
            public int compare(Mountain o1, Mountain o2) {
                return o2.getHeight() - o1.getHeight();
            }
        };
        * */
        Comparator<Mountain> comparator = (o1, o2) -> o2.getHeight() - o1.getHeight();
        mountains.sort(comparator);  //Collections.sort(mountains, comparator);
        System.out.println(mountains.stream()
                .map(Mountain::getName)
                .collect(Collectors.toList())
        ); //[m2, m1, m3]



    }
}
