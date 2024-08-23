package ordenacao_em_set;

import java.util.Objects; 

public class Objeto implements Comparable<Objeto> {
    private String nome ; 
    private double preco; 
    private int quantidade;
    private long cod; 

    public Objeto(String nome, double preco, int quantiade, long cod) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantiade;
        this.cod = cod;
    }
    public long getCod() {
        return cod;
    }
    public void setCod(long cod) {
        this.cod = cod;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantiade() {
        return quantidade;
    }
    public void setQuantiade(int quantiade) {
        this.quantidade = quantiade;
    }
    @Override
    public String toString() {
        return "Objeto [nome=" + nome + ", preco=" + preco + ", quantiade=" + quantidade + ", cod=" + cod + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Objeto other = (Objeto) obj;
        if (cod != other.cod)
            return false;
        return true;
    }
    @Override
    public int compareTo(Objeto o) {
        return nome.compareToIgnoreCase(o.getNome());
    }
}
