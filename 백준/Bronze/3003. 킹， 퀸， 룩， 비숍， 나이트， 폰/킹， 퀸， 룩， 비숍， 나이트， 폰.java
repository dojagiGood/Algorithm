import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int king = 1;
        int queen = 1;
        int look = 2;
        int bi = 2;
        int knite = 2;
        int phone = 8;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        king = king - Integer.parseInt(st.nextToken());
        queen = queen - Integer.parseInt(st.nextToken());
        look = look - Integer.parseInt(st.nextToken());
        bi = bi - Integer.parseInt(st.nextToken());
        knite = knite - Integer.parseInt(st.nextToken());
        phone = phone - Integer.parseInt(st.nextToken());

        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(look+ " ");
        System.out.print(bi + " ");
        System.out.print(knite + " ");
        System.out.print(phone + " ");

    }
}