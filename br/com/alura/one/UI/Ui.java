package br.com.alura.one.UI;

import java.util.Scanner;

public class Ui {

    private static Scanner sc;

    public Ui(Scanner sc){
        this.sc = sc;
    }

    public void printMenuInicial(){
        System.out.print("""
                ╔═══════════════════════════════════════════════════╗
                ║       Seja bem vindo ao conversor de Moedas!      ║
                ╠═══════════════════════════════════════════════════╣
                ║                                                   ║
                ║   [1] Dólar --> Peso Argentino                    ║
                ║   [2] Peso Argentino --> Dólar                    ║
                ║   [3] Dólar --> Real Brasileiro                   ║
                ║   [4] Real Brasileiro --> Dólar                   ║
                ║   [5] Dólar --> Peso Colombiano                   ║
                ║   [6] Peso Colombiano --> Dólar                   ║
                ║   [7] Sair                                        ║
                ║                                                   ║
                ╠═══════════════════════════════════════════════════╣
                """);
    }

    public String pegarOpcaoMenu(){
        System.out.print("""
                ║  Digite abaixo a opção desejada:                  ║
                ╠═══════════════════════════════════════════════════╝
                """);
        System.out.print("╚════>> ");
        return sc.nextLine();
    }

    public void opcaoInvalida(){
        System.out.println("""
                ╔═══════════════════════════════════════════════════╗
                ║  A opção digitada é inválida! Tente novamente     ║
                ╚═══════════════════════════════════════════════════╝""");
    }

    //TODO: verificar valores negativos
    public double pegarOpcaoConverter(){
        System.out.print("""
                ╔═══════════════════════════════════════════════════╗
                ║  Digite o valor a ser convertido:                 ║
                ╠═══════════════════════════════════════════════════╝
                """);
        System.out.print("╚════>> ");
        return Double.parseDouble(sc.nextLine());
    }

    public void exibirConversao(String moedaBase, String moedaAlvo, double valorConvertido, double valorConverter) {

        String toFormat =
                String.format("║  %.2f %s equivalem a %.2f %s  ║",valorConverter, moedaBase,valorConvertido,moedaAlvo);

        System.out.println("╔" + "═".repeat(toFormat.length() - 2) + "╗");
        System.out.println(toFormat);
        System.out.println("╚" + "═".repeat(toFormat.length() - 2) + "╝");
    }
}
