import javax.swing.*;

public class Aula141222 {
    public static void main(String[] args) {
        //System.out.println(retornaMaiorMenorNumero());
        //System.out.println(retornaIntervalo());
        //imprimeTabuadaAteNove();

        Pessoa[] arrPessoas = new Pessoa[2];
        var pessoa1 = new Pessoa();
        var pessoa2 = new Pessoa();

        pessoa1.nome = "Fulano01";
        pessoa2.nome = "Fulano02";
        arrPessoas[0] = pessoa1;
        arrPessoas[1] = pessoa2;

        for (Pessoa p : arrPessoas) {
            System.out.println(p.nome);
        }

        char[] nome = "marco".toCharArray();
        System.out.println(nome);

        System.out.println(palindromo());
    }


    public static String retornaMaiorMenorNumero() {
        Integer maior = Integer.MAX_VALUE;
        Integer menor = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            Integer numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + i + " numero"));
            if (numero < menor || i == 0) {
                menor = numero;
            }
            if (numero > maior || i == 0) {
                maior = numero;
            }

        }
        String txt = "Menor número: " + menor + "\n" + "Maior número: " + maior;
        return txt;
    }

    public static String retornaIntervalo() {
        String txt = "";
        Integer intervalo1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1o intervalo"));
        Integer intervalo2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 2o intervalo"));

        while (intervalo1 < (intervalo2 - 1)) {
            intervalo1++;
            txt += "|" + intervalo1;
            if (intervalo1 == (intervalo2 - 1)) {
                txt = txt + "|";
            }
        }
        return txt;
    }

    public static void imprimeTabuadaAteNove() {

        /*
        loopDoFor: for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j + ": " + j * i);
                break loopDoFor; // -> Para dar break no primeiro laço utilizando um alias
            }
            System.out.println();
        }
        */
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j + ": " + j * i);
            }
            System.out.println();
        }
    }

    public static String toStringArrayChar(char[] txt) {
        return new String(txt);
    }

    public static boolean palindromo() {
        String txt = JOptionPane.showInputDialog(null, "Digite a palavra ou frase");
        String palavra = "";

        for (int i = txt.length() - 1; i >= 0; i--) {
            palavra = txt.charAt(i) + palavra;
        }
        System.out.println(palavra);
        if (palavra.equals(txt)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindromo() {
        String txt = "osso";
        int ultimo = txt.length() - 1;

        for (int i = 0; i < (txt.length()/2); i++) {
            if (txt.charAt(i) != txt.charAt(ultimo)) {
                return false;
            }
        }
        return true;
    }
}

class Pessoa {
    String nome;
}
