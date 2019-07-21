package com.example.javapractice;

public class ExampleThree {


   public void testExample3() {

       int a[][] = new int[3][];
       a[1] = new int[]{1,2,3};
       a[2] = new int [] {4,5};
       System.out.println(a[1][1]);

    }

    public void testExample3(String s){

       String first = s;
       first.concat("SE 6");
        System.out.println(first);
       first.replace('6','7');
       System.out.println(first);

    }
    public void testExampleAgain(String s){

        String str = s ;
        s.concat("SE 6");
        s.toLowerCase();
        System.out.println(s);

    }
}

