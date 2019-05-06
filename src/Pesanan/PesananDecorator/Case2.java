package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class Case2 extends CaseDecorator {
    Pesanan pesanan;

    public Case2(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 1070000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Case : Cooler Master MasterBox TD500 Diamond Cut Gaming Case \n";
    }
}
