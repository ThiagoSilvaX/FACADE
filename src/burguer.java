public class burguer extends produto {
    private int gramas;

    public burguer (int gramas, String descricao, double preco){
        super(descricao, preco);

    }

    public int getGramas() {
        return gramas;
    }

    public void setGramas(int gramas) {
        this.gramas = gramas;
    }
    public String getInfo(){
        return getDescricao() +" " + getGramas() + " " + getPreco();
    }
}
