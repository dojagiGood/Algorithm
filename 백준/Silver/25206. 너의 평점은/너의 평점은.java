import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double sumNumScore = 0;
        double sumNum = 0;

        for (int i = 0; i < 20; i++) {
             st = new StringTokenizer(br.readLine(), " ");
            String object = st.nextToken();
            double num = Double.parseDouble(st.nextToken());
            String stgrade = st.nextToken();
            double grade = 0;

            if (!(stgrade.equals("P"))) {
                switch (stgrade) {
                    case "A+":
                        grade = 4.5;
                        break;

                    case "A0":
                        grade = 4.0;
                        break;

                    case "B+":
                        grade = 3.5;
                        break;

                    case "B0":
                        grade = 3.0;
                        break;

                    case "C+":
                        grade = 2.5;
                        break;
                    case "C0":
                        grade = 2.0;
                        break;

                    case "D+":
                        grade = 1.5;
                        break;

                    case "D0":
                        grade = 1.0;
                        break;

                    case "F":
                        grade = 0.0;
                        break;

                    default:
                        break;


                }

                sumNumScore += (num * grade);
                sumNum += num;
            }

        }

        System.out.printf("%.6f",sumNumScore/sumNum);
        br.close();
    }


}