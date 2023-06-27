package questoes_para_prova;
/***Crie em Java uma matriz 3x3 de inteiros, preencha a matriz e verifique se a matriz é um quadrado
mágico. Diz-se que uma matriz é um quadrado mágico quando a soma de todas as suas linhas, todas as
suas colunas, sua diagonal principal e sua diagonal secundária resultam no mesmo valor. Exemplo
abaixo.***/
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		for(int l=0;l<3;l++) {
			for(int c=0;c<3;c++) {
				System.out.printf("Digite o %d° número da %d° linha.%n",c+1,l+1);
				matriz[l][c]=sc.nextInt();
			}
		}
		
		int l1 = matriz[0][0]+matriz[0][1]+matriz[0][2];
		int l2 = matriz[1][0]+matriz[1][1]+matriz[1][2];
		int l3 = matriz[2][0]+matriz[2][1]+matriz[2][2];
		
		int c1 = matriz[0][0]+matriz[1][0]+matriz[2][0];
		int c2 = matriz[0][1]+matriz[1][1]+matriz[2][1];
		int c3 = matriz[0][2]+matriz[1][2]+matriz[2][2];
		
		int d = matriz[0][0]+matriz[1][1]+matriz[2][2];
		
		if((l1+l2+l3+c1+c2+c3+d)/7==l1)
			System.out.println("Sua matriz é um quadrado mágico.");
		else
			System.out.println("Sua matriz NÃO é um quadrado mágico.");
		sc.close();
		

	}

}
