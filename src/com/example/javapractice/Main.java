package com.example.javapractice;
import scope.LoopMethodScope;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        int x =10;
//        int y = 2;
//
//        try{
//            for(int z =2 ; z >=0; z--){
//                int ans = x/z;
//                System.out.println(ans + " ");
//
//            }
//
//        }catch( Exception e1){
//            System.out.println(e1);
//    }
//        com.example.javapractice.ExampleTwo e2 = new com.example.javapractice.ExampleTwo();
//        e2.testAppend();
//
//        com.example.javapractice.ExampleThree e3 = new com.example.javapractice.ExampleThree();
//        e3.testExampleAgain("Java");
//
//        int []a = {1,2,3,4};
//        System.out.println(a instanceof Object);
//
//        int x =10;
//        int y = new com.example.javapractice.Main().change(x);
//        System.out.print(x+y);
//
//    }
//
//    int change(int x){
//
//        x =12;
//        return x;

        LoopMethodScope test = new LoopMethodScope();

        test.testScope();

        AnotherLoopTest test2 = new AnotherLoopTest();
        test2.testLoop();


   }


}
