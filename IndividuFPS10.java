import java.util.Scanner;
public class IndividuFPS10 {
    public static void main(String[] args) {
        int jarak;
        Scanner inputFPS = new Scanner(System.in);
        System.out.println("Masukkan jarak musuh : ");
        jarak = inputFPS.nextInt();
        if (jarak <=5) {
            System.out.println("Gunakan Melee Weapon ");
        } else {
            System.out.println("Gunakan Range Weapon ");
        }

    }
}
