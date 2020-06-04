import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] frase = new String[5];
        int i;
        for (i = 0; i < 5; i++) {
            frase[i] = sc.next();
        }
        for (i = 0; i <= 4; i++) {
            System.out.println(frase[i]);
        }
    }
}