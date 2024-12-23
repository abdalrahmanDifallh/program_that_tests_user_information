package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner myScanner = new Scanner(System.in);
        String answer;
        int count = 0;

        String questions[][] = {
                {"q1-what is your name", "a.abd", "b.ali", "b.ahmad","a"},
                {"q2-how old yor", "a.12", "b.11", "c.5", "b"},
                {"q3-how tall you ", "a.150 cm ", "b.170 cm ", "c.180 cm", "a"},
                {"q4-what is your city name ", "a.Damascus ", "b.Homs ", "c.Aleppo", "c"},
        };
        for (int i = 0; i < questions.length; i++) {
            for (int j = 0; j < (questions[i].length) - 1; j++) {
                System.out.println(questions[i][j]);
            }
            System.out.println("Pleas Enter the a or b or c for the answer : ");
            answer = myScanner.next();
            System.out.println(answer);
            System.out.println(questions[i][4]);
            if (questions[i][4].equals(answer)) {
                System.out.println("The ans is true !");
                count++;
            }
            else System.out.println("The ans is false !");
        }
        System.out.println();
        System.out.println("The user Score is " +  (questions.length) + "/" + count);
    }
}