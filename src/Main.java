import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int x =10;
        int y = 2;

        try{
            for(int z =2 ; z >=0; z--){
                int ans = x/z;
                System.out.println(ans + " ");

            }

        }catch( Exception e1){
            System.out.println(e1);

        }

        ExampleTwo e2 = new ExampleTwo();
        e2.testAppend();
    }
}
