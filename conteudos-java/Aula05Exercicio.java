public class Aula05Exercicio {
    public static void main(String[] args) {
    double salarioAnual = 70000;
    double primeiraFaixa = 9.70 / 100;
    double segundaFaixa = 37.45 / 100;
    double terceiraFaixa = 49.50 / 100;
    double valorImposto;

    if (salarioAnual <= 34.712) {
        salarioAnual *= primeiraFaixa;
    } else if (salarioAnual >= 34.713 && salarioAnual <= 68.507) {
        salarioAnual *= segundaFaixa;
    }else {
        salarioAnual *= terceiraFaixa;
    }
        System.out.println(salarioAnual);
    }
}
