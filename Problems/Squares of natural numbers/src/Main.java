import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int aux = 1;
        while (aux * aux <= number) {
            System.out.println(aux * aux);
            aux++;
        }
    }
}