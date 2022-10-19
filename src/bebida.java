public class bebida extends produto {
    private int mls;

    public bebida (int mls, String descricao, double preco){
        super(descricao, preco);

    }

    public int getmls() {
        return mls;
    }

    public void settMls(int mls) {

        this.mls = mls;
    }
    public String getInfo(){
        return getDescricao() +" " + getmls()  + "" +  getPreco();
    }
}
