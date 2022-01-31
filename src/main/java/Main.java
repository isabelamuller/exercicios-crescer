import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome1 = sc.next();
        int treinoMeses1 = sc.nextInt();
        String nome2 = sc.next();
        int treinoMeses2 = sc.nextInt();

        int calculo1 = (50 + treinoMeses1 * 2) / 100;
        int calculo2 = (50 + treinoMeses2 * 2) / 100;

        System.out.println(nome1 + " " + calculo1 + " x " + calculo2 + " " + nome2);

        }

    }