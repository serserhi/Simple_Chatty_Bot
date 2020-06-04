import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String texto = "";
        while (number != 0) {
           /* if (number == 0){
                break;
            } else*/ if (number % 2 == 0) {
                texto = texto + "\neven";
            } else {
                texto = texto + "\nodd";
            }
            number = scanner.nextInt();
        }
        System.out.println(texto);
    }
}