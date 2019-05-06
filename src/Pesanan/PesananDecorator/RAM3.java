package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class RAM3 extends RAMDecorator {
    Pesanan pesanan;

    public RAM3(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 1810000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Memory : Corsair Vengeance RGB 16GB (2x8GB) DDR4 2666MHz \n";
    }
}
