package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        //TODO return strings number to 10
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
        Map<Character, Integer> charsMap = new TreeMap<Character, Integer>(); //output map
        ArrayList<Character> characters = new ArrayList<>(); // list to collect all characters from strings

        //fori for enter characters to list
        for (String string : list) {
            for (int i = 0; i < string.length(); i++) {
                characters.add(string.charAt(i));
            }
        }

        for (int i = 0; i < characters.size(); i++) {
            Integer characterCount = charsMap.get(characters.get(i));
            if (characterCount == null) {
                charsMap.put(characters.get(i), 1);
            } else {
                int count = characterCount;
                count++;
                charsMap.put(characters.get(i), count);
            }
        }

        for (int i = 0; i < alphabet.size(); i++) {
            String s;
            if (charsMap.get(alphabet.get(i)) != null) {
                s = "" + alphabet.get(i) + " " + charsMap.get(alphabet.get(i));
            } else {
                s = "" + alphabet.get(i) + " 0"  ;
            }
            System.out.println(s);
        }
    }

}
