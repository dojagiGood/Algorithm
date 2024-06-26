
import java.io.*;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));




       //주어지는 자연수 갯수

        int n = 9;
        int[] arr = new int[n];




        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = arr[0];
        int position = 1;//위치는 1번부터 시작이니까

        for (int j = 1; j <n; j++) {

            if (arr[j] > max) {
                max = arr[j];
                position = j + 1;
                
            }

        }

        System.out.println(max);
        System.out.println(position);

        br.close();

    }



}
