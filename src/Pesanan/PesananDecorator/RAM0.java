package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class RAM0 extends RAMDecorator {
    Pesanan pesanan;

    public RAM0(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 0 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Memory : \n";
    }
}
