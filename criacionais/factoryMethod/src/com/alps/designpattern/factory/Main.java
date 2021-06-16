package com.alps.designpattern.factory;

public class Main {

    private static Transporte transporte;

    public static void main(String[] args) {

        configure(args[0]);
        if (transporte != null) {
            executarTransporte();
        }
    }

    private static void executarTransporte() {
        transporte.executarTransporte();
    }

    private static void configure(String type) {

        switch (type) {
            case "uber":
                transporte = new CarroTransporte();
                break;
            case "log":
                transporte = new MotoTransporte();
                break;
            case "eats":
                transporte = new BicicletaTransporte();
                break;
            default:
                System.out.println("Selecione o tipo da entrega.");
        }

    }
}
