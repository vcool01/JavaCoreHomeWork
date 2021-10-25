package HomeWork01;
import java.util.Random;

public class RandomValue {
    public static java.util.Random random = new java.util.Random();

    public static int RandomValueInt( int max){
        return random.nextInt(max);
    }

    public static int RandomValueDouble( double max){
        return random.nextInt(10);
    }
}
