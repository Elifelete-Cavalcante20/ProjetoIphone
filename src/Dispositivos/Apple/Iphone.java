package Dispositivos.Apple;

import Dispositivos.Internet.*;
import Dispositivos.Musica.*;
import Dispositivos.Telefone.*;

public class Iphone implements NavegadorDeinternet, ReprodutorDeMusica, AparelhoTelefonico{

    public void Telefone() {
        System.out.println("Ligando via Iphone");
    }
    public void Reprodutor() {
        System.out.println("Tocando musica via iphone");
    }
    public void Navegador() {
        System.out.println("navegadno via iphone");
    }
    
}
