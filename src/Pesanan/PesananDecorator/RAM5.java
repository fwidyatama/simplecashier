package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class RAM5 extends RAMDecorator {
    Pesanan pesanan;

    public RAM5(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 3775000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Memory : Corsair Vengeance RGB 32GB (2x16GB) DDR4 3200MHz \n";
    }
}
