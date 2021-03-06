package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class Case3 extends CaseDecorator {
    Pesanan pesanan;

    public Case3(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 590000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Case : COUGAR MX340 Tempered Glass Mid Tower Gaming Case \n";
    }
}
