import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        String salida = palabra.substring(start, end+1);
        System.out.println(salida);
    }
}