package TP3;

public class D
{ 
    public static void main(String[] args){
           String Articulos [] = new String[] {"Pelota", "Zapatillas", "Guantes"};
           int precios [] = new int[] {5000, 25600, 2700};

            System.out.println("articulos deportivos");

            for (int i=0; i<Articulos.length; i++) {

                System.out.println( Articulos[i]+ " : $" + precios[i]);
            }
    }
}
