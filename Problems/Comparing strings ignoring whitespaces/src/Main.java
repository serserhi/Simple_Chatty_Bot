import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String palabra1 = scanner.nextLine();
        String palabra2 = scanner.nextLine();
        System.out.println(palabra1.trim().replace(" ", "").equals(palabra2.trim().replace(" ", "")));

    }
}