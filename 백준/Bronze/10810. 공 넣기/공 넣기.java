
import java.io.*;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); //바구니 총 갯수
        int[] narr = new int[n];
        int m = Integer.parseInt(st.nextToken()); //공을 넣을 횟수




        for (int h = 0; h < m; h++) {

             st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int y = i-1 ; y < j; y++) {
                narr[y] = k;
            }

        }

        for (int i : narr) {
            System.out.print(i+ " ");
        }

        br.close();


    }


}
