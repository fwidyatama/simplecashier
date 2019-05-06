//Concrete Component

package Pesanan;

public class Ambil extends Pesanan {
    public Ambil(String alamat, String pembeli){
        description = "Nama Pembeli : "+pembeli+" \nPemesanan dengan metode : Diambil di toko KlikMeteor yang terletak di "+alamat+" \n\n";
    }

    @Override
    public long cost() {
        return 0;
    }
}
