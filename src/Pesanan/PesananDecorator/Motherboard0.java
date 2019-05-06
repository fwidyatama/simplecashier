package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class Motherboard0 extends MotherboardDecorator {
    Pesanan pesanan;

    public Motherboard0(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 0 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Motherboard : \n";
    }
}
