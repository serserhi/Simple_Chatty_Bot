import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();
        int numero4 = scanner.nextInt();

        System.out.print(--numero1 + " " + --numero2 + " " + --numero3 + " " + --numero4);

    }
}