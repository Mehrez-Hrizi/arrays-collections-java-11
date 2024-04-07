# Java SE 11 Study Guide and Resources - Arrays, Collections and Generics
Java Arrays, Collections and Generics require a wide and deep base of knowledge for developers to be successful with coding and using the Java language in solving day to day problems.
## Collection Overview Cheat Sheets

### Basic Collection Type Attributes and Characterists
You should be able to answer the following questions about each core Collection type

|     | Elements Ordered?   | Allows Duplicates? | Elements Added/Removed in a Certain Order? | Allows Key/Values? |
|-----|---------------------|--------------------|--------------------------------------------|--------------------|
|List | Yes - Numbered Index| Yes                | No                                         | No                 |
|Set  | No                  | No                 | No                                         | No                 |
|Queue| Yes - Placed Order  | Yes                | Yes                                        | No                 |
|Map  | No                  | Yes - Values only  | No                                         | Yes                |


### Specific Collection Type Attributes and Characterists
You should be able to answer the following questions about each Collection implementation provided by Java

| Java Type| Parent Interface Type | Allows null? | Elements Sorted? | Uses hashCode? | Uses compareTo? |
|----------|-----------------------|--------------|------------------|----------------|-----------------|
|ArrayList | List                  | Yes          | No               | No             | No              |
|LinkedList| List and Queue        | Yes          | No               | No             | No              |
|HashSet   | Set                   | Yes          | No               | Yes            | No              |
|TreeSet   | Set                   | No           | Yes              | No             | Yes             |
|HashMap   | Map                   | Yes          | No               | Yes            | No              |
|TreeMap   | Map                   | No           | Yes              | No             | Yes             |

## Array Cheat Sheets

### Comparison Overview
You should be understand the differences between equals, compare and mismatch

| Method        | Arrays the Same?     | Arrays are Different?                 |
|---------------|----------------------|---------------------------------------|
|equals         | true - memory address| false                                 |
|Arrays.equals  | true                 | false                                 |
|Arrays.compare | 0                    | negative - smaller, positive - bigger |
|Arrays.mismatch| -1                   | index where arrays begin to differ    |


### Arrays Compare Rules
Comparison is done by Comparators and this table will help with the rules around using compare()

| Array 1             | Array 2               | Result       | Why?                                              |
|---------------------|-----------------------|--------------|---------------------------------------------------|
|int[] {1,2,3}        | int[] {1,2,3}         | 0            | arrays are an exact match                         |
|int[] {1,2,3}        | int[] {1,2}           | > 0, positive| array 1 has more elements                         |
|int[] {1,2}          | int[] {1,2,3}         | < 0, negative| array 1 has less elements                         |
|String[] {"abcdefg"} | String[] {"abcdefg"}  | 0            | arrays are an exact match                         |
|String[] {"abc"}     | String[] {"abcdefg"}  | < 0, negative| array1 is a substring of array 2                  |
|String[] {"abcdefg"} | String[] {"abc"}      | > 0, positive| array2 is a substring of array 1                  |
|String[] {"abcdefg"} | String[] {"ABCDEFG"}  | > 0, positive| Upper case is treated as smaller than lower case  |
|String[] {"ABCDEFG"} | String[] {"abcdefg"}  | < 0, negative| Upper case is treated as smaller than lower case  |
|String[] {"abcdefg"} | String[] {null}       | > 0, positive| null is smaller than any character value          |
|String[] {null}      | String[] {"abcdefg"}  | < 0, negative| null is smaller than any character value          |
|int[] {1,2,3}        | String[] {"abcdefg"}  | compile error| arrays must be the same data type to compare      |


## List Cheat Sheets
### ArrayList methods to Know

| Method        | Return Type          | Parameters                            |
|---------------|----------------------|---------------------------------------|
|add()          | boolean              | (E element) or (int index, E element) |
|remove()       | boolean or E         | (Object object) or (int index)        |
|set()          | E                    | (int index, E newElement)             |
|isEmpty()      | boolean              | none                                  |
|size()         | int                  | none                                  |
|clear()        | void                 | none                                  |
|contains()     | boolean              | (Object object)                       |
|equals()       | boolean              | (Object object)                       |


### List methods to Know

| Method        | Return Type          | Parameters                            |
|---------------|----------------------|---------------------------------------|
|add()          | boolean              | (E element) or (int index, E element) |
|remove()       | boolean or E         | (Object object) or (int index)        |
|isEmpty()      | boolean              | none                                  |
|size()         | int                  | none                                  |
|clear()        | void                 | none                                  |
|contains()     | boolean              | (Object object)                       |
|removeIf()     | boolean              | (Predicate<? super E> filter)         |
|forEach()      | void                 | (Consumer<? super T> action)          |
|replaceAll()   | void                 | (UnaryOperator<E> op)                 |


### Creating Lists

| Method                | Info                            | Add Elements?| Remove Elements? | Replace Elements? |
|-----------------------|---------------------------------|--------------|------------------|-------------------|
|Arrays.asList(varargs) | Fixed size list                 | No           | No               | Yes               |
|List.of(varargs)       | Immutable                       | No           | No               | No                |
|List.copyOf(collection)| Immutable with given collection | No           | No               | No                |

## Queue Cheat Sheets
### Queue methods to Know

| Method        | Return Type          | Parameters                            |
|---------------|----------------------|---------------------------------------|
|add()          | boolean              | (E element)                           |
|remove()       | boolean              | (Object object)                       |
|isEmpty()      | boolean              | none                                  |
|size()         | int                  | none                                  |
|element()      | E                    | none                                  |
|offer()        | boolean              | (E element)                           |
|poll()         | E                    | none                                  |
|peek()         | E                    | none                                  |

## Set Cheat Sheets
### Set methods to Know

| Method        | Return Type          | Parameters                            |
|---------------|----------------------|---------------------------------------|
|add()          | boolean              | (E element)                           |
|remove()       | boolean              | (Object object)                       |
|isEmpty()      | boolean              | none                                  |
|size()         | int                  | none                                  |
|clear()        | void                 | none                                  |
|contains()     | boolean              | (Object object)                       |
|equals()       | boolean              | (Object object)                       |
|hashCode()     | int                  | none                                  |


### Creating Sets

| Method                | Info                            | Add Elements?| Remove Elements? | Replace Elements? |
|-----------------------|---------------------------------|--------------|------------------|-------------------|
|Set.of(varargs)        | Immutable                       | No           | No               | No                |
|Set.copyOf(collection) | Immutable with given collection | No           | No               | No                |