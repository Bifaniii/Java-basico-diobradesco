public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Parâmetros iniciais:");
        System.out.println("Tv ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.desligar();
        System.out.println("Novo status --> Tv ligada: " + smartTv.ligada);
        smartTv.ligar();
        System.out.println("Novo status --> Tv ligada: " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();       
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.descerCanal();
        smartTv.descerCanal();

        smartTv.mudarCanal(13);
        System.out.println("Definindo canal para: " + smartTv.canal);


       System.out.println("Final dos parâmetros: ");
       System.out.println("Status da Tv: " + smartTv.ligada);
       System.out.println("O volume está em: " + smartTv.volume);
       System.out.println("O canal definido é o: " + smartTv.canal);
    }
}
