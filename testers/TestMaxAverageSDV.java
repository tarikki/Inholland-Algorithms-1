package testers;

import modules.MaxAverageSDV;

/**
 * Created by extradikke on 09.02.15.
 */
public class TestMaxAverageSDV {

    public static void main(String[] args) {
        MaxAverageSDV maxAverageSDV = new MaxAverageSDV();
        for (int i = 0; i < 10; i++) {
            maxAverageSDV.newNumber(8);
        }

        System.out.println(maxAverageSDV);
    }
}
