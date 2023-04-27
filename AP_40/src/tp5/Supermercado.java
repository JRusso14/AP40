package tp5;


import java.util.Scanner;


class Producto {
 String nombre;
 double precio;

 
 Producto(String nombre, double precio) {
     this.nombre = nombre;
     this.precio = precio;
 }
}


class ItemCarrito {
 Producto producto;
 int cantidad;

 
 ItemCarrito(Producto producto, int cantidad) {
     this.producto = producto;
     this.cantidad = cantidad;
 }

 
 double total() {
     return this.producto.precio * this.cantidad;
 }
}


class Carrito {
 ItemCarrito[] items;

 
 Carrito(ItemCarrito[] items) {
     this.items = items;
 }

 
 
 double total() {
     double total = 0;
     for (ItemCarrito item : this.items) {
         total += item.total();
     }
     return total;
 }


}


class Descuento {
 double porcentaje;

 
 Descuento(double porcentaje) {
     this.porcentaje = porcentaje;
 }
}

public class Supermercado {

 public static void main(String[] args) {

     
     Producto[] productos = {
             new Producto("Jabon en polvo", 40),
             new Producto("Esponjas", 10),
             new Producto("Chocolates", 100)
     };

     
     Scanner teclado = new Scanner(System.in);
     int[] cantidades = new int[3];
     for (int i = 0; i < productos.length; i++) {
         System.out.print("Ingrese cantidad de " + productos[i].nombre + ": ");
         cantidades[i] = teclado.nextInt();
     }


     teclado.close();
    
     ItemCarrito[] items = {
             new ItemCarrito(productos[0], cantidades[0]),
             new ItemCarrito(productos[1], cantidades[1]),
             new ItemCarrito(productos[2], cantidades[2])
     };

     
     Carrito carrito = new Carrito(items);

     
     for (int i = 0; i < items.length; i++) {
         System.out.println((cantidades[i]) + " " + productos[i].precio + " " + productos[i].nombre);
     }

     
     System.out.println("total: " + carrito.total());

    
 }
}