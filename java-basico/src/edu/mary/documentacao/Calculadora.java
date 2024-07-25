package edu.mary.documentacao;

/**@autor mary
 * @version 1.0
 * @since 25/07/2024
*/

// comando para criar uma documentacao -> javadoc -encoding UTF-8 -d ocencoding ISO-8859-1 -d ../docs src/*.java 

public class Calculadora {
    /**
     * Esses sao os parametros
     * @param numeroUm primeiro numero
     * @param numeroDois esse é o numero 2
     * @return int
     */
    public int somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }
}
