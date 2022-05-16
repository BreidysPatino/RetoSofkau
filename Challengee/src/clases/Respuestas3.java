package clases;

import java.util.StringTokenizer;


public class Respuestas3 {
    String[] respuestas = {
        " Rumanía", "1991" ,"206","peces","50"
    };
     String[] opciones3 = {
         " Rumanía, Venecía, Inglaterra, Reino Unido",
         "1991, 1989, 1990, 1999",
         "206, 230, 198, 265", 
         "mamiferos, peces, mamiferos y peces, ninguna de las anteriores",
         "90, 48, 45, 50",    
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
        String s1 = opciones3[posicion];
        String [] s2 =separar (s1, ",");
        return s2; 
    }

    private String respuestas(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
