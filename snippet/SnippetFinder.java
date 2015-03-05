package snippet;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by extradikke on 26/02/15.
 */
public class SnippetFinder {
    String text;
    String[] stringArray;
    ArrayList<String> textArray = new ArrayList<>();
    HashMap<String, ArrayList<Integer>> index = new HashMap<>();


    public void init(int doublingTimes) {
        try {

            text = readFile("/media/extradikke/UbuntuData/programming/java/algorithmsInholland/src/snippet/copperfield.txt", StandardCharsets.UTF_8);
            for (int i = 0; i < doublingTimes; i++) {
                text += text;
            }
            text = text.replace("--", " -- ");
            stringArray = text.split("[ \n\t\r]");

            for (String s : stringArray) {
                if (!s.equals("")) {
                    textArray.add(s.toLowerCase());
                }
            }

//            System.out.println(textArray.size());

            for (int i = 0; i < textArray.size(); i++) {
                String word = textArray.get(i).replaceAll("^[^\\-a-zA-Z0-9\\s]+|[^\\-a-zA-Z0-9\\s]+$", "");
                ArrayList<Integer> positions = new ArrayList<>();
                if (index.containsKey(word)) {
                    positions = index.get(word);
                }
                positions.add(i);
                index.put(word, positions);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    public void findSnipet(String word, int n) {
        word = word.toLowerCase();
        ArrayList<Integer> positions = index.get(word);
        if (positions == null){
            return;
        }
        for (int k = 0; k < positions.size(); k++) {
            int position = positions.get(k);

            StringBuilder stringBuilder = new StringBuilder();
            String numbering = k + 1 + ". Position: " + position + ". ";
            String extraBeginning = "";
            String extraEnding = "";

            for (int i = position - n; i < position + n + 1; i++) {
                String retrievedWord = textArray.get(i);
                stringBuilder.append(retrievedWord + " ");
                if (retrievedWord.equals("--")) {
                    if (i > position) {
                        extraEnding = textArray.get(position + n + 1);
                    } else {
                        extraBeginning = textArray.get(position - n) + " ";
                    }
                }

            }
            System.out.println(numbering + extraBeginning + stringBuilder + extraEnding);

        }
    }

    public int getTextSize(){
        return textArray.size();
    }

}
