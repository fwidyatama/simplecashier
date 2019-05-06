package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class CPU4 extends CPUDecorator {
    Pesanan pesanan;

    public CPU4(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 3980000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "CPU : Intel Core i5-9600K \n";
    }
}
