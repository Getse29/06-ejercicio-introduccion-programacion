package com.getsemani;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el valor del producto");
        double valorProducto = scanner.nextDouble();
        getIva(valorProducto);
    }
    private static void getIva(double valorProducto) {
        double iva = valorProducto * 0.19;
        double valorTotal = valorProducto + iva;

        System.out.println("El valor del producto es: " + valorProducto);
        System.out.println("El valor del iva es: " + iva);
        System.out.println("El valor total es: " + valorTotal);
    }
}
