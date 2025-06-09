public class Aula06Switch {
    // Imprima o dia da semana, considerando 1 como domingo:
    public static void main(String[] args) {
        byte dia = 2;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        // Desenvolva um programa que imprima o sexo do usuário
        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Sexo inválido!");

        }
    }
}
/* também é uma estrutura condicional
Com Ifs, ficaria assim:
    if (dia == 1){
            System.out.println("Domingo");
    }else if{
            System.out.println("Segunda-Feira");
        }
        ...
SWITCH:
switch()
char, int, byte, short, enum e String (unicos tipos de variaveis para colocar dentro de Switch)
 */