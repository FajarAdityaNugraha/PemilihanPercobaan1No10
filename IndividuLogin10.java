/**
 * IndividuLogin10
 */
import java.util.Scanner;
public class IndividuLogin10 {

    public static void main(String[] args) {
        Scanner inputLog = new Scanner(System.in);
        String username = "Kitsuraa";
        String password = "ILY";
        String inUsername, inPassword;
        System.out.println("Login User");
        System.out.print("Masukkan Username Anda : ");
        inUsername = inputLog.next();
        System.out.print("Masukkan Password Anda : ");
        inPassword = inputLog.next();
        if (username.equals(inUsername) && password.equals(inPassword)) {
            System.out.println("Masuk ke Sistem ");
        } else {
            System.out.println("Username atau Password yang anda masukkan salah! ");
        }

    }
}