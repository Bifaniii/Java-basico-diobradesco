import java.util.Scanner;
import java.time.LocalDate;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ex1(scanner);
        Ex2(scanner);
        Ex3(scanner);
        Ex4(scanner);

        scanner.close();
    }
    // 1 - Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá, fulano você tem 'X' anos.

    public static void Ex1(Scanner scanner) {
        System.out.print("Digite o seu nome: ");
        String name = scanner.next();
        System.out.print("Digite o seu ano de nascimento: ");
        int year = scanner.nextInt();
        int age = LocalDate.now().getYear() - year;
        System.out.printf("Olá, %s você tem %s anos.\n", name, age);
    }

// 2 - Escreva um código que receba o tamanho de um lado do quadrado, calcule sua área e exiba na tela.

    public static void Ex2(Scanner scanner) {
        System.out.print("Digite o tamanho do lado do quadrado que deseja calcular a área: ");
        int lado = scanner.nextInt();
        int area = lado * lado;
        System.out.printf("A área deste quadrado é igual a %s\n", area);
    }
// 3 - Escreva um código que receba a base e a altura de um retângulo, calcule a área e exiba na tela.

    public static void Ex3(Scanner scanner) {
        System.out.print("Enter the side size: ");
        int lado = scanner.nextInt();
        System.out.print("Enter the height size: ");
        int altura = scanner.nextInt();
        int area = lado * altura;
        System.out.printf("A área deste quadrado é igual a %s\n", area);
    }
// 4 - Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas.

    public static void Ex4(Scanner scanner) {
        System.out.print("Enter the age of the first person: ");
        int ageOne = scanner.nextInt();
        System.out.print("Enter the age of the second person: ");
        int ageTwo = scanner.nextInt();
        int diff = Math.abs(ageTwo - ageOne);
        System.out.printf("The age difference is equal %s\n", diff);
    }
}
