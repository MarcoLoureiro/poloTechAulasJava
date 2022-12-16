public class Exercicio {

    public static void main(String[] args) {

        String tipo = "50000000M";
        String tipoDefinido = tipo.charAt(tipo.length() - 1) + "";
        String txt = "";
        for (int i = 0; i < tipo.length() - 1; i++) {
            txt += tipo.charAt(i);
        }
        int adicional = Integer.parseInt(txt);

        System.out.println(adicional);

        valoresDeAno vals = retornaData(2022, 12, 12, 20, 41, 32, adicional, tipoDefinido);


        vals.printaData();
    }


    public static valoresDeAno retornaData(int ano, int mes, int dia, int hora, int minuto, int segundo, int adicional, String tipo) {
        String txt = "";
        valoresDeAno valores = new valoresDeAno();

        switch (tipo) {
            case "y":
                ano = ano + adicional;
                break;
            case "m":
                mes = mes + adicional;
                if (mes > 12) {
                    while (mes > 12) {
                        mes = mes - 12;
                        ano++;
                    }

                }
                break;
            case "d":
                dia += adicional;
                if (dia > 30) {
                    while (dia > 30) {
                        dia = dia - 30;
                        mes++;
                    }

                }
                if (mes > 12 ) {
                    while (mes > 12) {
                        mes = mes - 12;
                        ano++;
                    }

                }
                break;
            case "h":
                hora += adicional;
                if (hora >= 24) {
                    while (hora >= 24) {
                        hora = hora - 24;
                        dia++;
                    }

                }
                if (dia > 30) {
                    while (dia > 30) {
                        dia = dia - 30;
                        mes++;
                    }

                }
                if (mes > 12) {
                    while (mes > 12) {
                        mes = mes - 12;
                        ano++;
                    }

                }
                break;
            case "M":
                minuto = minuto + adicional;
                if (minuto >= 60) {
                    while (minuto > 60) {
                        minuto = minuto - 60;
                        hora++;
                    }

                }
                if (hora >= 24) {
                    while (hora >= 24) {
                        hora = hora - 24;
                        dia++;
                    }

                }
                if (dia > 30) {
                    while (dia > 30) {
                        dia = dia - 30;
                        mes++;
                    }

                }
                if (mes > 12 ) {
                    while (mes > 12) {
                        mes = mes - 12;
                        ano++;
                    }

                }
                break;
            case "s":
                segundo += adicional;
                if (segundo >= 60) {
                    while (segundo > 60) {
                        segundo = segundo - 60;
                        minuto++;
                    }
                }
                if (minuto >= 60) {
                    while (minuto > 60) {
                        minuto = minuto - 60;
                        hora++;
                    }

                }
                if (hora >= 24) {
                    while (hora >= 24) {
                        hora = hora - 24;
                        dia++;
                    }

                }
                if (dia > 30) {
                    while (dia > 30) {
                        dia = dia - 30;
                        mes++;
                    }

                }
                if (mes > 12) {
                    while (mes > 12) {
                        mes = mes - 12;
                        ano++;
                    }

                }
                break;
            default:
                System.out.println("Inválido!");
                break;
        }

        valores.ano = ano;
        valores.mes = mes;
        valores.dia = dia;
        valores.hora = hora;
        valores.minuto = minuto;
        valores.segundo = segundo;

        return valores;
    }

}

class valoresDeAno {
    int ano, mes, dia, hora, minuto, segundo;

    public void printaData() {
        System.out.println("A nova data é: " + dia + "/" + mes + "/" + ano + " " + hora + ":" + minuto + ":" + segundo);
    }
}
