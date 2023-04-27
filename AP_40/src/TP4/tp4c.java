package TP4;

import java.util.Scanner;

public class tp4c { 
	Scanner dato = new Scanner(System.in); 
	public void compraproducto(){  
		
		String nproducto = "";   
		double precio, total; 	
		double totalpagar = 0;
		int cantidad;			
		
		 System.out.println("Ingreso el nombre del producto"); 
		 nproducto= dato.next();				

		 System.out.println("Ingreso el precio del producto");
		 precio = dato.nextDouble();

		 System.out.println("Ingreso la cantidad");
		 cantidad =dato.nextInt();

		 total = precio * cantidad; 
		 System.out.println("total : " + total); 

			if(total > 1000){  
				System.out.println("descuento :"+ total*0.20);
				totalpagar = total - (total*0.20); 
				System.out.println("El neto a pagar es : "+totalpagar); 
			} else{ 
				System.out.println("No hay descuentos");
			}
	}

  public void seccion ( ) {  

	  String cliente;
	  System.out.println("Ingreso el nombre del cliente"); 
	  cliente = dato.next();
	  
	  System.out.println("Ingrese el nombre de la sección de productos: ");
	  String opcion =" ";
	  
	  System.out.println("frutas"); 
	  System.out.println("verduras");
	  System.out.println("gaseosas");
	  
	  opcion = dato.next(); 
	  	switch(opcion) {    
	  		case "frutas":  compraproducto();  break;
	  		case "verduras":  compraproducto();  break;
	  		case "gaseosas":  compraproducto();  break;
	  		}
  	}
  public static void main (String []args){
	  tp4c cp = new tp4c();  
	  cp.seccion();
  }  
}