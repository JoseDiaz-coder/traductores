
package identificadores;
    import java.util.Scanner;
    import java.util.regex.*;
public class Identificadores {
    
    public static boolean identificador(String s){
        Pattern patron = Pattern.compile("[A-Za-z_][A-Za-z0-9_]*");
        Matcher matcher = patron.matcher(s);
        return matcher.matches();
    }
    
    public static boolean numero(String s){
        Pattern patron = Pattern.compile("[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)");
        Matcher matcher = patron.matcher(s);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s, resultado;
        boolean id,num; 
                
        System.out.println("Ingrese la cadena");
        s = sc.nextLine();
        
        id = identificador(s);
        num = numero(s);
       
        if (id) {
            System.out.println("Es un identificador");
        }else if(num){
            System.out.println("Es un numero");
        }
        
    }
    
}
