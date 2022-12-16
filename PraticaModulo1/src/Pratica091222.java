import java.util.Scanner;

public class Pratica091222 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora");
        int hora = scanner.nextInt();
        System.out.println("Digite o minuto");
        int minuto = scanner.nextInt();
        System.out.println("Digite o adicional");
        int adicional = scanner.nextInt();

        ValoresHorarios horarioBrasil = calculaHorario(hora,minuto,adicional,"Brasil",0);
        ValoresHorarios horarioLondres = calculaHorario(hora,minuto,adicional,"Londres",3);
        ValoresHorarios horarioMexico = calculaHorario(hora,minuto,adicional,"Mexico",-3);

        horarioBrasil.printaFuso();
        horarioLondres.printaFuso();
        horarioMexico.printaFuso();
    }

    private static ValoresHorarios calculaHorario(int hora, int minuto, int adicional, String local, int fuso) {

        int adicionaNovaHora = ((hora * 60) + (minuto + adicional)) % 24;
        int novaHora = ((adicionaNovaHora + fuso) + 24) % 24;
        int novoMinuto = (minuto + adicional) % 60;

        ValoresHorarios valores = new ValoresHorarios();
        valores.hora = novaHora;
        valores.minuto = novoMinuto;
        valores.local = local;
        return valores;

    }

}

 class ValoresHorarios {
    int hora;
    int minuto;
    String local;

    public void printaFuso(){
        System.out.println(local+", "+hora+" h"+ " "+minuto+" min");
    }

}


