import java.util.Scanner;
public class Main {
//2588번부터 다시 풀어보기
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        String B = scanner.next();
        scanner.close();

        System.out.println(A * (B.charAt(2) - '0'));
        System.out.println(A * (B.charAt(1) - '0'));
        System.out.println(A * (B.charAt(0) - '0'));

        //B.charAt(0) -'0' 이렇게하면 문자를 정수값으로 바꿀 수 있음
        //char 형끼리 산술 연산은 int로 변환됨

        System.out.println(A * Integer.parseInt(B));
        //문자열을 정수로 만들어주는 메서드 
    }
}