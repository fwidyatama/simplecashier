package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class Case4 extends CaseDecorator {
    Pesanan pesanan;

    public Case4(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 1425000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Case : COUGAR Panzer G \n";
    }
}
