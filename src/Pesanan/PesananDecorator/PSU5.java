package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class PSU5 extends PSUDecorator {
    Pesanan pesanan;

    public PSU5(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 680000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Power Supply : COUGAR VTE500 500W 80+ Bronze Certification \n";
    }
}
