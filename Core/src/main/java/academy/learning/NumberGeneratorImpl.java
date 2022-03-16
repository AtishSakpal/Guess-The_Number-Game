package academy.learning;

import java.util.Random;

public class NumberGeneratorImpl implements NumberGenerator
{
    private final static Random randomNumber = new Random();

    private int maxNumber = 100;

    @Override
    public int nextNumber()
    {
        return randomNumber.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber()
    {
        return maxNumber;
    }
}
