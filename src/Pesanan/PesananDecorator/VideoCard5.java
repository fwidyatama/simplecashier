package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class VideoCard5 extends VideoCardDecorator {
    Pesanan pesanan;

    public VideoCard5(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 24990000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Video Card : ASUS ROG Strix GeForce RTX 2080 Ti OC edition 11GB GDDR6 \n";
    }
}
