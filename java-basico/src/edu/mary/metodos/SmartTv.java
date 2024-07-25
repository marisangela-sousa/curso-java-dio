package edu.mary.metodos;

public class SmartTv {
    // SmartTv
    // caracteristicas: ligada(boolean), canal(int), volume(int)
    // poderá ligar e desligar e assim mudar o estado ligada
    // poderá aumentar o volume e diminuir em +1 ou -1
    // poderá mudar de canal de 1 em 1 ou definindo o numero correspondente

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }
    public void aumentarCanal() {
        canal++;
    }
    public void diminuirCanal() {
        canal--;
    }

    public void aumentarVolume()  {
        volume++;
    }
    public void diminuirVolume()  {
        volume--;
    }

    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
}
