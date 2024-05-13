package br.com.alura.one.main;

import br.com.alura.one.UI.Ui;
import br.com.alura.one.model.Requisitor;
import com.google.gson.Gson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ui interfaceUsuario = new Ui(sc);
        Requisitor requisitor = new Requisitor();


//        System.out.println("Hello world");
//        Gson gson = new Gson();
//        var resposta = requisitor
//                .requisitar("https://v6.exchangerate-api.com/v6/0fd62c5003af3ecad869c4f1/latest/USD");
//
//        System.out.println(resposta.body());

        boolean continuar = true;
        String opcao;

        while (continuar){
            interfaceUsuario.printMenuInicial();
            opcao = interfaceUsuario.pegarOpcao();

            switch (opcao){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    continuar = false;
                    break;
                default:
                    interfaceUsuario.opcaoInvalida();
                    break;
            }
        }
    }
}
