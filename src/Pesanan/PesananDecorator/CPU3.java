package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class CPU3 extends CPUDecorator {
    Pesanan pesanan;

    public CPU3(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 2470000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "CPU : Intel Core i5-9400F \n";
    }
}
