package modules;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by extradikke on 09.02.15.
 */
public class MaxAverageSDV {
    private List<Integer> numbers = new ArrayList();
    private int max;
    private int sum = 0;
    private double average;
    private double sdv;


    public void newNumber(int newNumber) {
        if (numbers.isEmpty()) {
            max = newNumber;
        }

        if (newNumber > max){
            max = newNumber;
        }
        numbers.add(newNumber);
        sum += newNumber;
        average = sum / numbers.size();
        int sumOfSquares = 0;
        for (Integer number : numbers) {
            sumOfSquares += Math.pow(((double) number - average), 2);
        }

        sdv = Math.pow(sumOfSquares / numbers.size(), .5);

    }

    @Override
    public String toString() {
        return "MaxAverageSDV{" +
                "numbers=" + numbers +
                ", max=" + max +
                ", sum=" + sum +
                ", average=" + average +
                ", sdv=" + sdv +
                '}';
    }
}





