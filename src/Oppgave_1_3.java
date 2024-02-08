import java.util.Scanner;

public class Oppgave_1_3 {
    // Oppgave 1:
    public static int antall = 0;
    public static long C_rekursiv(int n, int m){
        //Bunnen i rekusjonen: Sjekker om n er lik 0, m er lik n eller m er lik 0
        // I disse tilfellene er verdien av binomialkoeffisienten 1

        if(n == 0 || n == m || m == 0)
        {   antall ++;
            return 1;


        }
        else {
            // utfører vi den rekursive formelen C(n, m) = C(n - 1, m) + C(n - 1, m - 1)
            antall ++;
            return C_rekursiv(n - 1, m) + C_rekursiv(n - 1, m - 1);


        }

    }

    public static void main(String[] args) {

        // Oppgave 3:
        Scanner scanner = new Scanner(System.in);
        System.out.println("REKURSIV");
        System.out.println("n? : ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int m = 0; m < n; m ++){
           System.out.println("C(" + n + ", " + m + ") = " + C_rekursiv(n, m));

        }
        //kun testkode for å sjekke at tegningen min fra oppgave 2 er riktig:
        //System.out.println(C_rekursiv(6,4));
        //System.out.println(antall);


    }

}
