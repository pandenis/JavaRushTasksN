package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private char sex;
        private int age;
        private String nationality;
        private String address;
        private int phoneNumber;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, char sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, char sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, char sex, int age, String nationality) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.nationality = nationality;
        }

        public Human(String name, char sex, int age, String nationality, String address) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.nationality = nationality;
            this.address = address;
        }

        public Human(String name, char sex, int age, String nationality, String address, int phoneNumber) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.nationality = nationality;
            this.address = address;
            this.phoneNumber = phoneNumber;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(char sex, int age, String address) {
            this.name = "No Name";
            this.sex = sex;
            this.age = age;
            this.address = address;
        }

        public Human(int age, String nationality) {
            this.name = "No Name";
            this.age = age;
            this.nationality = nationality;
        }

        public Human(char sex, int age) {
            this.sex = sex;
            this.age = age;
        }
    }
}
