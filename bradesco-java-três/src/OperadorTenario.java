public class OperadorTenario {
    public static void main(String[] args) {
        int a, b;
        
        a = 5;
        b = 5;
//        String resultado = "";
//        if(a==b)
//            resultado = "verdadeiro";
//        else
//            resultado = "falso";
//
//         System.out.println(resultado);

        String resultado = a==b ?"verdadeiro" : "falso"; // Utilizando Operador tenário
      //String resultado = a==b ? 1 : 0 ------------------> Não se limita somente a Strings, neste caso retornaria 1 (primeira condição sempre verdadeira)  
        System.out.println(resultado);
    }
}