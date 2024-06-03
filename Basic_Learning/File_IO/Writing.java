package Basic_Learning.File_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {
    public static void main(String[] args) throws IOException {
        String l = "F:\\A_Study\\Java_Coding_Files\\Writing.txt";
        FileWriter fw = new FileWriter(l);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello");
        bw.close();
        fw.close();
    }
}
