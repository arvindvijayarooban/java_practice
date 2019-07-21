package com.example.javapractice;

public class AnotherLoopTest {

    public void testLoop(){
        int i,j ;
        for (i=1; i <4; i++){
            for (j=2; j<4;j++){

                if (j == 3){

                    continue;
                    //this continue means, skip the printout if j=3 and continue with the outer loop
                }
                System.out.println("i = "+ i + " j = "+ j);
            }
        }
    }
}
