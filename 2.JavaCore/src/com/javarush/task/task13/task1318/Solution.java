package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = bufferedReader.readLine();

            InputStream inputStream = new FileInputStream(fileName);
            StringBuilder stringBuilder = new StringBuilder();
            while (inputStream.available() > 0) {
                char c = (char)inputStream.read();
                stringBuilder.append(c);
            }

            System.out.println(stringBuilder);

            bufferedReader.close();
            inputStream.close();
            
        } catch (Exception e) {



        }



    }
}