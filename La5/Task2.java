package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class Task2 {
        public static void main(String[] args){
                ArrayList alpha = new ArrayList();
                for(int i=0;i<150;i++)
                {
                    int k = (int) Math.floor(Math.random() * 200);
                    alpha.add(k);
                }
                System.out.println(alpha);
                Collections.sort(alpha);
                Collections.reverse(alpha);
                ArrayList beta = new ArrayList();
                for(int i = 0; i<15;i++)
                {
                    beta.add(alpha.get(i));

                }
                System.out.println(beta);
        }
    }