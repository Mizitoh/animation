package main;
import java.util.ArrayList;
import java.util.List;

import model.Complements;
import model.Stage;

public class Play {
	private static List<Stage> frames = new ArrayList<Stage>();
	static String linha1 = "                   " + "\n" + "                   ";
	static String linha2 = "        o          ";
	static String linha3 = "       /|\\          ";
	static String linha4 = "_______/_\\___________";
	static String linhaMove1 = "        |            ";
	static String linhaMove2 = "________|____________";
	static String linhaMove3 = "_______/_\\________/\\";
	static String linhaMove4 = "________|________/\\__";
	static String linhaMove5 = "_______/_\\___/\\_____";
	static String linhaMove6 = "________|_/\\________";
	static String linhaMove7 = "_______ //\\_________";
	static String linhaMove8 = "       /|            ";
	static String linhaMove9 = "       `o           ";
	static String linhatombo = "                   ";
	static String linhatombo2 = "        \\_\\_o       ";
	static String linhatombo3 = "_______/\\___________";
	static String linhaCai1 = "            \\/         ";
	static String linhaCai2 = "____/\\______`\\o_______";
	static String linhaChao = "__/\\_________/\\o______";
	static String linhatomboMsg = "   Oops             ";
	static String linhatomboMsg2 = "   Foi             ";
	static String linhatomboMsg3 = " Mal               ";
	static String linhaFim = "__/\\_____________/\\o___";
	static String linhaFim2 = "/\\________________/\\o__";

	public static void animate() throws InterruptedException {
		System.out.println("*********************************");
		System.out.println("* ");
		System.out.println("* Adjust your screen's height!");
		System.out.println("* ");
		System.out.print("*********************************");
		Thread.sleep(3000);
		for (Stage frame : frames) {
			System.out.println(frame);
			Thread.sleep(500);
		}
		System.out.println("                      ");
		System.out.println("**********************");
		System.out.println("* ");
		System.out.println("* The End!");
		System.out.println("* ");
		System.out.print("**********************");
	}

	public static Stage parado(Stage p) throws CloneNotSupportedException {
		Stage person = new Stage(linha1, linha2, new Complements(linha3, linha4));
		frames.add(person);
		return person;
	}

	public static Stage andando(Stage p) throws CloneNotSupportedException {
		Stage cloneStage = p.cloneBuilder().withLinha1(linha1).now();
		Stage anotherStage = cloneStage.cloneBuilder().withLinha1(linha1).withLinha2(linha2)
				.withLinha3(new Complements(linhaMove1, linhaMove2)).now();
		frames.add(anotherStage);
		return anotherStage;
	}
	
	public static Stage pedraAparece(Stage p) throws CloneNotSupportedException {
		Stage cloneStage = p.cloneBuilder().withLinha1(linha1).now();
		Stage anotherStage = cloneStage.cloneBuilder().withLinha1(linha1).withLinha2(linha2)
				.withLinha3(new Complements(linha3, linhaMove3)).now();
		frames.add(anotherStage);
		return anotherStage;
	}
	public static Stage pedraAproxima(Stage p) throws CloneNotSupportedException {
		Stage cloneStage = p.cloneBuilder().withLinha1(linha1).now();
		Stage anotherStage = cloneStage.cloneBuilder().withLinha1(linha1).withLinha2(linha2)
				.withLinha3(new Complements(linhaMove1, linhaMove4)).now();
		frames.add(anotherStage);
		return anotherStage;
	}
	public static Stage pedraAproxima2(Stage p) throws CloneNotSupportedException {
		Stage cloneStage = p.cloneBuilder().withLinha1(linha1).now();
		Stage anotherStage = cloneStage.cloneBuilder().withLinha1(linha1).withLinha2(linha2)
				.withLinha3(new Complements(linha3, linhaMove5)).now();
		frames.add(anotherStage);
		return anotherStage;
	}
	public static Stage pedraAproxima3(Stage p) throws CloneNotSupportedException {
		Stage cloneStage = p.cloneBuilder().withLinha1(linha1).now();
		Stage anotherStage = cloneStage.cloneBuilder().withLinha1(linha1).withLinha2(linha2)
				.withLinha3(new Complements(linhaMove1, linhaMove6)).now();
		frames.add(anotherStage);
		return anotherStage;
	}
	public static Stage tropeca(Stage p) throws CloneNotSupportedException {
		Stage cloneStage = p.cloneBuilder().withLinha1(linha1).now();
		Stage anotherStage = cloneStage.cloneBuilder().withLinha1(linha1).withLinha2(linhaMove9)
				.withLinha3(new Complements(linhaMove8, linhaMove7)).now();
		frames.add(anotherStage);
		return anotherStage;
	}
	public static Stage voa(Stage p) throws CloneNotSupportedException {
		Stage cloneStage = p.cloneBuilder().withLinha1(linha1).now();
		Stage anotherStage = cloneStage.cloneBuilder().withLinha1(linha1).withLinha2(linhatombo)
				.withLinha3(new Complements(linhatombo2, linhatombo3)).now();
		frames.add(anotherStage);
		return anotherStage;
	}
	
	public static Stage cai(Stage p) throws CloneNotSupportedException {
		Stage cloneStage = p.cloneBuilder().withLinha1(linha1).now();
		Stage anotherStage = cloneStage.cloneBuilder().withLinha1(linha1).withLinha2(linhatombo)
				.withLinha3(new Complements(linhaCai1, linhaCai2)).now();
		frames.add(anotherStage);
		return anotherStage;
	}
	
	public static Stage noChao(Stage p) throws CloneNotSupportedException {
		Stage cloneStage = p.cloneBuilder().withLinha1(linha1).now();
		Stage anotherStage = cloneStage.cloneBuilder().withLinha1(linha1).withLinha2(linhatombo)
				.withLinha3(new Complements(linhatomboMsg, linhaChao)).now();
		frames.add(anotherStage);
		return anotherStage;
	}
	
	public static Stage Msg(Stage p) throws CloneNotSupportedException {
		Stage cloneStage = p.cloneBuilder().withLinha1(linha1).now();
		Stage anotherStage = cloneStage.cloneBuilder().withLinha1(linha1).withLinha2(linhatombo)
				.withLinha3(new Complements(linhatomboMsg2, linhaFim)).now();
		frames.add(anotherStage);
		return anotherStage;
	}
	public static Stage fim(Stage p) throws CloneNotSupportedException {
		Stage cloneStage = p.cloneBuilder().withLinha1(linha1).now();
		Stage anotherStage = cloneStage.cloneBuilder().withLinha1(linha1).withLinha2(linhatombo)
				.withLinha3(new Complements(linhatomboMsg3, linhaFim2)).now();
		frames.add(anotherStage);
		return anotherStage;
	}

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		Stage person = new Stage(linha1, linha2, new Complements(linha3, linha4));		
		frames.add(person);
		person = andando(person);
		person = parado(person);
		person = andando(person);
		person = parado(person);
		person = andando(person);
		person = parado(person);
		person = andando(person);
		person = pedraAparece(person);
		person = pedraAproxima(person);
		person = pedraAproxima2(person);
		person = pedraAproxima3(person);
		person = tropeca(person);
		person = voa(person);
		person = cai(person);
		person = noChao(person);
		person = Msg(person);
		person = fim(person);
		animate();
	}

}
