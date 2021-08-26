package jeniffer;

import java.util.Scanner;

public class CatalogoVeiculos {

    public static Veiculo listaVeiculo[] = { //lista de veiculos disponiveis no catalogo 
        new VeiculoPassageiros("GFT19C6", "FIAT", "Doblò", 2021, 120490.00, 7),
        new VeiculoPassageiros("ICM2T59", "CHEVROLET", "Onix", 2022, 74550.00, 5),
        new VeiculoPassageiros("FFD45J7", "Mercedez-Benz", "VAN", 2021, 180000.00, 10),
        new VeiculoPasseio("JKL98T3", "HYUNDAI", "HB20", 2021,  73690.00, 13.9 ),
        new VeiculoPasseio("GIT20A2", "PEUGEOT", "208", 2021, 70990.00, 15.8),
        new VeiculoUtilitario("BAK40I3", "CHEVROLET", "S10 High Country", 2022, 258250.00, 1049, 3096),
        new VeiculoUtilitario("MIT2A21", "MITSUBISHI", "L200 TRITON SAVANA", 2021, 215990.00, 1000, 3000),
        new VeiculoUtilitario("REN4A21", "RENAULT", "Renault MASTER Furgao", 2021, 206800.00, 1593, 3682)
    };
    
    public static void consultaPorPlaca(){
        String nroPlaca = ""; //variavel responsavel recebe a placa informada pelo usuario

        Scanner leia = new Scanner(System.in); //objeto que lê as informações dadas pelo usuário 

        System.out.println("Digite o numero da placa que deseja consultar:");
        nroPlaca = leia.nextLine(); //le a placa informada pelo usuario
        //verifica se a placa informada e valida
        while(nroPlaca.length() != 7){ //enquanto o tamanho da placa for diferente de 7 caracters, o usuario vai ficar num loop ate digitar uma placa valida
            System.out.println("informe uma placa valida:"); 
            nroPlaca = leia.nextLine(); 
        }

        //percorre a lista de veiculos e compara a placa informada com as disponiveis na lista
        //Se a placa informada for igual a da lista e apresentado as informacoes do veiculo com aquela placa
        for(int i = 0; i<listaVeiculo.length; i++){
            if((listaVeiculo[i].getPlaca()).equalsIgnoreCase(nroPlaca)){
                listaVeiculo[i].exibeDados();
            }
        }
    }

    public static void consultaPorMarca(){
        String marca = "";
        Scanner leia = new Scanner(System.in); //objeto que lê as informações dadas pelo usuário 

        System.out.println("Digite a marca do carro que deseja consultar:");
        marca = leia.nextLine(); //le a marca informada pelo usuario
        //verifica se a marca informada e valida
        while(marca == null){
            System.out.println("informe uma marca valida:"); 
            marca = leia.nextLine(); 
        }
        for(int i = 0; i<listaVeiculo.length; i++){
            if((listaVeiculo[i].getMarca()).equalsIgnoreCase(marca)){
                listaVeiculo[i].exibeDados();
            }
        }
    }
    
    public static void consultaPorAno(){
        int ano = 0;
        Scanner leia = new Scanner(System.in); //objeto que lê as informações dadas pelo usuário 

        System.out.println("Digite o ano que deseja consultar:");
        ano = leia.nextInt(); //le o ano informado pelo usuario

        //verifica se o ano informado e valido
        while(ano < 1900 || ano > 2022){
            System.out.println("informe um ano valido:"); 
            ano = leia.nextInt(); 
        }
        for(int i = 0; i<listaVeiculo.length; i++){
            if((listaVeiculo[i].getAno()) == ano ){
                listaVeiculo[i].exibeDados();
            }
        }
    }
    
    public static void consultaPorTipo(){
        
        Scanner leia = new Scanner(System.in); //objeto que lê as informações dadas pelo usuário 
        
        int opcao = 0;

        System.out.println(" ________________________________________");
        System.out.println("|                 M E N U                |");
        System.out.println("|                                        |");
        System.out.println("|        1. Passeio                      |");
        System.out.println("|        2. Passageiros                  |");
        System.out.println("|        3. Utilitario                   |");
        System.out.println("|________________________________________|");
        System.out.print("Escolha : ");
        
        opcao = leia.nextInt(); 

        while(opcao < 1 || opcao > 3){
            System.out.println("informe um ano valido:"); 
            opcao = leia.nextInt(); 
        }
        if(opcao == 1){
            for(int i = 0; i < listaVeiculo.length; i++){
                if(listaVeiculo[i].getTipo().equalsIgnoreCase("passeio")){
                    listaVeiculo[i].exibeDados();
                }
            }       
        }else{
            if(opcao == 2){
                for(int i = 0; i < listaVeiculo.length; i++){
                    if(listaVeiculo[i].getTipo().equalsIgnoreCase("passageiros")){
                        listaVeiculo[i].exibeDados();
                    }
                }
            }else{
                if(opcao == 3){
                    for(int i = 0; i < listaVeiculo.length; i++){
                        if(listaVeiculo[i].getTipo().equalsIgnoreCase("utilitario")){
                            listaVeiculo[i].exibeDados();
                        }
                    }
                }else{
                    System.out.println("opcao invalida");
                }
            }
        }
    }
}
