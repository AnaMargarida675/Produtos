package Exercicio4;

public class Produto {

    public String Nome;
    public Double Preço;

    public Produto(){}

    public  Produto(String nome, double preço)
    {
        this.Nome=nome;
        this.Preço=preço;
    }
    public String getNome(){
        return this.Nome;
    }

    public Double getPreço() {
        return this.Preço;
    }
    public void setNome(String nome){
        this.Nome=nome;
    }
    public void setPreço(double preço){
        this.Preço=preço;
    }
}
