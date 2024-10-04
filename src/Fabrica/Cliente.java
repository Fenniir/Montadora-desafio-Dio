package Fabrica;

import java.util.LinkedHashSet;
import java.util.Set;

public class Cliente {
    private String nomeEmpresa;
    private Set<Veiculo> VeiculosEncomendados = new LinkedHashSet<>();
    private Set<Veiculo> VeiculosConcluidos = new LinkedHashSet<>();

    /*_____________Getters and Setters_____________ */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public Set<Veiculo> getVeiculosEncomendados() {
        return VeiculosEncomendados;
    }

    public void setVeiculosEncomendados(Set<Veiculo> veiculosEncomendados) {
        VeiculosEncomendados = veiculosEncomendados;
    }


    public Set<Veiculo> getVeiculosConcluidos() {
        return VeiculosConcluidos;
    }

    public void setVeiculosConcluidos(Set<Veiculo> veiculosConcluidos) {
        VeiculosConcluidos = veiculosConcluidos;
    }

    /*___________________________________________*/


    /*__________________Métodos__________________ */

    public void EncomendarVeiculo(Veiculo veiculo) {
        VeiculosEncomendados.add(veiculo);
        System.out.println(veiculo.nome + " Encomendado.");
    }

    public void ConcluirVeiculo(Veiculo veiculo) {
        VeiculosConcluidos.add(veiculo);
        System.out.println(veiculo.nome + " Concluido, pronto para retirada.");
        VeiculosEncomendados.remove(veiculo);
    }

    public void ChecarProdutos(Cliente cliente) {
        System.out.println("-----Veículos Encomendados-----");
        System.out.println(VeiculosEncomendados);
        System.out.println("-----Veículos Concluídos-----");
        System.out.println(VeiculosConcluidos);
    }

    public double ChecarMediaPrecoEncomenda(Cliente cliente) {
        return this.VeiculosEncomendados
        .stream()
        .mapToDouble(veiculo -> veiculo.precoMediaMontagem)
        .sum();
    }

    /*___________________________________________ */
    
    
    /*______________ToString | equals and hash code______________*/
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeEmpresa == null) ? 0 : nomeEmpresa.hashCode());
        result = prime * result + ((VeiculosEncomendados == null) ? 0 : VeiculosEncomendados.hashCode());
        result = prime * result + ((VeiculosConcluidos == null) ? 0 : VeiculosConcluidos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (nomeEmpresa == null) {
            if (other.nomeEmpresa != null)
                return false;
        } else if (!nomeEmpresa.equals(other.nomeEmpresa))
            return false;
        if (VeiculosEncomendados == null) {
            if (other.VeiculosEncomendados != null)
                return false;
        } else if (!VeiculosEncomendados.equals(other.VeiculosEncomendados))
            return false;
        if (VeiculosConcluidos == null) {
            if (other.VeiculosConcluidos != null)
                return false;
        } else if (!VeiculosConcluidos.equals(other.VeiculosConcluidos))
            return false;
        return true;
    }
    /*_____________________________________________________________*/
}


