package testers;

import snippet.SnippetFinder;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Created by extradikke on 26/02/15.
 */
public class SnippetTester {
    public static void main(String[] args) throws IOException {
        SnippetFinder snippetFinder = new SnippetFinder();
        snippetFinder.init();
        snippetFinder.findSnipet("pleasure", 3);
    }
}
