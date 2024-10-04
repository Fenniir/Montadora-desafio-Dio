package Fabrica;

public class CarroEsportivo extends Veiculo {

    public final int numPortas = 2;
    public final int numAcentos = 2;
    public final int velocidadeMax = 240;
    public final double precoMontagem = 100.000;


    public double caucularPreco() {
        return precoMontagem;
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

    public CarroEsportivo(String n,String c) {
        nome = n;
        cor = c;
  
    }

    @Override
    public String toString() {
        return "CarroEsportivo [numPortas=" + numPortas + ", numAcentos=" + numAcentos + ", velocidadeMax="
                + velocidadeMax + ", precoMontagem=" + precoMontagem + "]";
    }

}
