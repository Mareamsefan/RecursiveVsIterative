import java.util.Scanner;

public class Oppgave_5_6 {

    public static long C_iterativ(int n, int m){
        long result = 1;

        // n! / (m! * (n - m)!)
        for (int i = 1; i <= m; i++) {
            result *= (n - i + 1);
            result /= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ITERATIV");
        System.out.println("n? : ");
        int n_1 = Integer.parseInt(scanner.nextLine());
        for (int m = 0; m < n_1; m ++){
            System.out.println("C(" + n_1 + ", " + m + ") = " + C_iterativ(n_1, m));
        }

    }

}
