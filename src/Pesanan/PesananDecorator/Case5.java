package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class Case5 extends CaseDecorator {
    Pesanan pesanan;

    public Case5(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 490000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Case : Cube Gaming Camarillo Tempered Glass Clean Design Case \n";
    }
}
