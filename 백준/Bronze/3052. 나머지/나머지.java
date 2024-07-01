import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main  {
    /*
    hashset 자바 컬렉션 중 set의 파생 클래스
    set은 집합 hashset은 몇가지 특징있음
    1. 중복되는 원소는 하나만 저장된다. 중복 원소 허용 X
    2. hashset은 순서개념없어서 collections.sort() 메소드 사용 못함 정렬하고 싶으면 리스트로 변환후 정렬 해야함

    나머지값이 서로 다른 개수를 새려면
    Hashset이용하면 나머지 값이 hashset원소 에 저장되어 잇어서 중복인 경우 저장되지 않고 hashset에 없는 경우 저장한다.
    즉 hashset에 저장하면서 들어간 원소의 개수가 hastset의 사이즈가 되는거고 이게 결국 서로 다른 나머지가 되는것이다.



     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> h = new HashSet<Integer>();


        for (int i = 0 ; i < 10; i++) {
            h.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.println(h.size());

    }


}