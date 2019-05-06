package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class PSU3 extends PSUDecorator {
    Pesanan pesanan;

    public PSU3(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 545000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Power Supply : Corsair VS450 - 450W \n";
    }
}
