/**
 * PemilihanPercobaan1No10
 */
import java.util.Scanner;
public class PemilihanPercobaan1No10 {

    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        int angka = input10.nextInt();
        String hasil = (angka % 2 == 0) ? "Angka " + angka + " bilangan genap" : "Angka" + angka + " bilangan ganjil";
        System.out.println(hasil);


    }
}