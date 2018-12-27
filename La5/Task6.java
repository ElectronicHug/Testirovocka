package com.company;
import java.lang.*;


public class Task6 {

        public static void main(String[] args)
        {
            String input = "pesisobaka";
            System.out.print(input + "\n");

            char[] reversed = input.toCharArray();

            for (int i = reversed.length-1; i>=0; i--)
                System.out.print(reversed[i]);
        }
    }

