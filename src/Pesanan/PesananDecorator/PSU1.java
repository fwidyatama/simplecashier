package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class PSU1 extends PSUDecorator {
    Pesanan pesanan;

    public PSU1(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 1130000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Power Supply : Corsair CX550M Modular 80+ Bronze Certified \n";
    }
}
