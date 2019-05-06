package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public class Storage2 extends StorageDecorator {
    Pesanan pesanan;

    public Storage2(Pesanan pesanan){
        this.pesanan = pesanan;
    }

    @Override
    public long cost() {
        return 890000 + pesanan.cost();
    }

    @Override
    public String getDescription() {
        return pesanan.getDescription() + "Storage : Seagate BarraCuda 2TB HDD \n";
    }
}
