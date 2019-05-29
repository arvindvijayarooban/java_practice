package com.example.javapractice;

public class ExampleTwo {


void testAppend () {
    StringBuilder s1 = new StringBuilder("Java");
    String s2 = "Love";
    s1.append(s2);
    s1.substring(4);
    int foundAt = s1.indexOf(s2);
    System.out.println(foundAt);
    System.out.println(s1.substring(4));
}

}
