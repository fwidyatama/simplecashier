package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class RAM1 extends RAMDecorator {
    Pesanan pesanan;

    public RAM1(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 680000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Memory : Apacer Panther Golden 8GB DDR4 PC19200 2400MHz \n";
    }
}
