public class Metodos {
    public static void main(String[] args) {
    }
}
/// Uma classe é definida por atributos e métodos.
/// Atributos --> Em sua grande maioria, variáveis.
/// Métodos ----> Funções ou sub-rotinas disponíveis dentro de nossas classes.
/// Ex.: Freiar, buzinar, etc.
 
/// Critérios de nomeação de Métodos:
/// Verbos no infinitivo;
/// CamelCase ---> Todas as letras minúsculas com exceção da primeira letra da segunda palavra. ex.: calcularImposto
 
/// EXEMPLOS:
 
/// somar (int n1, int n2){} ---> método somar que recebe 2 parâmetros ---> sempre {} no final
/// findById (int id){}
 
/// EM JAVA NÃO EXISTE O CONCEITO DE MÉTODOS GLOBAIS!
 
/// 1- Qual a proposta principal do método, 2 - Qual o tipo de retorno esperado após executar o método?
 
/// Caso não retorne nenhum valor int, double, long, String, etc --> Será representado por "void"

/// Parâmetros e exceções!!!
/// 
/// Visibilidades de um método:
/// 1- Toda a aplicação
/// 2- Somente em mesmos pacotes
/// 3- Através de herança
/// 4- Somente a nível da própria classe
/// 
///  public double somar(int num1, int num2){
//     return...;
//}

/// throws Exception{}
/// public double dividir(int dividendo, int divisor) throws Exception{}
/// 
/// private void metodoPrivado(){} ----> Este método não pode ser visto por outras classes