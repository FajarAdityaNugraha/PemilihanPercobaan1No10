import java.util.Scanner;
public class PemilihanPercobaan2No10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        System.out.print("Nilai uas : ");
        float uas = input10.nextFloat();
        System.out.print("Nilai uts : ");
        float uts = input10.nextFloat();
        System.out.print("Nilai kuis : ");
        float kuis = input10.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input10.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        if(total > 80 && total <= 100){
            System.out.println("Nilai anda adalah " +total+ " sehingga mendapat nilai A dan nilai setara 4. Kualifikasi anda adalah Sangat Baik");
        }
        else if(total > 73 && total <= 80){
            System.out.println("Nilai anda adalah " +total+ " sehingga mendapat nilai B+ dan nilai setara 3,5. Kualifikasi anda adalah Lebih dari Baik");
        }
        else if(total > 65 && total <= 73){
            System.out.println("Nilai anda adalah " +total+ " sehingga mendapat nilai B dan nilai setara 3. Kualifikasi anda adalah Baik");
        }
        else if(total > 60 && total <= 65){
            System.out.println("Nilai anda adalah " +total+ " sehingga mendaoat nilai C+ dan nilai setara 2,5. Kualifikasi anda adalah Lebih dari Cukup");
        }
        else if(total > 50 && total <= 60){
            System.out.println("Nilai anda adalah " +total+ " sehingga mendapat nilai C dan nilai setara 2. Kualifikasi anda adalah Cukup");
        }
        else if(total > 39 && total <= 50){
            System.out.println("Nilai anda adalah " +total+ " sehingga mendapat nilai D dan nilai setara 1. Kualifikasi anda adalah Kurang");
        }
        else if(total <= 39){
            System.out.println("Nilai anda adalah " +total+ " sehingga mendapat nilai E dan nilai setara 0. Kualifikasi anda adalah Gagal");
        }else{
            System.out.println("masukkan nilai dengan benar");
}
    
    }
}
