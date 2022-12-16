import javax.swing.JOptionPane;
import java.util.Arrays;
// import java.util.Arrays;

public class ExercicioAula151222 {

    public static void main(String[] args) {

        int populacaoA = 80_000;
        int populacaoB = 200_000;
        int aux = 0;

        while (populacaoA < populacaoB) {
            double qtdpopulacaoA = (populacaoA * 0.03);
            populacaoA += qtdpopulacaoA;
            double qtdpopulacaoB = (populacaoB * 0.015);
            populacaoB += qtdpopulacaoB;
            aux++;
        }
        int teste = populacaoA + 0;

        System.out.println("Pop A: " + populacaoA + "\nPop B: " + populacaoB + "\nLevou " + aux + " anos para A alcançar B");

    }


}
    /*

    //  String palavra = JOptionPane.showInputDialog(null, "Digite a palavra");
    //  System.out.println(invertePalavra(palavra));
    // escreveParesImpares();
    // System.out.println(informaMaiorMenorMedia());
    //System.out.println("Maior nome: " + informarMaiorNome());
    //String txt = JOptionPane.showInputDialog(null,"Digite a palavra");
    //System.out.println(retornarCharsImparesMaisculo(txt));
    //System.out.println(verificarNovoVelhoMedia());
    //informarForaPeso();

    public static void exibeListaCompras() {

        String[] carrinho = new String[5];
        for (int i = 0; i < 5; i++) {
            String fruta = JOptionPane.showInputDialog(null, "Digite a primeira fruta");
            carrinho[i] = fruta;
        }
        System.out.println(Arrays.toString(carrinho));

    }



    public static String invertePalavra(String palavra) {
        String palavraReversa = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraReversa += palavra.charAt(i);
        }

        return palavraReversa;
    }

    public static void escreveParesImpares() {

        Integer[] numeros = new Integer[5];

        for (int i = 0; i < 5; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º número"));
        }

        String pares = "";
        String impares = "";

        for (int n : numeros) {
            if (n % 2 == 0) {
                pares += n + " ";
            } else {
                impares += n + " ";
            }
        }

        System.out.println("Impares: " + impares);
        System.out.println("Pares: " + pares);

    }

    public static String informaMaiorMenorMedia() {

        int[] numeros = new int[5];
        int menor = numeros[0];
        int maior = numeros[0];
        int media = 0;
        int aux = 0;

        for (int i = 0; i < 5; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º número"));
        }


        for (int n : numeros) {
            if (n < menor || aux == 0) {
                menor = n;
            }
            if (n > maior || aux == 0) {
                maior = n;
            }
            aux = 1;
            media += n;
        }
        media = media / 5;
        String txt;
        txt = "Maior: " + maior + "\n" + "Menor:" + menor + "\n" + "Média: " + media;
        return txt;

    }

    public static String informarMaiorNome() {
        String[] nomes = new String[5];
        String maiorNome;
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º nome");
        }
        maiorNome = nomes[0];

        for (String txt : nomes) {
            if (txt.length() > maiorNome.length()) {
                maiorNome = txt;
            }
        }

        return maiorNome;
    }

    public static String retornarCharsImparesMaisculo(String txt) {
        String caractersImparesMaiusculos = "";

        for (int i = 0; i < txt.length(); i++) {
            if ((i+1) % 2 != 0) {
                caractersImparesMaiusculos += (Character.toUpperCase(txt.charAt(i)));

            }else{
                caractersImparesMaiusculos += txt.charAt(i);
            }

        }
        return caractersImparesMaiusculos;
    }

    public static String verificarNovoVelhoMedia() {
        String[] nomes = new String[5];
        int[] idades = new int[5];
        String maisVelho = "";
        String maisNovo = "";
        int mediaIdades = 0;
        int menorIdade = idades[0];
        int maiorIdade = idades[0];

        for (int i = 0; i < 5; i++) {
            nomes[i] = JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º nome");
            idades[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade de " + nomes[i]));
            mediaIdades += idades[i];
        }


        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < menorIdade || i == 0) {
                menorIdade = idades[i];
                maisNovo = nomes[i];
            }
            if (idades[i] > maiorIdade || i == 0) {
                maiorIdade = idades[i];
                maisVelho = nomes[i];
            }

        }

        String txt = "Mais velho: " + maisVelho + "\n" + "Mais novo: " + maisNovo + "\n" + "Média das Idades: " + (mediaIdades / 5);
        return txt;
    }

    public static void informarForaPeso() {
        String[] nome = new String[5];
        double[] altura = new double[5];
        double[] peso = new double[5];
        String[] foraDoPeso = new String[5];
        double imc;
        for (int i = 0; i < 5; i++) {
            nome[i] = JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º nome");
            altura[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura de " + nome[i]));
            peso[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso de " + nome[i]));
        }

        for (int i = 0; i < nome.length; i++) {
            imc = peso[i] / (altura[i] * altura[i]);

            if (imc > 25 || imc < 18.5) {
                foraDoPeso[i] = nome[i];
                System.out.println("Fora do peso ideal: "+foraDoPeso[i] +"\nImc: "+imc );
            }

        }


    }

     */

