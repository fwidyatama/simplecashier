package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class Motherboard2 extends MotherboardDecorator {
    Pesanan pesanan;

    public Motherboard2(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 2680000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Motherboard : ASUS ROG STRIX H370-F Gaming \n";
    }
}
