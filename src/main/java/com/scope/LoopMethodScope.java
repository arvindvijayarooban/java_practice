package com.scope;

public class LoopMethodScope {

    public void testScope () {

        for (int i = 0; i < 10; i++)
            System.out.println("i is " + i);


        int j = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("2nd i is " + i);
            j += i;
        }

        System.out.println("Final J is " + j);
    }

    public void doStuff(int i){

        System.out.println("i in doStuff is"+ i);
    }




    }

