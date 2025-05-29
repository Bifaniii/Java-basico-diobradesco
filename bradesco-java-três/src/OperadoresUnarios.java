public class OperadoresUnarios {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(numero);
        System.out.println(-numero); // ----> Não muda o valor da variável, somente imprime de forma negativa. Mas, seu real valor ainda é positivo. 
//                                             Para mudar --> int numero = 5;
//                                                            numero = -numero;                                                                                                     
//                                             E, se for negativo e quiser mudar para positivo ------> int numero = -5;
//                                                                                                     numero = numero * -1;
        System.out.println(numero ++);
        System.out.println(numero);
        System.out.println(++ numero);
        System.out.println(numero);
        System.out.println(-- numero);
        System.out.println(numero);
        System.out.println(numero --);
        System.out.println(numero);

        boolean variavel = true;
//                                         PARA INVERTER BOOLEANS
        variavel = !variavel;
        System.out.println(variavel);
    
    }
}
/// Operador unário de valor positivo (+)
/// Operador unário de valor negativo (-)
/// Operador unário de incremento de valor (++)
/// Operador unário de decremento de valor (--)
/// Operador unário de negação (!)
 // --> Exemplos dentro do Sysout

 
/// REPETIÇÃO
/// int numero = numero +1;
/// é a mesma coisa que dizer:
/// numero++;
 
/// System.out.println(numero ++); --> vai continuar sendo o valor da variável sem alteração e posteriormente adicionará +1, mas não vai imprimir
/// System.out.println(numero); --> agora vai estar com o valor atualizado.

/// Para realizar a incrementação e posteriormente a impressão, deve-se escrever:
/// System.ot.println( ++ numero);