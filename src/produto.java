public class produto  extends Combo{
    private String descricao;
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public  produto(String descricao, double preco){
        this.descricao = descricao;
        this.preco = preco;
    }
}

