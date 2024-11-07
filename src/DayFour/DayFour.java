package DayFour;

import java.util.Arrays;

public class DayFour {

    // TODO - Exercise 3: Sum of Numbers - välja kutsuda main meetodist

    public static void main(String[] args) {
       sumOfNumbers();
    }
        private static void sumOfNumbers() {
           int sum = 0;
           int count = 1;
           while (count <= 100) {
               sum += count;
               count++;
           }
            System.out.println(sum);
            }
        }