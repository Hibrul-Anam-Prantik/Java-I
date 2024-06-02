package Basic_Learning.File_IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class writter {
    public static void main(String[] args) throws IOException {
        String location = "F:\\A_Study\\Java_Coding_Files\\Basic_Learning\\File IO\\Writer.txt";
        FileWriter fw = new FileWriter(location);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Welcome to Writer part.");
        bw.write("This is from the Writer file.");
        bw.write("The End.");
        fw.close();
        bw.close();
    }
}
