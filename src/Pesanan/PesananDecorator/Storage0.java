package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class Storage0 extends StorageDecorator {
    Pesanan pesanan;

    public Storage0(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 0 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Storage :  \n";
    }
}
