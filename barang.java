   
public class barang {
    String kodeBarang;
    String namaBarang;
    double hargaBarang;

    public barang(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    public String infoBarang() {
        return "Kode Barang: " + kodeBarang +"\n"+ "Nama Barang: " + namaBarang + "\n" + "Harga Barang: " + hargaBarang;
    }
}


