package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class CPU5 extends CPUDecorator {
    Pesanan pesanan;

    public CPU5(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 6630000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "CPU : Intel Core i7-9700K \n";
    }
}
