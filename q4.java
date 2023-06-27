package prova_ifro;
/***Desenvolva um programa em que o usuário determine a quantidade de valores numéricos inteiros a serem fornecidos para uma matrizA
do tipo vetor. No final, apresentar o total da soma de todos os elementos da MatrizA que sejam pares.***/
import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma_pares =0;
		
		System.out.println("Informe o numero de linhas da sua matriz:");
		int linhas = sc.nextInt();
		System.out.println("Informe o numero de colunas da sua matriz:");
		int colunas = sc.nextInt();
		
		int[][] matriz = new int[linhas][colunas];
		int[] pares = new int[linhas*colunas];
		
		
		for(int l=0;l<linhas;l++) {
			for (int c=0;c<colunas;c++) {
				System.out.printf("Informe o %d° elemento da linha %d.%n",l+1,c+1);
				matriz[l][c] = sc.nextInt();
				if (matriz[l][c]%2 == 0) {
					soma_pares++;
					pares[soma_pares-1] = matriz[l][c];
				}
			}
		}
		
		
		for(int i=0; i<soma_pares; i++) {
			System.out.printf("O %d° número par eh: %d%n",i+1,pares[i]);
		}
				
		System.out.printf("%nSoma dos números pares da sua matriz: %d%n",soma_pares);
		
		
		sc.close();

	}

}
