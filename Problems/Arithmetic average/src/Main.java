import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double suma = 0;
        int contador = 0;
        double media = 0;

        for (int i = a ; i <= b; i++) {
            if (i % 3 == 0) {
                suma = suma + i;
                contador++;
            }
        }
        media = suma / contador;
        System.out.println(media);

    }
}