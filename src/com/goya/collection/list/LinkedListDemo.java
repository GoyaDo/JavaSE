package com.goya.collection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author goya
 * @create 2021-04-18 12:44
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> staff = new LinkedList<>();
        staff.add("Ammy");
        staff.add("Bob");
        staff.add("Carl");
//        ListIterator<String> iterator = staff.listIterator();
//        iterator.next();
//        iterator.add("Juliet");
//        System.out.println(staff);
//
//        ListIterator<String> iterator1 = staff.listIterator();
//        String oldValue = iterator1.next();
//        iterator1.set("aaa");
//        System.out.println(staff);
//
//
//        ListIterator<String> iter1 = staff.listIterator();
//        ListIterator<String> iter2 = staff.listIterator();
//
//        iter1.next();
//        iter1.remove();
//        iter2.next(); // Exception in thread "main" java.util.ConcurrentModificationException
        ListIterator<String> iterator = staff.listIterator();
//        iterator.next(); // [Bob, Carl]
//        iterator.next(); // [Ammy, Carl]
//        iterator.remove();
//        System.out.println(staff);
        System.out.println(iterator.nextIndex());
        iterator.next();
        System.out.println(iterator.nextIndex());
//        iterator.remove();
//        System.out.println(staff);
        iterator.next();
        System.out.println(iterator.nextIndex());
        iterator.next();
        System.out.println(iterator.nextIndex());
        System.out.println("-------");
        System.out.println(iterator.previousIndex());
        iterator.previous();

        System.out.println(iterator.previousIndex());
        iterator.previous();
        System.out.println(iterator.previousIndex());
        iterator.previous();
        System.out.println(iterator.previousIndex());

//        System.out.println(iterator.previousIndex());
////        System.out.println(staff.size());
//        for (int i = 0; i < staff.size(); i++) {
//            System.out.println(iterator.previousIndex());
//            if (iterator.hasPrevious()) {
//                iterator.previous();
//                iterator.remove();
//                System.out.println(staff);
//            }
//        }

//        iterator.previous();
//        iterator.previous();
//        iterator.remove();
//        System.out.println(staff);


    }
}
