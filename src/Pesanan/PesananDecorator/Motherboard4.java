package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class Motherboard4 extends MotherboardDecorator {
    Pesanan pesanan;

    public Motherboard4(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 1999000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Motherboard : Gigabyte B360 AORUS Gaming 3 \n";
    }
}
