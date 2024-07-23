package Dispositivos.Apple;

//Import Internet
import Dispositivos.Internet.NavegadorDeinternet;

//Import Musica
import Dispositivos.Musica.ReprodutorDeMusica;

//Import Telefone
import Dispositivos.Telefone.AparelhoTelefonico;


public class Iphone implements NavegadorDeinternet, ReprodutorDeMusica, AparelhoTelefonico{

    //Metodos de Musica
    public void Tocar() {
        System.out.println("Musica tocando via Iphone");
    }
    public void SelecionarMusica() {
        System.out.println("Selecionando musica via Iphone");
    }
    public void Pausa() {
        System.out.println("Pausando musica via Iphone");
    }

    //Metodos de Telefone
    public void Ligar(){
        System.out.println("Ligando via Iphone");
    }
    public void Atender(){
        System.out.println("Atendendo via Iphone");
    }
    public void InciaCorreioDeVoz(){
        System.out.println("Correio de voz iniciado via Iphone");
    }

    //Metodos de Internet
    public void ExibePagina(){
        System.out.println("Exibindo pagina via Iphone");
    }
    public void AtualizaPagina(){
        System.out.println("Atualizando pagina via Iphone");
    }
    public void AdicionandoNovaAba(){
        System.out.println("Adicionando nova aba via Iphone");
    }
    public void Telefone() {
    }
    public void Reprodutor() {
    }
    public void Navegador() {
    }
}
