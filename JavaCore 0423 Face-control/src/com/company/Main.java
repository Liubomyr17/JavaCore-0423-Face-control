package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {

    public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();
    int age = Integer.parseInt(reader.readLine());
    if (age > 20)
        System.out.println("good");

    }
   }