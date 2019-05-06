package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class Storage4 extends StorageDecorator {
    Pesanan pesanan;

    public Storage4(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 895000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Storage : WD Caviar Blue 2 TB HDD \n";
    }
}
