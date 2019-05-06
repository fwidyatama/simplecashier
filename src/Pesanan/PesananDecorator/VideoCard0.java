package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class VideoCard0 extends VideoCardDecorator {
    Pesanan pesanan;

    public VideoCard0(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 0 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Video Card :  \n";
    }
}
