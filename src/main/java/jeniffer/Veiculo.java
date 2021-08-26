package jeniffer;

import java.util.Scanner;

/*
*
*@author: Jeniffer Bittencourt, MAT(20103091)
*
*/

abstract class Veiculo 
{
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private double valor;

    //construtor
    public Veiculo(String placa, String marca, String modelo, int ano, double valor) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano =  ano;
        this.valor = valor;
    }
   
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    abstract String getTipo();
  
    public static void main( String[] args ){
        Scanner x = new Scanner(System.in); //objeto que lê as informações dadas pelo usuário
        int op = 0; //váriavel p/ controlar as opções do menu

        while(op != 5) {
            op = menu(); //chama função do menu
            switch(op) { //switch  recebe valor que definira qual função executar

                case 1:
                  CatalogoVeiculos.consultaPorPlaca();
                    break;
                case 2: 
                    CatalogoVeiculos.consultaPorMarca();
                    break;
                case 3:
                    CatalogoVeiculos.consultaPorAno();
                    break;
                case 4:
                    CatalogoVeiculos.consultaPorTipo();
                    break;
                case 5:
                    x.close(); //fecha o programinha
                    break;
                default:
                    System.out.println("Digite apenas os números do MENU!"); //alerta o usuário sobre o que fazer
            }
        }
    }
 
    public static int menu() { //menu-chan
        Scanner x = new Scanner(System.in);
        int k = 0;
        System.out.println(" ________________________________________");
        System.out.println("|                 M E N U                |");
        System.out.println("|                                        |");
        System.out.println("|        1. Placa                        |");
        System.out.println("|        2. Marca                        |");
        System.out.println("|        3. Ano                          |");
        System.out.println("|        4. Tipo                         |");
        System.out.println("|        5. Encerrar o programa          |");
        System.out.println("|________________________________________|");
        System.out.print("Escolha : ");
        k = x.nextInt();
        System.out.println("........................................");
        System.out.println("\n");
        return k;
    }
    
    @Override

    public String toString(){
        return String.format("placa: "+placa+" | marca: "+marca+" | modelo: "+modelo+" | ano: "+ano+" | valor: R$"+valor);
    }
    
    void exibeDados(){
        System.out.println("Veiculo");
        System.out.print("  Placa: "+ placa+" | Marca: "+marca+" | Modelo: "+modelo+" | Ano: "+ano+" | Valor: "+valor);
    }
}
