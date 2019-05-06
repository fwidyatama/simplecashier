
public class PesananOrder implements Command{
    Proses proses;
    String cpu, motherboard, ram, storage, videocard, psu, pccase;
    String order, alamat, pembeli;
    public PesananOrder(Proses proses, String order, String alamat, String pembeli, String cpu, String motherboard, String ram, String storage, String videocard, String psu, String pccase){
        this.proses = proses;
        this.order = order;
        this.alamat = alamat;
        this.pembeli = pembeli;
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.ram = ram;
        this.storage = storage;
        this.videocard = videocard;
        this.psu = psu;
        this.pccase = pccase;
    }

    @Override
    public void orderUp() {
        proses.metodeAmbil = order;
        proses.alamat = alamat;
        proses.pembeli = pembeli;
        proses.cpu = this.cpu;
        proses.motherboard = this.motherboard;
        proses.ram = this.ram;
        proses.storage = this.storage;
        proses.videocard = this.videocard;
        proses.psu = this.psu;
        proses.pccase = this.pccase;
        
        proses.getOrder();
    }
}
