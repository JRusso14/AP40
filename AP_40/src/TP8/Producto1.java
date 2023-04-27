package TP8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

class Producto1 {
    private String nombre;
    private double precio;

    public Producto1(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }
}

class ItemCarrito {
    private Producto producto;
    private int cantidad;

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public int getCantidad() {
        return this.cantidad;
    }
}

class Carrito {
    private List<ItemCarrito> items;

    public Carrito() {
        items = new ArrayList<>();
    }

    public void agregarItem(ItemCarrito item) {
        items.add(item);
    }

    public double calcularPrecio() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.getProducto().getPrecio() * item.getCantidad();
        }
        return total;
    }
}

class Descuento extends Carrito {
    private double porcentaje;

    public Descuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double aplicarDescuento(double precio) {
        return precio * (1 - porcentaje / 100);
    }
}

public class Producto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreProducto1 = "";
        double precioProducto1 = 0.0;
        boolean continua;
        
        do {
            try {
                System.out.print("Ingrese el nombre del producto 1: ");
                nombreProducto1 = scanner.next();
                continua = false;
            } catch (InputMismatchException ex) {
                System.out.println("Debe ingresar obligatoriamente el nombre del producto");
                scanner.next();
                continua = true;
            } 
        } while (continua);   
        
        do {
            try {
            continua = false;
            System.out.print("Ingrese el precio del producto 1: ");
            precioProducto1 = scanner.nextDouble();
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente el precio del producto");
            scanner.next();
            continua = true;
        } 
    } while (continua);
            
        System.out.print("Ingrese la cantidad del producto 1: ");
        int cantidadProducto1 = scanner.nextInt();

        
        Producto producto1 = new Producto(nombreProducto1, precioProducto1);

        
        ItemCarrito item1 = new ItemCarrito(producto1, cantidadProducto1);

        
        System.out.print("Ingrese el nombre del producto 2: ");
        scanner.nextLine(); 
        String nombreProducto2 = scanner.nextLine();
        System.out.print("Ingrese el precio del producto 2: ");
        double precioProducto2 = scanner.nextDouble();
        System.out.print("Ingrese la cantidad del producto 2: ");
        int cantidadProducto2 = scanner.nextInt();

        
        Producto producto2 = new Producto(nombreProducto2, precioProducto2);

        
        ItemCarrito item2 = new ItemCarrito(producto2, cantidadProducto2);

        
        System.out.print("Ingrese el nombre del producto 3: ");
        scanner.nextLine(); 
        String nombreProducto3 = scanner.nextLine();
        System.out.print("Ingrese el precio del producto 3: ");
        double precioProducto3 = scanner.nextDouble();
        System.out.print("Ingrese la cantidad del producto 3: ");
        int cantidadProducto3 = scanner.nextInt();

        
        Producto producto3 = new Producto(nombreProducto3, precioProducto3);

        
        ItemCarrito item3 = new ItemCarrito(producto3, cantidadProducto3);


        Carrito carrito = new Carrito();
        carrito.agregarItem(item1);
        carrito.agregarItem(item2);
        carrito.agregarItem(item3);

        double precioSinDescuento = carrito.calcularPrecio();
        System.out.println("Precio sin descuento: " + precioSinDescuento);

        Descuento descuento = new Descuento(10);
        double precioConDescuento = descuento.aplicarDescuento(precioSinDescuento);
        System.out.println("Precio con descuento del 10%: " + precioConDescuento);
    }
}