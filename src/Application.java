import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello! what is your name: ");
        String name = sc.nextLine();
        System.out.print("Nice to meet you " + name+" :)");
    }
}
