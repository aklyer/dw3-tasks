// 2.14 1
public class MeuPrograma {
	public static void main(String[] args) {
		System.out.println("Different message");
	}
}

// 2.14 2  
public class MeuPrograma {
	public static void main(String[] args) {
		System.out.println("One line");
		System.out.println("Now two lines");
	}
}
// 2.14
public class MeuPrograma {
	public static void main(String[] args) {
		System.out.println("One line \n Now two lines. M A G I C");
	}
}

// 3.3 1
public class BalancoTrimestral {
	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFeveriro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFeveriro + gastosMarco;
		int mediaMensal = (gastosJaneiro + gastosFeveriro + gastosMarco) / 3;
		System.out.print("Gastos do trimestre: " + gastosTrimestre + ". Valor da média mensal: " + mediaMensal);
	}
}
// 3.? 1 

public class MostrarNumeros {
	public static void main(String[] args) {
		int numero = 150;
		int soma = 0;
		while (numero < 300) {
		System.out.println(numero);
		numero = numero + 1;
		soma = numero;
			}
		System.out.print(soma);
	}
}

// 2 
public class Soma {
	public static void main(String[] args) {
		int menor = 1;
		int maior = 1000;
		int soma = (menor + maior) * ((maior - menor + 1) / 2);
		System.out.print(soma);
	}
}
// 3 
public class MultiplosDeTres {
	public static void main(String[] args) {
		for (int i = 3; i < 100; i = i + 3) {
			System.out.println(i);
		}
	}
}
// 4
 public class Fatorial {
	public static void main(String[] args) {
		int fatorial = 1;
		for (int n = 1; n <= 10; n++) {
			fatorial = fatorial * n;
			System.out.println(fatorial);
		}
	}
}
// 5 era pra fazer??
