import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner Absen = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = Absen.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = Absen.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int bil3 = Absen.nextInt();

        // Menentukan bilangan terbesar
        int terbesar;
        if (bil1 >= bil2 && bil1 >= bil3) {
            terbesar = bil1;
        } else if (bil2 >= bil1 && bil2 >= bil3) {
            terbesar = bil2;
        } else {
            terbesar = bil3;
        }

        // Output bilangan terbesar
        System.out.println("Bilangan terbesar adalah: " + terbesar);

    }
}