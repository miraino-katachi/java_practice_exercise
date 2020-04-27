import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Calcurator calcurator = new Sum();
        exec(calcurator);
    }

    public static void exec(Calcurator calcurator) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("x = ");
            int x = Integer.parseInt(br.readLine());
            System.out.print("y = ");
            int y = Integer.parseInt(br.readLine());
            System.out.println("答え = " + calcurator.calc(x, y));
        } catch (IOException e) {
            System.out.println("例外が発生しました");
        }
    }
}