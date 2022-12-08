
public enum FasesLua{
    CRESCENTE(1), NOVA(2), MINGUANTE(3), QUARTO_CRESCENTE(4), QUARTO_MINGUANTE(5),
    GIBOSA_CRESCENTE(6), GIBOSA_MINGUANTE(7), CHEIA(8);

    int valorFase;
FasesLua(int valor){
    this.valorFase = valor;
}

}