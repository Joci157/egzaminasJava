package com.company;

import com.company.isvestine.VipinisKlientasImpl;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        VipinisKlientasImpl vipinisKlientas1 = new VipinisKlientasImpl(123, 22, "EUR", 324, 12, 0.6);
        VipinisKlientasImpl vipinisKlientas2 = new VipinisKlientasImpl(456, 46, "EUR", 89.46, 2, 0.2);
        VipinisKlientasImpl vipinisKlientas3 = new VipinisKlientasImpl(789, 31, "EUR", 764.34, 3, 0.6);
        VipinisKlientasImpl vipinisKlientas4 = new VipinisKlientasImpl(321, 20, "EUR", 2021.852, 10, 0.8);
        VipinisKlientasImpl vipinisKlientas5 = new VipinisKlientasImpl(654, 61, "EUR", 324, 20, 0.1);
        VipinisKlientasImpl vipinisKlientas6 = new VipinisKlientasImpl(987, 50, "EUR", 6324, 1, 0.6);
        VipinisKlientasImpl vipinisKlientas7 = new VipinisKlientasImpl(741, 58, "EUR", 52.47, 15, 0.6);
        VipinisKlientasImpl vipinisKlientas8 = new VipinisKlientasImpl(852, 29, "EUR", 1000, 7, 0.4);
        VipinisKlientasImpl vipinisKlientas9 = new VipinisKlientasImpl(963, 24, "EUR", 6222.40, 11, 0.6);
        VipinisKlientasImpl vipinisKlientas10 = new VipinisKlientasImpl(258, 36, "EUR", 1000, 4, 0.9);

        ArrayList<VipinisKlientasImpl> klientai = new ArrayList<>();
        klientai.add(vipinisKlientas1);
        klientai.add(vipinisKlientas2);
        klientai.add(vipinisKlientas3);
        klientai.add(vipinisKlientas4);
        klientai.add(vipinisKlientas5);
        klientai.add(vipinisKlientas6);
        klientai.add(vipinisKlientas7);
        klientai.add(vipinisKlientas8);
        klientai.add(vipinisKlientas9);
        klientai.add(vipinisKlientas10);


        System.out.println("Visų klientų informacija: \n");
        spausdintiVisuKlientuInformacija(klientai);

        System.out.println("\nKALĖDINĖ AKCIJA, Klientų, kurių priedas buvo 0.6 dabar: 0.8\n");
        pakeistiKlientuPrieda(klientai);
        spausdintiVisuKlientuInformacija(klientai);

        System.out.println("\nSurūšiuoti klientai mažėjimo tvarka, pagal indėlio sumą, jeigu indėlio suma vienoda - pagal amžių\n");
        Collections.sort(klientai);
        spausdintiVisuKlientuInformacija(klientai);

        pateiktiDuomenisApieKlientaPagalAsmensKoda(klientai);

        System.out.println("\nPašalinami klientai, kurių indėlio suma yra mažesnė nei 100\n");
        pasalintiKlientusKuriuIndeliuSumaMaziauNeiSimtas(klientai);
        spausdintiVisuKlientuInformacija(klientai);
        System.out.println("\nKALĖDOS - STEBUKLŲ METAS - sukeičiamas didžiausias ir mažiausias indėlis\n");
        sukeistiDidziausioIrMaziausioIndeliuSumas(klientai);
        spausdintiVisuKlientuInformacija(klientai);


    }


    public static void spausdintiVisuKlientuInformacija(ArrayList<VipinisKlientasImpl> klientai){
        Iterator<VipinisKlientasImpl> iteratorius = klientai.iterator();

        while (iteratorius.hasNext()){
            VipinisKlientasImpl vipKlientas = iteratorius.next();
            System.out.println(vipKlientas);
        }
    }

    public static void pakeistiKlientuPrieda(ArrayList<VipinisKlientasImpl> klientai){
        Iterator<VipinisKlientasImpl> iteratorius = klientai.iterator();
        while(iteratorius.hasNext()){
            VipinisKlientasImpl vipKlientas = iteratorius.next();
            if(vipKlientas.getPriedas()==0.6){
                vipKlientas.setPriedas(0.8);
            }
        }
    }

    public static void pateiktiDuomenisApieKlientaPagalAsmensKoda(ArrayList<VipinisKlientasImpl> klientai){

        boolean testi = true;

        while (testi) {

            try {
                Scanner S = new Scanner(System.in);
                System.out.println("\n");
                System.out.println("Įveskite asmens kodą:");
                int ivestasAsmensKodas = S.nextInt();

                for (VipinisKlientasImpl klient : klientai) {
                    if (ivestasAsmensKodas == klient.getAsmensKodas()) {
                        System.out.println(klient);
                    }
                }
                testi = false;
            } catch (InputMismatchException e) {
                System.out.println("Pasitikrinkite ar gerai įvedėte asmens kodą!");
            }
        }
    }

    public static void sukeistiDidziausioIrMaziausioIndeliuSumas(ArrayList<VipinisKlientasImpl> klientai){
        VipinisKlientasImpl min = klientai.get(0);
        VipinisKlientasImpl max = klientai.get(0);

        double minIndelis = min.getIndelioSuma();
        double maxIndelis  = max.getIndelioSuma();



        for(VipinisKlientasImpl klient : klientai){
            if(klient.getIndelioSuma() < min.getIndelioSuma()) {
                min = klient;
                minIndelis = klient.getIndelioSuma();
            }
            if(klient.getIndelioSuma() > max.getIndelioSuma()) {
                max = klient;
                maxIndelis = klient.getIndelioSuma();
            }
        }

        int minIndex = klientai.indexOf(min);
        klientai.get(minIndex).setIndelioSuma(maxIndelis);

        int maxIndex = klientai.indexOf(max);
        klientai.get(maxIndex).setIndelioSuma(minIndelis);

    }

    public static void pasalintiKlientusKuriuIndeliuSumaMaziauNeiSimtas(ArrayList<VipinisKlientasImpl> klientai){
        Iterator<VipinisKlientasImpl> iteratorius = klientai.iterator();

        while(iteratorius.hasNext()){
            VipinisKlientasImpl vipKlientas = iteratorius.next();
            if(vipKlientas.getIndelioSuma()<100 && vipKlientas.getValiuta()=="EUR"){
                iteratorius.remove();
            }
        }
    }
}
