//Concrete Component

package Pesanan;

public class Kirim extends Pesanan {
    public Kirim(String alamat, String pembeli){
        description = "Nama Pembeli : "+pembeli+" \nPemesanan dengan metode : Dikirim ke "+alamat+" \n\n";
    }

    @Override
    public long cost() {
        return 20000;
    }
}
