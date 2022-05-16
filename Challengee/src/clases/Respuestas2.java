package clases;

import java.util.StringTokenizer;


public class Respuestas2 {
    String[] respuestas = {
        "El Burj Khalifa" ,"China","1989","El mosquito","Júpiter"
    };
     String[] opciones2 = {
         "Eifel,El Burj Khalifa, alcazar de Toledo, Torre Colpatria",
         "China, EEUU, Mexico, Inglaterra",
         "1900, 1987, 1989, 1990", 
         "El leon, El mosquito, El tiburon, Las serpientes",
         "Jupiter, Tuerra, pluton, la Tierra"    
     }; 
     
     public String getRespuestas(int posicion){
         return respuestas (posicion);
                
     }

    
    
    public String [] separar (String cadena, String separador){
        StringTokenizer token= new StringTokenizer (cadena,separador);
        
        String[] a = new String [5];
        int i=0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken();
            i++;
       }
        return a; 
       }
    public String[] setRespuestas (int posicion){
        String s1 = opciones2[posicion];
        String [] s2 =separar (s1, ",");
        return s2; 
    }

    private String respuestas(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
