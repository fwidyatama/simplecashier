package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class VideoCard4 extends VideoCardDecorator {
    Pesanan pesanan;

    public VideoCard4(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 6400000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Video Card : ASUS DUAL GeForce RTX 2060 OC edition 6GB GDDR6 \n";
    }
}
