public class Aula04Operadores {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 4;
        System.out.println("O valor da soma entre os número é "+n1+n2);

        int resto = 21 % 7;
        // = 0, da p descobrir se é par ou ímpar

        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualQueDez = 10 == 10;
        boolean isDezDiferenteQueVinte = 10 != 20;
        boolean isDezDiferenteQueDez = 10 != 10;
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezIgualQueVinte);
        System.out.println(isDezIgualQueDez);
        System.out.println(isDezDiferenteQueVinte);
        System.out.println(isDezDiferenteQueDez);
        // regra de conveção de devs java: sempre em valores booleanos põe-se "is" na frente do nome da var

        // AND/&&
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        // OR/||
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel: "+isPlaystationCincoCompravel);

        double bonus = 1800; // reutilizar ou mudar o valor da variável, não se identifica o tipo da variável
        bonus = bonus + 1000;
        bonus += 1000; // Para isso que servem os operadores de atribuição
        System.out.println(bonus);
        bonus -= 1000;
        System.out.println(bonus);
        bonus *= 2;
        System.out.println(bonus);
        bonus /= 2;
        System.out.println(bonus);
        bonus %= 2;
        System.out.println(bonus);

        // Incremento
        int contador = 0;
        //contador += 1; contador = contador + 1
        contador++; // contador = contador +1
        contador--; // contador = contador -1
        System.out.println(contador);
    }
}
/*
Operadores aritméticos são a mema fita do python + - * e /
A única coisa que muda é que quando concatenamos em python, utilizamos vírgula e em Java o "+"
Então, será sempre concatenado a partir de uma String
Ex.:
int n1 = 2;
int n2 = 3;
sout(n1 + n2);
Output: 5

Porém:
int n1 = 2;
int n2 = 3;
sout("O valor da soma entre os numeros é "+n1 +n2)
Output: O valor da soma entre os número é 23

Se eu colocar parênteses, aí faz a soma normal
sout("O valor da soma entre os numeros é "+(n1+n2));
Output: O valor da soma entre os numero é 5

Operadores relacionais:
<
>
<=
>=
== igual (não atribui valores igual ao "=") é de comparação e não atribuição
!= diferente
Sempre retornarão valores booleanos

NÃO É INTERESSANTE USAR O OPERADOR DE COMPARAÇÃO ENTRE STRINGS - vai ter um erro de compilação

Operadores Lógicos:
&& = and
|| = or

Operadores de Atribuição:
=, +=, -=, *=, /= e %=
--> Economizar código

INCREMETOS:
Só funciona de 1 em 1 ++ ou --

Diferença entre colocá-los antes ou depois:
Depende do que você quer que seja executado primeiro
Exemplo:
sout(contador++);
--> vai imprimir valor da variável sem incrementar, pois o incremento será realizado posteriormente ao sout
sout(++contador);
--> vai imprimir o valor da variável já incrementado.
 */