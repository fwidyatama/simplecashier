package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class CPU1 extends CPUDecorator {
    Pesanan pesanan;

    public CPU1(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 2100000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "CPU : Intel Core i3-8100 \n";
    }
}
