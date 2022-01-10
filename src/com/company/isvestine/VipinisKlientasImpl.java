package com.company.isvestine;

import com.company.bazine.KlientasImpl;

import java.util.Comparator;

public class VipinisKlientasImpl extends KlientasImpl implements VipinisKlientas, Comparable<VipinisKlientasImpl>{

    private double procentas;
    private double priedas;

    public VipinisKlientasImpl(int asmensKodas, int amzius, String valiuta, double indelioSuma, double procentas, double priedas) {
        super(asmensKodas, amzius, valiuta, indelioSuma);
        this.procentas = procentas;
        this.priedas = priedas;
    }


    @Override
    public double getProcentas() {
        return procentas;
    }

    @Override
    public double getPriedas() {
        return priedas;
    }

    @Override
    public void setProcentas(double procentas) {
        this.procentas = procentas;
    }

    @Override
    public void setPriedas(double priedas) {
        this.priedas = priedas;
    }

    @Override
    public String toString() {
        return "VipinisKlientasImpl{" + "asmensKodas=" + getAsmensKodas() +
                ", amzius= " + getAmzius() +
                ", valiuta= " + getValiuta() +
                ", indelioSuma= " + getIndelioSuma() +
                ", procentas= " + procentas +
                ", priedas= " + priedas +
                '}';



    }

    @Override
    public int compareTo(VipinisKlientasImpl klientas) {
        return Comparator
                .comparing(VipinisKlientasImpl::getIndelioSuma)
                .thenComparing(VipinisKlientasImpl::getAmzius)
                .reversed()
                .compare(this, klientas);
    }
}
