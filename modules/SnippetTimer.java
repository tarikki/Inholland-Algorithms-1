package modules;

import snippet.SnippetFinder;

/**
 * Created by extradikke on 13.02.15.
 */
public class SnippetTimer {


    public SnippetTimer(int doubling_times) {
        int count = 0;
        for (int i = 0; i < doubling_times; i++) {
            count++;
            double totalTime = 0;
            SnippetFinder snippetFinder = new SnippetFinder();
            snippetFinder.init(i);



            int maxTimes = 100;
            for (int averaginTimes = 0; averaginTimes < maxTimes; averaginTimes++) {
                long startTime = System.nanoTime();
                snippetFinder.findSnipet("you", 3);
                totalTime += (double) (System.nanoTime() - startTime) / 1000000;
            }
            System.out.println(snippetFinder.getTextSize() + "\t " + totalTime / maxTimes);


        }
//        System.out.println(count);
    }
}

