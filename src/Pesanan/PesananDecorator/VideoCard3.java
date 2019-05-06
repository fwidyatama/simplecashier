package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class VideoCard3 extends VideoCardDecorator {
    Pesanan pesanan;

    public VideoCard3(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 4750000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Video Card : ASUS Dual GeForce GTX 1660 Ti OC edition 6GB GDDR6 \n";
    }
}
