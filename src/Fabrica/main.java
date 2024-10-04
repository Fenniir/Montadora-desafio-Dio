package Fabrica;

public class main {
    public static void main(String[] args) {

        Veiculo carro1 = new CarroPopular("CarroPopular1", "Preto");

        Veiculo carro2 = new CarroEsportivo("CarroEsportivo1", "Branco");

        Veiculo carro3 = new CarroOffRoad("CarroOffRoad1", "Vermelho");




        Cliente empresa1 = new Cliente();
        empresa1.setNomeEmpresa("Asus");


        empresa1.EncomendarVeiculo(carro1);
        empresa1.EncomendarVeiculo(carro3);
        empresa1.ChecarProdutos(empresa1);

        System.out.println("||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("Média de preço por encomenda, somadas:" + empresa1.ChecarMediaPrecoEncomenda(empresa1));
        System.out.println("||||||||||||||||||||||||||||||||||||||||||");

        
        empresa1.ConcluirVeiculo(carro1);
        empresa1.ChecarProdutos(empresa1);

        
        
    }

    
}
