package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class PSU2 extends PSUDecorator {
    Pesanan pesanan;

    public PSU2(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 1230000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Power Supply : Corsair CX650M - 650 Watt 80+ Bronze Certified \n";
    }
}
