package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class Storage1 extends StorageDecorator {
    Pesanan pesanan;

    public Storage1(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 640000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Storage : Seagate BarraCuda 1TB HDD \n";
    }
}
