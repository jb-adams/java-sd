package labs;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ReadCSV {

    public static void main(String[] args) {
        // This method will read data from a CSV file
        List<String[]> data = new ArrayList<String[]>();
        String filename = "C:\\Users\\jerem\\Dropbox\\Education\\Programming\\Java\\Courses\\"
                + "BecomeAJuniorJavaSoftwareDeveloper\\Files\\accounts.csv";
        String datarow;

        try {
            // Open the file
            BufferedReader br = new BufferedReader(new FileReader(new File(filename)));

            // Read the data as long as it's not empty
            while ((datarow = br.readLine()) != null) {
                // parse the data by commas
                String[] line = datarow.split(",");
                // Add the data to the collection
                data.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String[] account : data) {
            System.out.print("[");
            for (String field : account) {
                System.out.print(field + " ");
            }
            System.out.println("]");
        }
    }
}
