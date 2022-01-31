import java.math.BigInteger;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger valorBytes = sc.nextBigInteger();
        Double valorBytes1 = valorBytes.doubleValue();

        if (valorBytes.compareTo(BigInteger.valueOf(1024)) < 0) {
            System.out.printf("%.2f B%n", valorBytes1);
        }
        else if (valorBytes.compareTo(BigInteger.valueOf((long) Math.pow(1024, 2))) < 0) {
            double calculo = valorBytes1 / 1024;
            System.out.printf("%.2f KB%n", calculo);
        }
        else if (valorBytes.compareTo(BigInteger.valueOf((long) Math.pow(1024, 3))) < 0) {
            double calculo = valorBytes1 / Math.pow(1024, 2);
            System.out.printf("%.2f MB%n", calculo);
        }
        else if (valorBytes.compareTo(BigInteger.valueOf((long) Math.pow(1024, 4))) < 0) {
            double calculo = valorBytes1 / Math.pow(1024, 3);
            System.out.printf("%.2f GB%n", calculo);
        }
        else if (valorBytes.compareTo(BigInteger.valueOf((long) Math.pow(1024, 5))) < 0) {
            double calculo = valorBytes1 / Math.pow(1024, 4);
            System.out.printf("%.2f TB%n", calculo);
        }
        else if (valorBytes.compareTo(BigInteger.valueOf((long) Math.pow(1024, 6))) < 0) {
            double calculo = valorBytes1 / Math.pow(1024, 5);
            System.out.printf("%.2f PB%n", calculo);
        }
        else if (valorBytes.compareTo(BigInteger.valueOf((long) Math.pow(1024, 7))) < 0) {
            double calculo = valorBytes1 / Math.pow(1024, 6);
            System.out.printf("%.2f EB%n", calculo);
        }
        else if (valorBytes.compareTo(BigInteger.valueOf((long) Math.pow(1024, 8))) < 0) {
            double calculo = valorBytes1 / Math.pow(1024, 7);
            System.out.printf("%.2f ZB%n", calculo);
        }
        else if (valorBytes.compareTo(BigInteger.valueOf((long) Math.pow(1024, 9))) < 0) {
            double calculo = valorBytes1 / Math.pow(1024, 8);
            System.out.printf("%.2f YB%n", calculo);
        }


    }

}