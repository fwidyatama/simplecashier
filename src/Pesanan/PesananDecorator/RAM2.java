package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class RAM2 extends RAMDecorator {
    Pesanan pesanan;

    public RAM2(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 885000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Memory : Corsair Vengeance LPX (2x4) 8GB 2666MHz \n";
    }
}
