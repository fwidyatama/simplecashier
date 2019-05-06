package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class VideoCard1 extends VideoCardDecorator {
    Pesanan pesanan;

    public VideoCard1(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 1950000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Video Card : Asrock Radeon RX 570 PHANTOM GAMING D 4GB GDDR5 \n";
    }
}
