import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            try {
                // Input data dari pengguna
                System.out.print("Masukkan No. faktur: ");
                String noFaktur = scanner.nextLine();
                System.out.print("Masukkan Kode barang: ");
                String kodeBarang = scanner.nextLine();
                System.out.print("Masukkan Nama barang: ");
                String namaBarang = scanner.nextLine();
                System.out.print("Masukkan Harga barang: ");
                double hargaBarang = scanner.nextDouble();
                System.out.print("Masukkan Jumlah beli: ");
                int jumlahBeli = scanner.nextInt();
                scanner.nextLine(); // Membersihkan newline

                // Membuat objek Faktur
                faktur faktur = new faktur(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli);

                // Menghitung dan menampilkan total
                double total = faktur.total();

                // Menampilkan informasi barang dan faktur
                System.out.println("\nInformasi Barang");
                System.out.println(faktur.infoBarang());
                System.out.println("No. Faktur: " + faktur.getNoFaktur());
                System.out.println("Jumlah Beli: " + faktur.getJumlahBeli());
                System.out.println("Total harga: " + total);

            } catch (Exception e) {
                // Menampilkan pesan kesalahan jika terjadi exception
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                scanner.nextLine(); // Membersihkan buffer scanner jika ada error pada input angka
            }

            // Menanyakan apakah ingin memasukkan data lainnya (baik setelah berhasil atau exception)
            System.out.print("\nApakah ingin memasukkan data lainnya? (yes/no): ");
            String jawaban = scanner.nextLine().trim().toLowerCase();
            if (!jawaban.equals("yes")) {
                lanjut = false;
            }
        }

        // Menutup scanner setelah selesai dengan semua operasi
        scanner.close();
        System.out.println("Program selesai");
    }
}

