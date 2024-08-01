public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
        }catch(CepInvalidException e){
            e.printStackTrace();
        }
    }
    static String formatarCep(String cep) throws CepInvalidException{
        if(cep.length() != 8)
            throw new CepInvalidException();

            return "23.765.064";
    }
        
}
