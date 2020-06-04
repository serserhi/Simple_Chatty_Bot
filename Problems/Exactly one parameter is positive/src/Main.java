import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();

        int contador = 0;
        if (numero1 > 0) {contador++;}
        if (numero2 > 0) {contador++;}
        if (numero3 > 0) {contador++;}

        System.out.println(contador == 1);
    }
}