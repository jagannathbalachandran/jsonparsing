import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Example3 {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            JSONObject obj = (JSONObject) parser.parse(new FileReader("example3.json"));

          //write code here to print all the titles and the associated categories

            Map<String , ?> response = (Map<String, ?>) obj.get("responseData");
//            System.out.println(response);

            Map<String , ?> feed = (Map<String, ?>) response.get("feed");

            List<Map<String, ?>> entries = (List<Map<String, ?>>) feed.get("entries");
            for (Iterator<Map<String, ?>> iterator = entries.iterator(); iterator.hasNext(); ) {
                Map<String, ?> entry = iterator.next();
                System.out.println(entry.get("title"));
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