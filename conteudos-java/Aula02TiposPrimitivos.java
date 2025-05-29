public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int age = 3;
        long numeroGrande = 100000L;    // tmb n precisa do L
        double salarioDouble = 2000.0; // por padrão já vai, n precisa colocar 2000.0d ou 2000.0D, mas funciona
        float salarioFloat = 2500.0f;
        byte idade = 127;
        short idade1 = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere  = 'M';      // Pode ser numérico também, os únicos que não são: boolean e String
        String nome = "Guilherme";  // STRING NÃO É UM TIPO DE VARIÁVEL, É UMA CLASSE!!!!!!! por isso maiusculo

        System.out.println("A idade é: " + age + " anos");
        System.out.println(numeroGrande);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(idade1);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(nome);
        System.out.println(idade);
    }
}




/*  int, double, float, char, byte, short, long, boolean 8 tipos escritos em letra minúscula
Variáveis são ao contrário do nome do arquivo, primeiro minúsculo e dps maiúsculo

Casting --> Força o java a definir uma variável
Ex.:
int numero = 100000000;
O número é muito grande para o int, então forçamos com o tipo Long para entender que queremos independentemente que seja INT
int numero = (int) 10000000L;
Mas, se for usar um SYSOUT nessa variável, vai até rodar. Mas, começará a cortar os bytes para caber, então
sairá um número tipo 1410065408

Não é recomendado fazer isso! Se não está cabendo, o recomendável é trocar o tipo da variável.

DICAS:
PSVM --> pulic static void main(String [] args){}
sout --> System.out.println()


JAVA 10:
var nome = Vegeta;
ESCONDE o tipo da variável


Para não confundir versões e funcionalidades, ao selecionar o nome do projeto e apertar F4, ou botão direito
--> Open Module Settings
É possível realizar a troca de Java 21 (instalado e mais recente) para as demais versões. Neste caso, estamos
utilizando o Java 8
*/