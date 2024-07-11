import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        System.out.println(st.countTokens());
        
        //StringTokenizer은 연속된 구분자를 무시함 따라서 여러 공백이 연속으로 나타나도 하나의 구분자로 처리한다. 
        //countTokenizer을 사용해서 분리된 토큰의 개수 출ㄹ력 단어의 갯수출력인것임 




    }
}