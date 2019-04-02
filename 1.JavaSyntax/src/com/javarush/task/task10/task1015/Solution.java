package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        int n = 5;
        ArrayList<String>[] list = new ArrayList[3];
        list[0] = new ArrayList<String>();
        list[0].add("string 0");

        list[1] = new ArrayList<String>();
        list[1].add("string 1");

        list[2] = new ArrayList<String>();
        list[2].add("string 2");

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}