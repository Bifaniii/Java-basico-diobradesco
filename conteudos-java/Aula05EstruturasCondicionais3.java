public class Aula05EstruturasCondicionais3 {
    public static void main(String[] args) {
        double salario = 6000;
        // Doar se salario > 5000
        String mensagaemDoar = "Eu vou doar quinhentao";
        String mensagemNaoDoar = "Ainda não tenho condições, mas ainda vou ter";
/*      String resultado;
        if (salario > 5000) {
            resultado = mensagaemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }
        ESTRUTURA DE OPERADOR TERNARIO:
        String resultado = (condicao) ? verdadeiro : falso;
*/      String resultado = (salario > 5000) ? mensagaemDoar : mensagemNaoDoar;
        System.out.println(resultado);
        // da para reduzir mais ainda com 2 linhas, escrevendo a msg direto, sem atribuir strings

    }
}
