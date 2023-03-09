
package regexpfecha;
    import java.util.Scanner;
    import java.util.regex.*;

public class RegexpFecha {
    
    public static boolean validateDate(String s){
        Pattern patron = Pattern.compile("[0-9]{2}\\-((0[13578]|1[02])\\-(0[1-9]|[12][0-9]|3[01])|(0[469]|11)\\-(0[1-9]|[12][0-9]|30)|((02\\-(0[1-9]|[12][0-9]))))");
        Matcher matcher = patron.matcher(s);
        return matcher.matches();
    }
    public static void main(String[] args) {
          Scanner sc =  new Scanner(System.in);
        String s, resultado;
        boolean date; 
                
        System.out.println("Ingrese la fecha (AA-MM-DD)");
        s = sc.nextLine();
        
        date = validateDate(s);
       
        resultado = date ? "Es una fecha valida" : "Es una fecha invalida";
        
        System.out.println(resultado);
    }
    
}
