public class sobremesa extends produto {
    private int gramas;

    private String descricao;
    public sobremesa (int gramas, String descricao, double preco){
        super(descricao, preco);

    }

    public int getGramas() {
        return gramas;
    }

    public void setGramas(int gramas) {
        this.gramas = gramas;
    }
    public String getInfo(){
        return getDescricao() + " " + getGramas()  + " " + getPreco();
    }
}
