package aula_01_java_basic;

public class Main {
	
	public static void main (String args[]) {
		System.out.println("Hello, World em Carros!");
		
		// Instânciar uma classe => Objeto
		
		Carro c4 = new Carro();
		c4.ligar();
		c4.freio = false;
		c4.trocarMarcha();
		c4.acelerar(20);
		c4.trocarMarcha();
		c4.acelerar(40);
		c4.trocarMarcha();
		c4.acelerar(60);
		c4.desligar();
		
		Carro ix35 = new Carro();
		ix35.ligar();
		ix35.freio = false;
		ix35.trocarMarcha();
		ix35.acelerar(70);
		ix35.desligar();
	}
	
}
