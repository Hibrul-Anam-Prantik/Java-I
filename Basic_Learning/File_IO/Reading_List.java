package Basic_Learning.File_IO;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Reading_List {
    public static void main(String[] args) throws IOException {
        String location = "F:\\A_Study\\Java_Coding_Files\\Basic_Learning\\File IO\\Read.txt";
        FileReader fr = new FileReader(location);
        BufferedReader br = new BufferedReader(fr);
        String s = br.readLine();
        int i = 1;
        while (s != null) {
            System.out.println(s);
            i++;
            s = br.readLine();
        }
        br.close();
        fr.close();
    }
}
