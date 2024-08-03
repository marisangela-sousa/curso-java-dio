import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o numero 1: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o numero 2: ");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);
        } catch(ParametrosInvalidosException e){
            e.printStackTrace();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for(int ocorrencias = 1; ocorrencias <= contagem; ocorrencias++){
            System.out.println("Imprimindo o número " + ocorrencias);
        }
    }
}
