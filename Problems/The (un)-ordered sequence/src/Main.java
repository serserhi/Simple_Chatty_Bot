import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int next = 0;
        String salida = "true";
        String order = "";

        while (number != 0) {
            next = scanner.nextInt();
            if (next == 0) {
                break;
            } else if ((next > number) && (order == "")) {
                order = "asc";
            } else if ((next < number) && (order == "")) {
                order = "desc";
            } else if ((next == number) && (order == "")) {
                order = "";
            } else if ((next >= number) && (order == "asc")) {
                salida = "true";
            } else if ((next <= number) && (order == "desc")) {
                salida = "true";
            } else {
                salida = "false";
                break;
            }
            number = next;
        }
        System.out.println(salida);

    }
}