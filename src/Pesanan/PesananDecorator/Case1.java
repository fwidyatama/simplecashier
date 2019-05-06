package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class Case1 extends CaseDecorator {
    Pesanan pesanan;

    public Case1(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 820000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Case : Cooler Master MasterBox MB510L Tempered Glass Gaming Case \n";
    }
}
