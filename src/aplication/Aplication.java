package aplication;

import util.ConversaoMoeda;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o preço do dolar: ");
        double precoDolar = sc.nextDouble();
        System.out.println("Quantos dolares você vai comprar: ");
        double quantDolar = sc.nextDouble();

        System.out.printf("Valor em reais: %.2f%n " , ConversaoMoeda.totalDolarEmReais(precoDolar , quantDolar));
    }
}
