package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class Case0 extends CaseDecorator {
    Pesanan pesanan;

    public Case0(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 0 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Case :  \n";
    }
}
