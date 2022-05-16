
package clases;

import java.util.StringTokenizer;


public class Respuestas {
    String[] respuestas = {
        " río Magdalena", "Oceano pacifico" ,"Siete lados","La ballena azul","Oxígeno"
    };
     String[] opciones = {
         " río Magdalena, río Nilo, río Amazonas,  río Misisipi",
         "Oceano pacifico, Oceano Indico, Oceano caribe, Oceano Artico",
         "ocho lados,cinco lado,Siete lados,nueve lados", 
         "el tiburon ballena, elefante, rinoceronte,La ballena azul",
         "sábila, Oxígeno,  Azufre , Sulfato, Hidrogeno",    
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
        String s1 = opciones[posicion];
        String [] s2 =separar (s1, ",");
        return s2; 
    }

    private String respuestas(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
