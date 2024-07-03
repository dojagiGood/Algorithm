import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main  {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
/*
        for (int x = 0; x < m; x++) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;

            while (i < j) {
                //역순으로 만들기 위해서 끝에서 시작해서 중간에서 만나도록 해야함
                int temp = arr[i];//temp에 arr[i]값 저장
                arr[i++] = arr[j];// arr[j]값을 arr[i]에 저장하고 후위 연산자로 마지막에 i값을1 증가시켜서 다음거로 진행하게 함
                arr[j--] = temp;//temp에잇는arr[i]값을 arr[j]에 저장하고 마지막에 j 값을 1감소시켜서 중간으로 오게히ㅏㅁ


            }



        }

 */
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int left = Integer.parseInt(st.nextToken()) - 1;
            int right = Integer.parseInt(st.nextToken()) - 1;


            while (left < right) {

                int temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }

        br.close();
    }

}