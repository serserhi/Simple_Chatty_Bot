import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Escribe un texto");
        String palabra = scanner.nextLine();
        String salida = "";
        int i;
        for (i = 0; i < palabra.length() ; i++) {
            if (palabra.charAt(i) == 'a'){
                salida = salida + "b";
            } else { salida = salida + palabra.charAt(i);}
        }
        System.out.println(salida);
    }
}