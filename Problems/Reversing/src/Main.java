import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numero;
        numero = scanner.nextInt();
        int tamano = 0;
        int centenas = numero / 100;
        if (centenas != 0) {
            tamano = 3;
        }
        int decenas = (numero - centenas * 100) / 10;
        if ((decenas != 0) && (tamano == 0)) {
            tamano = 2;
        }
        if ((decenas == 0) && (centenas == 0)) {
            tamano = 1;
        }
        int unidades = numero % 10;


        if (tamano == 3) {
            int invertido = unidades * 100 + decenas * 10 + centenas;
            System.out.println(invertido);
        }
        if (tamano == 2){
            int invertido = unidades * 10 + decenas ;
            System.out.println(invertido);
        }
        if (tamano == 1) {
            System.out.println(numero);

        }
        /*if ((tamano == 3) && (unidades != 0)) {
            System.out.println("El número invertido es " + unidades + decenas + centenas);
        } else {
            if (((tamano == 2) && (unidades != 0)) || ((tamano == 3) && (unidades == 0))) {
                System.out.println("El número invertido es " + unidades + decenas);
            } else {
                System.out.println("El número invertido es " + unidades);
            }
        }*/
    }
}