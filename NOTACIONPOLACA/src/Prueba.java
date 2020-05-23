import java.util.*;

public class Prueba {

    public static void main(String []args){
        Scanner a = new Scanner(System.in);
        int opc,c,d,b;
        int res;
        Operacion n= new Operacion();
        System.out.println("1.- SUMA, 2-. RESTA, 3.- MULTIPLICACION, 4.- DIVISION");
        System.out.println("ELIGE UNA OPCION ");
        opc=a.nextInt();
        switch(opc){

            case 1:
                n.Suma(0, 0, 0 );
                break;

            case 2:
                n.Resta(0, 0, 0);
                break;

            case 3:
                n.Multiplicacion(0, 1, 0);
                break;

            case 4:
                n.Division(0, 1, 0);
                break;

            default:
                break;

        }


    }// FIN DE MAIN

} // FIN DE CLASE
