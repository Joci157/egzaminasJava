package com.company.bazine;

public interface Klientas {

    int getAsmensKodas();
    int getAmzius();
    String getValiuta();
    double getIndelioSuma();
    void setAsmensKodas(int asmensKodas);
    void setAmzius(int amzius);
    void setValiuta(String valiuta);
    void setIndelioSuma(double indelioSuma);

}
