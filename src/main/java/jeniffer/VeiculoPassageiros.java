package jeniffer;

public class VeiculoPassageiros extends Veiculo {
    private int nroPassageiro;

    public VeiculoPassageiros(String placa, String marca, String modelo, int ano, double valor, int nroPassageiro){
        super(placa, marca, modelo, ano, valor);
        this.nroPassageiro = nroPassageiro;
    }

    public int getNroPassageiro(){
        return nroPassageiro;
    }
    
    String getTipo(){
        return "Passageiros";
    }

    @Override
    void exibeDados(){
        super.exibeDados();
        System.out.println(" | numero passageiro: "+nroPassageiro);
    }
    
}
