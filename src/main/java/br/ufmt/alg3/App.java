import java.util.Scanner;

public class App{
    public static void main ( String[] args){
        // a parte mais custosa de uma aplicação voltada a orientada objeto é a instanciação.
        curso[] respostas;
        respostas = new Curso[3]; //um objeto que pode guardar três referências;
        Scanner teclado;
        teclado = new Scanner(System.in); // para receber a entrada do teclado
        for(int i = 0; i < respostas.length; i++){
            Curso c = new Curso(); //Precisa estar dentro do laço de repetição para que seja criado um novo objeto a cada inserção.
            System.out.println("Digite o nome do curso: ");
            String nome = teclado.nextLine();
            c.setNome(nome);
            System.out.println("O nome digitado foi: "+c.getNome());
            int [][] matrix = new int [2][3]; // o primeiro colchete determina o número de objetos que estão sendo criados, sendo que cada um deles tem 3 posições na memória
            //Se você trocasse para int [3.000.000.000][3], demoraria segundos, até minutos para o processamento da aplicação. "Cada linha é um objeto".
            respostas[i] = c;
        }
        for

    }
}
