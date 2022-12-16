import java.util.Scanner;

public class Aula091222 {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Aula091222 aula = new Aula091222();

        //int v1 = aula.solicitarValor("Primeiro valor: ");
        //int v2 = aula.solicitarValor("Segundo valor: ");
        //System.out.println(somaDoisNumeros(v1, v2));
        //Scanner scanner = new Scanner(System.in);

        //Calculadora.somaDoisNumerosScanner(scanner, "Informe o valor");

        //System.out.println(calculadora.operacao(3, 3, "*"));

        calculadora.printaHorarios("mex");

    }


    public int solicitarValor(String msg) {
        System.out.println(msg);
        int valor = scanner.nextInt();
        return valor;
    }

    public static int somaDoisNumeros(int n1, int n2) {
        return n1 + n2;
    }


}

class Calculadora {

    Scanner scanner = new Scanner(System.in);

    public static int somaDoisNumeros(int n1, int n2) {
        int resultado = n1 + n2;
        return resultado;
    }

    public int solicitarValor(String msg) {
        System.out.println(msg);
        int valor = scanner.nextInt();
        return valor;
    }

    public static int somaDoisNumerosScanner(Scanner ler, String msg) {
        System.out.println(msg + " 1");
        int n1 = ler.nextInt();

        System.out.println(msg + " 2");
        int n2 = ler.nextInt();

        return n1 + n2;
    }

    public int operacao(int n1, int n2, String operacao) {
        int resultado = 0;
        switch (operacao) {
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "/":
                if (n2 == 0) {
                    resultado = 0;
                } else {
                    resultado = n1 / n2;
                }
                break;
            default:
                resultado = 0;
        }
        return resultado;
    }

    public int escaneiaValor(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        int valor = scanner.nextInt();
        return valor;
    }

    public int solicitaQuantidade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade a adicionar de minutos");
        int valor = scanner.nextInt();
        return valor;
    }

    public void printaHorarios(String pais) {
        Scanner scanner = new Scanner(System.in);

        int hora = escaneiaValor("Informe a hora: ");
        int minutos = escaneiaValor("Informe o(s) minuto(s)");
        int fuso = 0;
        int quantidade = solicitaQuantidade();
        hora = (((hora * 60) + (quantidade + minutos)) / 60);
        System.out.println(hora);
        fuso = hora % 24;
        System.out.println("Brasil,  " + fuso + ":" + (quantidade + minutos) % 60);
        fuso = (hora + 3) % 24;
        System.out.println("Londres " + fuso + ":" + (quantidade + minutos) % 60);
        fuso = ((hora - 3) + 24) % 24;
        System.out.println("Mexico, " + fuso + ":" + (quantidade + minutos) % 60);


    }

}



