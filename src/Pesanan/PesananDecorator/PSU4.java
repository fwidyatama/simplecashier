package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class PSU4 extends PSUDecorator {
    Pesanan pesanan;

    public PSU4(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 750000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Power Supply : Corsair VS550 - 550W \n";
    }
}
