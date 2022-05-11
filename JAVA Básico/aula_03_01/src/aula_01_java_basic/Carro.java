package aula_01_java_basic;

import javax.swing.JOptionPane;

public class Carro {
	// Atributos
	public String marca;
	public int ano;
	private int marcha = 0;
	public boolean ligado;
	public int velocidade;
	public boolean freio = true;
	
	// Métodos:	
	public void ligar() {
		if (this.ligado == false) {
			this.ligado = true;
			// mostrar resultado no console <System.out.println(message);>.
			// System.out.println("Carro ligado.");
			// Swing com JOptionPane.showMessageDialog(null, message);
			JOptionPane.showMessageDialog(null, "Carro ligado.");
		} else {
			System.out.println("O carro já está ligado.");
		}
	}
	
	public void acelerar(int velocidade) {
		if (this.ligado == true) {
			if (this.freio == false) {
				if (this.marcha == 0) {
					JOptionPane.showMessageDialog(null, "Está em ponto morto.");
				} else if (this.marcha == 1) {
					if (velocidade < 30) {
						this.velocidade = velocidade;
						System.out.println(this.velocidade);						
					} else {
						System.out.println("Velocidade superior a permitida para troca de marcha!");
					}
				} else if (this.marcha == 2) {
					if (velocidade < 50) {
						this.velocidade = velocidade;
						System.out.println(this.velocidade);
					} else {
						System.out.println("Velocidade superior a permitida para troca de marcha!");
					}
				} else if (this.marcha == 3) {
					if (velocidade < 80) {
						this.velocidade = velocidade;
						System.out.println(this.velocidade);
					} else {
						System.out.println("Velocidade superior a permitida para troca de marcha!");
					}
				}
			}
		} 
	}
	
	public void desligar() {
		if (this.ligado == true) {
			this.ligado = false;
			// System.out.println("Carro desligado.");
			JOptionPane.showMessageDialog(null, "Carro desligado.");
		} else {
			System.out.println("O carro nao esta ligado.");			
		}
	}
	
	// Exemplo de Encapsulamento:
	public void trocarMarcha() {
		this.marcha = this.marcha + 1;
	}
}