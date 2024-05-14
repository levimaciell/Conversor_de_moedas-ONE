package br.com.alura.one.model;

public class Conversor {

    public static String concatenarUrl(String urlBase, String codBase, String codigoAlvo){
        return urlBase + codBase + "/" + codigoAlvo;
    }

    public static double converterValor(TaxaConversao taxa, double valor){
        double valorTaxa = Double.parseDouble(taxa.conversion_rate());
        return valorTaxa * valor;
    }

}
