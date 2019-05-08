import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            JSONArray array = (JSONArray) parser.parse(new FileReader("example2.json"));

          //write code here to print all the cars for each person
            for (Iterator iterator = array.iterator(); iterator.hasNext(); ) {
                Map<String,?> element = (Map<String, ?>) iterator.next();
                System.out.println(element.get("name"));
                System.out.println(element.get("cars"));

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