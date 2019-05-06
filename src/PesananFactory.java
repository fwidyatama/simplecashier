import Pesanan.*;

public class PesananFactory {

    public Pesanan buatPesanan(String metodeAmbil, String alamat, String pembeli) {
        if (metodeAmbil.equals(null)){
            return null;
        }
        else if(metodeAmbil.equals("kirim")){
            return new Kirim(alamat, pembeli);
        }
        else if(metodeAmbil.equals("ambil")){
            return new Ambil(alamat, pembeli);
        }
        return null;
    }

}
