package clases;

import java.util.StringTokenizer;


public class Respuestas4 {
    String[] respuestas = {
        " 12", "Japón" ,"1440","Gregor Mendel","Diamante"
    };
     String[] opciones4 = {
         " 35, 20,12, 16",
         "Japón, Francía, Ucranía, Rusía",
         "1440, 1450,1650,1980", 
         "Gregor Mendel, Escuel de medicina, Hardvard, Manuel elkin Patarroyo",
         "Esmeralda, Fantasía, Oro, Diamante ",    
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
        String s1 = opciones4[posicion];
        String [] s2 =separar (s1, ",");
        return s2; 
    }

    private String respuestas(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
