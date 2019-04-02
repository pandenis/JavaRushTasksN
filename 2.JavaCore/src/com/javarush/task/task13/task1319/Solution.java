package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            FileWriter writer = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(writer);

            String s = reader.readLine();
            if (!(s.equals("exit"))) {
                System.out.println("s  " + s);
                bw.write(s + "\n");
                s = reader.readLine();
            } else {
                bw.write(s + "\n");
                bw.close();
            }


        } catch (Exception e) {

        }
    }
}
