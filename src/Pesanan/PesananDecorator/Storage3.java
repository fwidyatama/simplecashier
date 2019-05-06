package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class Storage3 extends StorageDecorator {
    Pesanan pesanan;

    public Storage3(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 635000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Storage : WD Caviar Blue 1 TB HDD \n";
    }
}
