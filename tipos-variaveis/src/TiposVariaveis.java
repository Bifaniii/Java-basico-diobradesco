public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        int anoFabricacao = 2021;
        double salarioMinimo = 2500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
    }
}

// Tipos primitivos:
// byte - -128 a 127 -------------------------------------------------- 1 byte (idade)
// short - -32.768 a 32.767 ------------------------------------------- 2 bytes (ano)
// int - -2.147.483.648 a 2.147.483.647 ------------------------------- 4 bytes (CEP) --> JVM sempre tenta converter para INT, mesmo podendo ser menor. Por convenção utilizamos popularmente o INT
// long - -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 ------ 8 bytes (CPF) --> deve terminar com L, para não confundir com INT
// long e int podem dar problemas se iniciar o número com 0, talvez tenha que ser outro tipo (exemplo: String)

//                  Fracionárias
// float: -3,4028E + 38   a 3,4028E +38 ----------- 4 bytes (PI) 3.14F; (sempre tem um F no final, para não confundir com double)
// double: -1,7976E + 308 a 1,7976E + 308 --------- 8 bytes (salario) --> mais comum para ter mais precisão dos valores

// boolean
// char

// Estrutura de declaração:
// <Tipo> <NomeVariavel> <atribuicaoDeValorOpcional>
// Exemplo dentro do public static

// short numeroCurto = 1;
// int numeroNormal = numeroCurto;
// short numeroCurto2 = numeroNormal;
// --> CASTING: Pega um número mais abrangente e converte para um tipo mais específico porque é o mais correspondente.
// short numeroCurto = 1;
// int numeroNormal = numeroCurto;
// short numeroCurto2 = (short) numeroNormal;

// Constante = o valor não muda, então utilizamos "final" antes da declaração do tipo da variável
// Ex.: final double VALOR_DE_PI = 3.14;