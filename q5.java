package prova_ifro;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de alunos:");
		int qtd = sc.nextInt();
		sc.nextLine();
		
		String[] alunos = new String[qtd];
		double[] medias = new double[qtd];
		double[] notas = new double[4];
		double mediaAprovados = 0;
		int alunosAprovados =0;
		
		for(int i=0;i<qtd;i++) {
			System.out.printf("Informe o nome da(o) %d° aluna(o):%n",i+1);
			alunos[i] = sc.nextLine();
			double soma = 0;
			for(int n=0; n<4;n++) {
				System.out.printf("Informe a %d° nota da(o) aluna(o):%n",n+1);
				notas[n] = sc.nextDouble();
				soma+=notas[n];
			}
			sc.nextLine();
			medias[i] = soma/4;
		}
		
		System.out.println("-----AUNOS APROVADOS-----");
		for(int i=0;i<qtd;i++) {
			if(medias[i]>=7) {
				System.out.printf("Aluna(o): %s - Média: %.1f%n",alunos[i],medias[i]);
				mediaAprovados += medias[i];
				alunosAprovados++;
			}
		}
		System.out.printf("Média dos alunos aprovados: %.1f%n",mediaAprovados/alunosAprovados);
		
		sc.close();

	}

}
