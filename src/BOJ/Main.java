package BOJ;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream input = System.in;
        Reader reader = new InputStreamReader(input);
        BufferedReader bufferedReader = new BufferedReader(reader);

        System.out.print("입력 : ");
        String lineString =  bufferedReader.readLine();
        System.out.print("출력 : "+ lineString);
    }
}
