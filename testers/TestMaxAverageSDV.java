package testers;

import modules.MaxAverageSDV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by extradikke on 09.02.15.
 */
public class TestMaxAverageSDV {

    public static void main(String[] args) {

        MaxAverageSDV maxAverageSDV = new MaxAverageSDV();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            maxAverageSDV.newNumber(input);
            System.out.println(maxAverageSDV);

        }


    }}