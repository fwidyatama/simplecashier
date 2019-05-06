package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class VideoCard2 extends VideoCardDecorator {
    Pesanan pesanan;

    public VideoCard2(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 3650000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Video Card : SAPPHIRE NITRO+ Radeon RX 580 8GD5 OC \n";
    }
}
