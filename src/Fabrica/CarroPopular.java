package Fabrica;


public class CarroPopular extends Veiculo {

    public final int numPortas = 4;
    public final int numAcentos = 5;
    public final int velocidadeMax = 120;
    public final double precoMontagem = 80.000;

    public double caucularPreco() {
        return this.precoMontagem;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public int getNumAcentos() {
        return numAcentos;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public CarroPopular(String n,String c) {
        nome = n;
        cor = c;    
    }

    @Override
    public String toString() {
        return "CarroPopular [numPortas=" + numPortas + ", numAcentos=" + numAcentos + ", velocidadeMax="
                + velocidadeMax + ", precoMontagem=" + precoMontagem + "]";
    }

}
