package Usuario;

import Dispositivos.Telefone.*;
import Dispositivos.Musica.*;
import Dispositivos.Internet.*;
import Dispositivos.Apple.*;


public class User {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();
        NavegadorDeinternet safari = new ExibePagina();
        ReprodutorDeMusica itunes = new Tocar();
        AparelhoTelefonico telefone = new Ligar();

        System.out.println("Sistema Antes do Iphone: ");
        safari.Navegador();
        itunes.Reprodutor();
        telefone.Telefone();
        System.out.println("");
        System.out.println("");


        // Testando os métodos de NavegadorDeinternet
        System.out.println("Navegador Iphone: ");
        meuIphone.ExibePagina();
        meuIphone.AtualizaPagina();
        meuIphone.AdicionandoNovaAba();
        System.out.println(" ");
        // Testando os métodos de ReprodutorDeMusica
        System.out.println("Apliativo de Musica Iphone: ");
        meuIphone.Tocar();
        meuIphone.Pausa();
        meuIphone.SelecionarMusica();
        System.out.println(" ");

        // Testando os métodos de AparelhoTelefonico
        System.out.println("Aplicativo de telefone Iphone: ");
        meuIphone.Ligar();
        meuIphone.Atender();
        meuIphone.InciaCorreioDeVoz();
    }
}

