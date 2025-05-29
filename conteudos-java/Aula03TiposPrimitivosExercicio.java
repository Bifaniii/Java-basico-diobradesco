/*
Crie variáveis para os campos abaixo entre <> e imprima a seguinte mensagem:
"Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>"
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Guilherme";
        String endereco = "Rua Antônio Barreto, 31, bloco 2 e apto 54";
        double salario = 1752.22;
        String data = "30/05/2025";
        String relatorio = ("Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data "+data+".");
        System.out.println(relatorio);
    }
}
/*
Debugar código: Para a execução e andar passo a passo.
Shift F8

Tem que parar o código antes de debugar. Se eu der RUN de novo, vai normal. Só para no debug.
 */