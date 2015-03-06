package testers;

import snippet.SnippetFinder;

import java.io.IOException;

/**
 * Created by extradikke on 26/02/15.
 */
public class SnippetTester {
    public static void main(String[] args) throws IOException {
        SnippetFinder snippetFinder = new SnippetFinder();
        snippetFinder.init(0);
        snippetFinder.findSnippet("pleasure", 3);
    }
}
