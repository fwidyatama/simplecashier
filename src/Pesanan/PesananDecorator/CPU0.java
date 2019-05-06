package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class CPU0 extends CPUDecorator {
    Pesanan pesanan;

    public CPU0(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 0 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "CPU : \n";
    }
}
