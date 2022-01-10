package com.company.bazine;

public class KlientasImpl implements Klientas{

    private int asmensKodas;
    private int amzius;
    private String valiuta;
    private double indelioSuma;

    public KlientasImpl(int asmensKodas, int amzius, String valiuta, double indelioSuma){
        this.asmensKodas = asmensKodas;
        this.amzius = amzius;
        this.valiuta = valiuta;
        this.indelioSuma = indelioSuma;
    }

    @Override
    public int getAsmensKodas() {
        return asmensKodas;
    }

    @Override
    public int getAmzius() {
        return amzius;
    }

    @Override
    public String getValiuta() {
        return valiuta;
    }

    @Override
    public double getIndelioSuma() {
        return indelioSuma;
    }

    @Override
    public void setAsmensKodas(int asmensKodas) {
        this.asmensKodas = asmensKodas;
    }

    @Override
    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }

    @Override
    public void setValiuta(String valiuta) {
        this.valiuta = valiuta;
    }

    @Override
    public void setIndelioSuma(double indelioSuma) {
        this.indelioSuma = indelioSuma;
    }

    @Override
    public String toString() {
        return "KlientasImpl{" +
                "asmensKodas=" + asmensKodas +
                ", amzius=" + amzius +
                ", valiuta='" + valiuta + '\'' +
                ", indelioSuma=" + indelioSuma +
                '}';
    }
}
