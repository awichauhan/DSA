/*
consists of nodes; each node consists of value and pointer(address) for next node
first node: HEAD
last node: TAIL
linked list are not sequential

searching : O(n)

insertion at end: 0(1)
insertion at beginning O(1)
insertion at middle O(n)

deletion at end: o(n)
deletion at middle o(n)
deletion at beginning o(1)
 */

import java.util.*;

public class linkedList
{
    public static void main(String a[])
    {
        LinkedList<Integer> list = new LinkedList();
        list.addLast(10);
        list.addLast(22);

        list.addFirst(34);
        list.removeLast();

        System.out.println(list);
        System.out.println(list.contains(10));   // to check if element exists in the list

        System.out.println(list.indexOf(34));

        System.out.println(list.size());

        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}