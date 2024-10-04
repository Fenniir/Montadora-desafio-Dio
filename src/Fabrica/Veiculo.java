package Fabrica;

public abstract class  Veiculo {

    protected String nome;
    protected String cor;
    protected double precoMediaMontagem = 90.000;

    protected int placa = 0000;


    public int getPlaca() { return placa; }

    public void setPlaca(int placa) { this.placa = placa; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getCor() { return cor; }

    public void setCor(String cor) { this.cor = cor; }

    public double getPrecoMontagem() { return precoMediaMontagem; }

    public void setPrecoMontagem(double precoMontagem) { this.precoMediaMontagem = precoMontagem; }

    @Override
    public String toString() {
        return "Veiculo [nome=" + nome + ", cor=" + cor + ", placa=" + placa + "precoMontagem=" + precoMediaMontagem + "]";
    }

    
}