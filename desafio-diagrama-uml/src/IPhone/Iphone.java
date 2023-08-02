package IPhone;
import Browser.InternetBrowser;
import MusicPlayer.MusicPlayer;
import Phone.Phone;

public class Iphone implements MusicPlayer, Phone, InternetBrowser {
    // iPhone implementation goes here

    @Override
    public void tocar() {
        System.out.println("Playing Music!");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada!");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }
}
