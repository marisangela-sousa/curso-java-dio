package edu.mary.anatomiaclasses;

public class MinhaClasse {
    
// metodo => tipoRetorno NomeObjetivoNoInfinito Parametro(s): o tipo do parametro pode ser diferente do tipo de retorno
    public static void main (String [] args) {
        // System.out.print( "Olá turma" );

        // Essa Variavel nao pode ser modificada; convensao camel case (BR) ou upper case (UPPER_CASE)
        final String BR = "Brasil";

        //preciso falar o tipo da variavel antes do nome 
        boolean verdadeira = false;

        String primeiroNome = "Mary";
        String segundoNome = "Sousa";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
