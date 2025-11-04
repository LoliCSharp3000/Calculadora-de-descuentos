package calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double dr = 0.0;
        final double dp = 0.05;
        final double dO = 0.1;
        final double dP = 0.15;

        Scanner sc = new Scanner(System.in);
        ArrayList<Productos> list = new ArrayList<>();
        
        
        boolean func = true;
        String option;

        while (func) {
            System.out.println("que quieres hacer añadir producto: añadir   salir: salir    mostrar todos productos: mostrar");
            option = sc.nextLine();
            switch (option) {
                case "añadir":
                    Productos productos = new Productos();
                    System.out.println("Dame el nombre del producto");
                    productos.setName(sc.nextLine());
                    System.out.println("Dime el valor del producto");
                    productos.setCost(sc.nextDouble());
                    System.out.println("Que tipo de cliente eres: Regular   Plata   Oro   Platino");
                    sc.nextLine();
                    option = sc.nextLine();
                    switch (option) {
                        case "Regular":
                            productos.calcularPrecio(dr);
                            System.out.printf("Precio original: %.2f descuento: %.2f%% precio final: %.2f%n", productos.getCost(), dr * 100, productos.getFinalCost());
                            break;
                        case "Plata":
                            productos.calcularPrecio(dp);
                            System.out.printf("Precio original: %.2f descuento: %.2f%% precio final: %.2f%n", productos.getCost(), dp * 100, productos.getFinalCost());
                            break;
                        case "Oro":
                            productos.calcularPrecio(dO);
                            System.out.printf("Precio original: %.2f descuento: %.2f%% precio final: %.2f%n", productos.getCost(), dO * 100, productos.getFinalCost());
                            break;
                        case "Platino":
                            productos.calcularPrecio(dP);
                            System.out.printf("Precio original: %.2f descuento: %.2f%% precio final: %.2f%n", productos.getCost(), dP * 100, productos.getFinalCost());
                            break;
                        default:
                            System.out.println("pusiste mal el tipo de cliente, se pone como Regular");
                            productos.calcularPrecio(dr);
                            break;
                    }
                    System.out.println("Gracias por comprar " + productos.getName());
                    list.add(productos);
                    break;
                case "salir":
                    func = false;
                    break;
                case "mostrar":
                    if(list.isEmpty()){
                        System.out.println("La lista esta vacia");
                    }
                    else{
                        for (Productos producto : list) {
                            System.out.println("nombre " + producto.getName() + " precio final " + producto.getFinalCost());
                        }
                    }
                    break;
                default:
                    System.out.println("No pongas algo que no este dentro de las instrucciones");
                    break;
            }
        }
        sc.close();
    }
}