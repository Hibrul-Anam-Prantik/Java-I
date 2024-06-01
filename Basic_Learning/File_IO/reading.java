package Basic_Learning.File_IO;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class reading {
    public static void main(String[] args) throws IOException {
        String loc = "F:\\A_Study\\Java_Coding_Files\\Basic_Learning\\io.txt";
        FileReader fr = new FileReader(loc);
        BufferedReader br = new BufferedReader(fr);
        System.out.println(1 + ". Location: " + loc);
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();
        String s4 = br.readLine();
        String s5 = br.readLine();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.print(s5); // null
        fr.close();
        br.close();
    }
}