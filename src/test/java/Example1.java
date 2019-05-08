import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            JSONObject obj = (JSONObject) parser.parse(new FileReader("example1.json"));
            System.out.println(obj.get("id"));
            List<Map<String,?>> platforms = (List<Map<String, ?>>) obj.get("platforms");
            for (Iterator<Map<String, ?>> iterator = platforms.iterator(); iterator.hasNext(); ) {
                Map<String, ?> platform = iterator.next();
                System.out.println(platform.get("id"));
                System.out.println(platform.get("name"));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }
}