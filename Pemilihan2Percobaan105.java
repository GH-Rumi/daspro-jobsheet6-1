import java.util.Scanner;
	/**
	 * Pemilihan2Percobaan105
	 */
	public class Pemilihan2Percobaan105 {
	    public static void main(String[] args) {
	        Scanner Absen = new Scanner(System.in);
	        int tahun;
	
			System.out.print("Masukkan Tahun : ");
			tahun = Absen.nextInt();
	
			if (tahun % 4 == 0) {
				if (tahun % 100 == 0) {
					System.out.println("Tahun Kabisat");
				} else {
					if (tahun % 400 == 0) {
						System.out.println("Tahun Kabisat");
					} else {
						System.out.println("Bukan Tahun Kabisat");
					}
				}
			} else {
				System.out.println("Bukan Tahun Kabisat");
			}
		}
	}