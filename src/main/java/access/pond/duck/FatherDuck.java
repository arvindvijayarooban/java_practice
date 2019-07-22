package access.pond.duck;

public class FatherDuck {

    //instance variables
    private String noise = "Quack";

    //private methods
    private void quack(){

        System.out.println(noise);
    }

    public void makeNoise(){

        FatherDuck fDuck = new FatherDuck();
        fDuck.quack();


    }






}
