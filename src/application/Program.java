package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		Champion c1 = new Champion(name, life, attack, armor);
		
		System.out.println();
		
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		Champion c2 = new Champion(name, life, attack, armor);
		
		System.out.println();
		
		System.out.println("Quantos turnos você deseja executar? ");
		int N = sc.nextInt();
		
		System.out.println();
		for(int i = 0; i < N; i++) {
			System.out.println("Resultado do Turno " + (i+1) + ":");
			c1.takeDamage(c2);
			c2.takeDamage(c1);
			
			if (c1.getLife() <= 0 || c2.getLife() <= 0) {
				System.out.println(c1.status()); 
				System.out.println(c2.status());
				i = N;
			}
			else {
				System.out.println(c1.status()); 
				System.out.println(c2.status());
			}	
			System.out.println();
		}
		
		System.out.println("FIM DO COMBATE");
		
		
		sc.close();
	}

}
