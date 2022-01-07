import java.util.Scanner;

public class MainClass {
    public static void main(String args[]) {
        existinguser po = new existinguser();
        newuser ko = new newuser();
        System.out.println("Press 1 if you are a new user and press 2 if you an old user");
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        int k = sc.nextInt();
        if (k == 2) {
            po.input();
            po.function();

        } else {
            ko.openaccount();
        }
    }
}


