//put imports you need here
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String age = sc.nextLine();
        String stage = sc.nextLine();
        String experience = sc.nextLine();
        String cuisine = sc.nextLine();
        System.out.println("The form for " + name + " is completed. We will contact you if we need a chef that cooks "
                     + cuisine + " dishes.");
        
    }
}
