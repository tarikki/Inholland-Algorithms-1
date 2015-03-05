package snippet;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by extradikke on 04/03/15.
 */
public class TextDoubler {
    String text;
    String[] stringArray;
    ArrayList<String> textArray = new ArrayList<>();
    ArrayList<String> textArrayBloated= new ArrayList<>();
    Random random = new Random();


    public void doubleText(int doublingTimes, String removeWord) {
        try {

            text = readFile("/media/extradikke/UbuntuData/programming/java/algorithmsInholland/src/snippet/copperfield.txt", StandardCharsets.UTF_8);
            text = text.replace("--", " -- ");
            stringArray = text.split("[ \n\t\r]");

            for (String s : stringArray) {
                if (!s.equals("")) {
                    textArray.add(s.toLowerCase());
                }
            }


            for (int i = 0; i <textArray.size(); i++) {
                String word = textArray.get(i);
                textArrayBloated.add(word + " ");
                for (int j = 0; j < doublingTimes-1; j++) {
                    if (!word.replaceAll("^[^\\-a-zA-Z0-9\\s]+|[^\\-a-zA-Z0-9\\s]+$", "").equals(removeWord)){
                        textArrayBloated.add(word + " ");
                    }
                }
            }

            String fileName = "text"+doublingTimes+".txt";
            FileWriter writer = new FileWriter(fileName);
            for (String string: textArrayBloated){
                writer.write(string);
            }

            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
}
