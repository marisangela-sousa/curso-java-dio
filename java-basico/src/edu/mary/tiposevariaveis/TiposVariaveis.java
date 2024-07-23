package edu.mary.tiposevariaveis;

public class TiposVariaveis {
    
    public static void main (String [] args) {
        double salarioMinimo = 2500.5;

        byte idade = 123;
        short ano = 2024;
        int cep = 63905020; // se começar com zero tem que ser outro tipo
        long cpg = 45678923490L; // se começar com zero talvez tenha quer ser outro tipo, tem que colocar L no final
        float pi = 3.14F; // precisa colocar um F no final pra nao converter pra double

        final double VALOR_DE_PI = 3.14; // nunca poderá mudar o valor (constante)
    }

}
