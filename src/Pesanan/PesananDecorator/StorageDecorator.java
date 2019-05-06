package Pesanan.PesananDecorator;

import Pesanan.Pesanan;

public abstract class StorageDecorator extends Pesanan{
    @Override
    public abstract String getDescription();
}
