import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int h = scanner.nextInt();
    int m = scanner.nextInt();
    int c = scanner.nextInt();


    m += c;

    h += m / 60;
    m %= 60;


    h %= 24;
    System.out.println(h + " "+m);
}
}
