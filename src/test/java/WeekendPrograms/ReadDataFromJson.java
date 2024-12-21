package WeekendPrograms;









import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromJson {
    public static void main(String[] args) throws FileNotFoundException {
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            // Read JSON file and convert to Java object
            File file = new File(
                    "C:\\Users\\asus\\IdeaProjects\\AppiumBegin\\src\\Data\\CalculatorDC.json");
            Pojo pojo = objectMapper.readValue(file, Pojo.class);

            // Print data fetched from JSON
            System.out.println("Platform Name: " + pojo.getPlatformName());
            System.out.println("Device Name: " + pojo.getDeviceName());
            System.out.println("Version: " + pojo.getPlatformVersion());
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
    }
