import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 1;
        int j = 1;
        int contador = 0;
        do {
            for (j = 1 ; j <= i ; j++) {
                System.out.print(i + " ");
                contador++;
                if (contador == number) {
                    break;
                }
            }
            i++;
        } while (contador < number);


    }
}
