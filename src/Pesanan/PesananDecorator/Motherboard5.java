package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class Motherboard5 extends MotherboardDecorator {
    Pesanan pesanan;

    public Motherboard5(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 1950000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Motherboard : MSI B360 GAMING PRO CARBON \n";
    }
}
