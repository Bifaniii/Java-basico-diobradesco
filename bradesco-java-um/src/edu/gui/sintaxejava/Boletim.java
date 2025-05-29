package edu.gui.sintaxejava;

public class Boletim {
    public static void main(String[] args) {
        int nota = 6;

        if (nota > 6) {
            System.out.println("Aprovado");
        } else if (nota < 6) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Recuperação");
        }
    }
}
