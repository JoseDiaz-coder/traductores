
package contarpalabras;

public class ContarPalabras {
    public static void main(String[] args) {
        //espacio = 32, tabulador = 9
        //intro = 10 $=36
       int a;
       String palabra="";
       int contadorPalabras = 0, contadorLineas = 1;
       boolean flag = false;
       
        try{
           a = System.in.read();
           palabra += (char) a;
           while(a != 36){
                a = System.in.read();
                if (  a != 10 && a!= 9 && a != 32) {
                       palabra += (char) a;
                       flag = true;
                }
                else {
                    if (flag) {
                        contadorPalabras++;
                        flag = false;
                    }
                }                                           
                if (a == 10) 
                   contadorLineas++;
                                            
           }
            System.out.println(palabra.substring(0,palabra.length()-1));
            System.out.println("El numero de palabrasa es: " + contadorPalabras);
            System.out.println("El numero de lineas es: " + contadorLineas);
           
        }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
          
    }
    
}
