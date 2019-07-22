package access.pond.duck;

public class MotherDuck {

    String noise = "quack";
    void quack() {

        makeNoise();




    }

    private void makeNoise(){

        System.out.println(noise);
    }

    public void getNoise(){

        makeNoise();
    }

}
