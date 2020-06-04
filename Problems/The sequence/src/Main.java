import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int cantidad = scanner.nextInt();
        int maximo = 0;
        int i = 1;
        int numero = 0;
        while (i <= cantidad) {
            i++;
            numero = scanner.nextInt();
            if ((numero % 4 == 0) && (maximo < numero)){
                maximo = numero;
            }
        }
        System.out.println(maximo);
    }
}