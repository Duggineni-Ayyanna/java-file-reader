import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class SimpleNotes {
    public static void main(String[] args) {
        String filename = "notes.txt";
        try {
            FileWriter fw = new FileWriter(filename);
            fw.write("My first line \n");
            fw.write("This is my second line.\n");
            fw.write("My first line \n");
            fw.close();

            System.out.println("Notes written to file.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            System.out.println("Reading notes from file:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
