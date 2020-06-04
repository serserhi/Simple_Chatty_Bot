import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();
        boolean dif1 = numero1 != numero2;
        boolean dif2 = numero1 != numero3;
        boolean dif3 = numero2 != numero3;
        System.out.println(dif1 && dif2 && dif3);
    }
}