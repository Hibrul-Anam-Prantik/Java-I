package Basic_Learning.File_IO;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class writter {
    public static void main(String[] args) throws IOException {
        String location = "F:\\Writer.txt";
        FileWriter fw = new FileWriter(location);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Welcome\n");

        bw.close();
        fw.close();
    }
}
