package Usuario;

import Dispositivos.Telefone.*;
import Dispositivos.Musica.*;
import Dispositivos.Internet.*;
import Dispositivos.Apple.*;


public class User {
    public static void main(String[] args) {
        ReprodutorDeMusica reprodutor = new Tocar();
        AparelhoTelefonico telefone = new Ligar();
        NavegadorDeinternet navegador = new ExibePagina();
        ReprodutorDeMusica reproduzir = new Iphone();


        reprodutor.Reprodutor();
        telefone.Telefone();
        navegador.Navegador();
        reproduzir.Reprodutor();

    }
}
