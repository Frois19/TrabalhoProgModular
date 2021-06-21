package com.company.automovel;

import java.util.Date;

public class Rota {
    private Date data;
    private int kmRota;

    public Rota(Date data, int kmRota){
        this.data = data;
        this.kmRota = kmRota;
    }

    public Date getData() {
        return data;
    }

    public int getKmRota() {
        return kmRota;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setKmRota(int kmRota) {
        this.kmRota = kmRota;
    }
}
