package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class PSU0 extends PSUDecorator {
    Pesanan pesanan;

    public PSU0(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 0 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Power Supply :  \n";
    }
}
