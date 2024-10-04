import java.util.Scanner;
public class Pemilihan2Percobaan205 {
    public static void main(String[] args) {
        Scanner Absen = new Scanner(System.in);
        String menu, member, pembayaran;
        int jumlahBeli, pilihan_menu;
        double diskon, harga, totalBayar;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.println("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = Absen.nextInt();
        Absen.nextLine();

        System.out.print("Apakah punya member (y/n) ? = ");
        member = Absen.nextLine();
        System.out.println("-------------------------------------");
        
        if (member.equalsIgnoreCase("y")) {//Menggunakan equalsIgnoreCase untuk membandingkan string
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("harga ricebowl = " + harga);
                
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("harga ice tea = " + harga);
                
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("harga bundling = " + harga);
                
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            }
            
            // Menghitung total bayar setelah diskon
            totalBayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + totalBayar);

        }
        
        else if (member.equalsIgnoreCase("n")) { //Menggunakan equalsIgnoreCase untuk membandingkan string
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("harga ricebowl = " + harga);
                
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("harga ice tea = " + harga);
                
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("harga bundling = " + harga);
                
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;

            }

                //Menghitung total bayar
                System.out.println("Total bayar = " + harga);    
                
        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("-------------------------------------");
    }
}