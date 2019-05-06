import Pesanan.Pesanan;
import Pesanan.PesananDecorator.*;

// Receiver
public class Proses {
    public static String metodeAmbil="";
    public static String alamat="";
    public static String pembeli="";
    public static String cpu = null;
    public static String motherboard = null;
    public static String ram = null;
    public static String storage = null;
    public static String videocard = null;
    public static String psu = null;
    public static String pccase = null;
    
    Pesanan pesanan;
    public void getOrder(){
        
            PesananFactory factory =  new PesananFactory();
            pesanan = factory.buatPesanan(metodeAmbil, alamat, pembeli);

            pesanan = decorate(cpu, motherboard, ram, storage, videocard, psu, pccase);

            System.out.println(pesanan.getDescription());
            System.out.println("TOTAL BUILD ANDA : Rp " + pesanan.cost());
        
        System.out.println("");
    }

    public Pesanan decorate(String cpu, String motherboard, String ram, String storage, String videocard, String psu, String pccase){
        
        if(cpu.equals("i38100")){
            pesanan = new CPU1(pesanan);
        }
        else if(cpu.equals("i57400")){
            pesanan = new CPU2(pesanan);
        }
        else if(cpu.equals("i59400")){
            pesanan = new CPU3(pesanan);
        }
        else if(cpu.equals("i59600")){
            pesanan = new CPU4(pesanan);
        }
        else if(cpu.equals("i79700")){
            pesanan = new CPU5(pesanan);
        }
        else{pesanan = new CPU0(pesanan);}
        
        if(motherboard.equals("asrockb360m")){
            pesanan = new Motherboard1(pesanan);
        }
        else if(motherboard.equals("asusrogh370")){
            pesanan = new Motherboard2(pesanan);
        }
        else if(motherboard.equals("asustufb360")){
            pesanan = new Motherboard3(pesanan);
        }
        else if(motherboard.equals("gigabyteb360")){
            pesanan = new Motherboard4(pesanan);
        }
        else if(motherboard.equals("msib360")){
            pesanan = new Motherboard5(pesanan);
        }
        else{pesanan = new Motherboard0(pesanan);}
        
        if(ram.equals("apacer8gb")){
            pesanan = new RAM1(pesanan);
        }
        else if(ram.equals("corsair8gb")){
            pesanan = new RAM2(pesanan);
        }
        else if(ram.equals("corsair16gb")){
            pesanan = new RAM3(pesanan);
        }
        else if(ram.equals("team16gb")){
            pesanan = new RAM4(pesanan);
        }
        else if(ram.equals("corsair32gb")){
            pesanan = new RAM5(pesanan);
        }
        else{pesanan = new RAM0(pesanan);}
        
        if(storage.equals("seagate1tb")){
            pesanan = new Storage1(pesanan);
        }
        else if(storage.equals("seagate2tb")){
            pesanan = new Storage2(pesanan);
        }
        else if(storage.equals("wd1tb")){
            pesanan = new Storage3(pesanan);
        }
        else if(storage.equals("wd2tb")){
            pesanan = new Storage4(pesanan);
        }
        else{pesanan = new Storage0(pesanan);}
        
        if(videocard.equals("rx570")){
            pesanan = new VideoCard1(pesanan);
        }
        else if(videocard.equals("rx580")){
            pesanan = new VideoCard2(pesanan);
        }
        else if(videocard.equals("gtx1660ti")){
            pesanan = new VideoCard3(pesanan);
        }
        else if(videocard.equals("rtx2060")){
            pesanan = new VideoCard4(pesanan);
        }
        else if(videocard.equals("rtx2080ti")){
            pesanan = new VideoCard5(pesanan);
        }
        else{pesanan = new VideoCard0(pesanan);}
        
        if(psu.equals("corsaircx550m")){
            pesanan = new PSU1(pesanan);
        }
        else if(psu.equals("corsaircx650m")){
            pesanan = new PSU2(pesanan);
        }
        else if(psu.equals("corsairvs450")){
            pesanan = new PSU3(pesanan);
        }
        else if(psu.equals("corsairvs550")){
            pesanan = new PSU4(pesanan);
        }
        else if(psu.equals("cougarvte500")){
            pesanan = new PSU5(pesanan);
        }
        else{pesanan = new PSU0(pesanan);}
        
        if(pccase.equals("coolermb510")){
            pesanan = new Case1(pesanan);
        }
        else if(pccase.equals("coolertd500")){
            pesanan = new Case2(pesanan);
        }
        else if(pccase.equals("cougarmx340")){
            pesanan = new Case3(pesanan);
        }
        else if(pccase.equals("cougarpanzer")){
            pesanan = new Case4(pesanan);
        }
        else if(pccase.equals("cubegaming")){
            pesanan = new Case5(pesanan);
        }
        else{pesanan = new Case0(pesanan);}
        
        return pesanan;
    }
}
