public class Aula151222 {

    public static void main(String[] args) {
        Character[][] matrix = new Character[3][3];
        matrix[0][0] = 'X';
        imprimir(matrix);
        mover(matrix,3);
        mover(matrix,5);
        mover(matrix,15);
    }


    public static void imprimir(Character[][] x) {

        int indiceLinha = x.length;
        int indiceColuna = x[0].length;

        for (int i = 0; i < x.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < x[i].length; j++) {
                Character elemento = x[i][j];

                if (elemento == null) {
                    System.out.print('_');
                } else {
                    System.out.print(elemento);
                }


                if (i == x.length || j == x[i].length - 1) {

                } else {
                    System.out.print(",");
                }

            }
            System.out.print(" ]");
            System.out.println();
        }
        System.out.println();
    }

    public static void mover(Character[][] mat, int valor) {
        int valorInicial = valor++;
        valor++;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                    if (mat[i][j] != null) {
                        mat[i][j] = null;
                    }

                    if (valor == 0 && valor < (mat.length*mat[i].length)) {
                        mat[i][j] = 'X';
                    }else if (valorInicial > (mat.length*mat[i].length)){
                        mat[mat.length-1][mat[i].length-1] = 'X';
                    }
                    valor--;

            }
        }
        imprimir(mat);
        System.out.println();
    }


    public static int[] encontrarX(Character[][] x) {

        return new int[]{0, 0};
    }

    private static void moverParaBaixoEComeco(Character[][] x) {

    }
}
