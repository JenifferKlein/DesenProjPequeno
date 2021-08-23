package jeniffer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        menuPrincipal();
    }

    //metodo veiculo que eu nao sei explicar por enquanto
    private void Veiculo(){
        String placa;
        String marca;
        String modelo;
        int ano;
        double valor;
    }

    public static void menuPrincipal(){
        System.out.println(" __________________________________________________");
        System.out.println("|                                                 |");
        System.out.println("|                    Bem-Vindo!                   |");
        System.out.println("|_________________________________________________|");
        System.out.println("|   Escolha uma das opções:                       |");
        System.out.println("|       1. Placa                                  |");
        System.out.println("|       2. Marca                                  |");
        System.out.println("|       3. Ano                                    |");
        System.out.println("|       4. Tipo                                   |");
        System.out.println("|       5. Encerrar o programa                    |");
        System.out.println("|_________________________________________________|");
    }

}
