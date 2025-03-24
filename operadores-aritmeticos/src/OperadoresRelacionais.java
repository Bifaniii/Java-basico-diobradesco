public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

//        Exemplo_1:
        if(numero1 > numero2)
            System.out.println("Número 1 é maior que o número 2");
        if(numero1 < numero2)
            System.out.println("Número 1 é menor que o número 2");


        boolean simNao = numero1 == numero2;
            System.out.println("numeroUm é igual a numero 2? " + simNao); // --> Retorna false já concatenando com a frase string

        simNao = numero1 != numero2;
            System.out.println("numeroUm é igual a numero 2? " + simNao); // --> Mesmo processo que o de cima, mas retorna true
        

        String nomeUm = "Guilherme";
        String nomeDois = "Guilherme";

        System.out.println(nomeUm == nomeDois); // --> Resulta true
//                                                 --> Se fosse String nomeDois = new "Guilherme"; resultaria false porque há 2 objetos na memória.
//                                                     Portanto, neste caso o melhor seria utilizar o método equals(), que compara dois conteúdos
        String nomeTres = "Bifani";
        String nomeQuatro = new String("Bifani");
        
        System.out.println(nomeTres.equals(nomeQuatro)); // --> Desta forma, retorna verdadeiro porque o método equals analisa o conteúdo de objetos




    }
}
/// == Repara ou compara se há igualdade entre dois valores
/// != Repara ou compara se há diferença entre dois valores
/// >  Repara ou compara se uma variável é maior que a outra
/// <  Repara ou compara se uma variável é menor que a outra
/// <= Repara ou compara se uma variável é menor ou igual que a outra
/// >= Repara ou compara se uma variável é maior ou igual que a outra