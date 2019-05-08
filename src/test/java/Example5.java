import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

    public class Example5 {
        public static void main(String[] args) {

            JSONParser parser = new JSONParser();

            try {
                Object obj = parser.parse(new FileReader("example4.json"));

                //write code here to print all the type of phone no and the corresponding no


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (org.json.simple.parser.ParseException e) {
                e.printStackTrace();
            }
        }
    }
