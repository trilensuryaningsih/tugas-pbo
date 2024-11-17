public class faktur extends barang {
    private String noFaktur;
    private int jumlahBeli;

    public faktur(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang); // Menggunakan inheritance dari Barang
        this.noFaktur = noFaktur;
        this.jumlahBeli = jumlahBeli;
    }

    public double total() throws Exception {
        if (hargaBarang <= 0 || jumlahBeli <= 0) {
            throw new Exception("Harga barang dan jumlah beli harus lebih besar dari nol.");
        }
        return hargaBarang * jumlahBeli;
    }

    public String getNoFaktur() {
        return noFaktur;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }
}
