public class SmartTv {
    boolean ligada = true;
    int canal = 1;
    int volume = 50;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando o volume para " + volume);
    }
    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo o volume para " + volume);
    }

    public void subirCanal(){
        canal ++;
        System.out.println("Subindo o canal para " + canal);
    }
    public void descerCanal(){
        canal --;
        System.out.println("Diminuindo o canal para " + canal);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;

    }


}