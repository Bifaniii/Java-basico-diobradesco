import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = input.nextInt();

        System.out.println("Digite um operador aritmético:\n" +
                "1 - Adição\n" +
                "2 - Subtração\n" +
                "3 - Multiplicação\n" +
                "4 - Divisão");
        int operator = input.nextInt();

        int plus = n1 + n2;
        int subt = n1 - n2;
        int mult = n1 * n2;
        int div = n1 / n2;


        if (operator == 1) {
            System.out.println(plus);
        } else if (operator == 2) {
            System.out.println(subt);
        } else if (operator == 3) {
            System.out.println(mult);
        } else if (operator == 4) {
            if (n2 != 0) {
                System.out.println(div);
            } else {
                System.out.println("Erro: divisão por zero!");
            }
        } else {
            System.out.println("Operador inválido!");
        }
        input.close();
    }
}
