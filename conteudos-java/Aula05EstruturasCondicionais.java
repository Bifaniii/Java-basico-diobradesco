public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
// boolen, só executa se a condição for verdadeira
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoólica!");
        }
        if (!isAutorizadoComprarBebida) {   // Operador de negação "!"
            System.out.println("Não autorizado a comprar bebida alcoólica!");
        }
        System.out.println("Fora do if");
    }
}

// Parei em 21 - Estruturas condicionais pt 02 - ELSE IF