package TP3;

public class E {
    public static void main(String[] args){
           String Cursos [] = new String[]{"seg. e hig.", "Medio ambiente", "Gestion de la Calidad"};
           int puntajes [] = new int[] {8, 7, 9};
               System.out.println("Notas: ");
                for(int i=0; i<Cursos.length; i++){
                    System.out.println( Cursos[i] + " : " + puntajes[i]);
                    
                }System.out.println("Promedio total: " + (puntajes[0] + puntajes[1] + puntajes[2]) / 3);
    } 
    
}
