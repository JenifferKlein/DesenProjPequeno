package jeniffer;

public class VeiculoUtilitario extends Veiculo {
    private int capCargaton;
    private int nroEixos;

    public VeiculoUtilitario(String placa, String marca, String modelo, int ano, double valor, int capCargaton, int nroEixos){
        super(placa, marca, modelo, ano, valor);
        this.capCargaton = capCargaton;
        this.nroEixos = nroEixos;
    }
    String getTipo(){
        return "Utilitario";
    }

    @Override
    void exibeDados(){
        super.exibeDados();
        System.out.println(" | Capacidade Carga: "+capCargaton+" | numero eixo: "+nroEixos);
    }
}