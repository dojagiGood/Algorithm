import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder st = new StringBuilder(br.readLine());

        String st1 = st.toString();

        String rev = st.reverse().toString();


        if (st1.equals(rev)) {
            System.out.println("1");

        }
        else System.out.println("0");
        }



}