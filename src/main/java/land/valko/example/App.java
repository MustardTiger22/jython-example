package land.valko.example;

import java.util.Random;

public class App
{
    public static void main( String[] args )
    {
        AccumulatorFactory factory = new AccumulatorFactory();
        Accumulator accumulator = factory.create();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int value = random.nextInt(10);
            System.out.println("Adding " + value);
            accumulator.add(value);
        }

        System.out.println("Total: " + accumulator.getValue());
    }
}
