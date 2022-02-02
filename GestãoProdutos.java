package Exercicio4;
import java.util.Scanner;

public class GestãoProdutos {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Quantos Produtos");
        int N=sc.nextInt();
        sc.nextLine();

        Produto[] Produtos=new Produto[N]; //array de classes(Produto)

        for (int i=0; i<N; i++);
        {
            System.out.print("Nome do "+(i+1)+ " º Produto: ");
            String nome=sc.nextLine();
            System.out.print("Preço do "+(i+1)+ " º Produto: ");
            double preço=sc.nextDouble();
            Produto p=new Produto(nome, preço);
            Produtos[i]=p;
        }
        double total=0;
        for(int i=0; i<N; i++)
        {
            System.out.println("Dados do "+(i+1)+ "Produto:("+Produtos[i].getNome()+","+ Produtos[i].getPreço()+"," );
            total+=Produtos[i].getPreço();
        }
        double media=total/N;
        System.out.printf("Valor médio dos Produtos: % 2f%n", media);


    }

}
