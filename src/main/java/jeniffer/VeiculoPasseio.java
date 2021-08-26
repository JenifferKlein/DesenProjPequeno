package jeniffer;

public class VeiculoPasseio extends Veiculo {
    private double consumoKmLt;

    public VeiculoPasseio(String placa, String marca, String modelo, int ano, double valor, double consumoKmLt){
        super(placa, marca, modelo, ano, valor);
        this.consumoKmLt = consumoKmLt;
    }

    String getTipo(){
        return "Passeio";
    }

    @Override
    void exibeDados(){
        super.exibeDados();
        System.out.println(" | numero de consumo por kmlt: "+consumoKmLt);
    }
}