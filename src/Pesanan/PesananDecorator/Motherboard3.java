package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class Motherboard3 extends MotherboardDecorator {
    Pesanan pesanan;

    public Motherboard3(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 2099000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Motherboard : ASUS TUF B360 PRO Gaming \n";
    }
}
