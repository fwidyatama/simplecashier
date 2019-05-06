package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class RAM4 extends RAMDecorator {
    Pesanan pesanan;

    public RAM4(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 1740000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Memory : TEAM T-Force Delta RGB (2x8) 16GB DDR4 kit 3000MHz \n";
    }
}
