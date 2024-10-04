package Fabrica;

public class CarroOffRoad extends Veiculo {
    public final int numPortas = 2;
    public final int numAcentos = 2;
    public final int velocidadeMax = 140;
    public final double precoMontagem = 90.000;


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

    public CarroOffRoad(String n,String c) {
        nome = n;
        cor = c;
    }

    @Override
    public String toString() {
        return "CarroOffRoad [numPortas=" + numPortas + ", numAcentos=" + numAcentos + ", velocidadeMax="
                + velocidadeMax + ", precoMontagem=" + precoMontagem + "]";
    }

}
