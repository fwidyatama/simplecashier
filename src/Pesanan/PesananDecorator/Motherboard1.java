package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class Motherboard1 extends MotherboardDecorator {
    Pesanan pesanan;

    public Motherboard1(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 1320000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Motherboard : Asrock B360M Pro4 \n";
    }
}
