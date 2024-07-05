import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char ch = (char) br.read();
        int i = (int) ch;
        System.out.println(i);
       /* int read = System.in.read();
        System.out.println(read);*/



        /*
        System.in.read()메서드는 입력 스트림으로부터 하나의 바이트를 읽고 그 아스키 코드값을 정수로 반환한다.
        2. char타입으로 입력받고 그걸 int타입으로 형변환 시키면 그게 아스키코드값이 나옴
         */

    }
}