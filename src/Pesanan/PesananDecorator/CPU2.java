package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class CPU2 extends CPUDecorator {
    Pesanan pesanan;

    public CPU2(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 2800000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "CPU : Intel Core i5-7400 \n";
    }
}
