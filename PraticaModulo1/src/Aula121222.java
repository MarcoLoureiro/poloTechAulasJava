public class Aula121222 {

    public static void main(String[] args) {

    }


    public static int mesEmNumero(String mes){

        int numero = switch (mes) {
            case "janeiro","fevereiro" -> 1;
            default -> 2;
        };
        //Retorna esse valor usando ->

        return numero;
    }
}
