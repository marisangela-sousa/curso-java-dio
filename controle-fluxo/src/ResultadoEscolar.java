public class ResultadoEscolar {
 public static void main(String[] args) {
    int nota = 4;

    // if (nota >= 7){
    //     //quando tiver mais de uma linha para a condiçao precisa colocar entre {}
    //     System.out.println("Aprovado");
    
    // }else 
    //     System.out.println("Reprovado");

    // String resultado = nota >=7 ? "Aprovado" : "Resultado";

    String resultado = nota >=7 ? "Aprovado" : nota>=5 && nota <7 ? "Recuperação" : "Reprovado";
    System.out.println(resultado);
 }   
}
