import java.util.*;
public class Operacion {

    Scanner a = new Scanner(System.in);
    String ope = "";

    public void Suma(int b,int d,int res){

        ColaEntera cl = new ColaEntera(5);
        try{
            for(int i=0; i<5; i++){
                System.out.println("Ingresa el operando ");
                    b = a.nextInt();
                    ope = ope + b + " ";
                    cl.enconlar(b);
            } // FIN DEL FOR PARA DATOS

            for (int i=0; i<5; i++)
            {
                if(!cl.colaVacia()) {
                    d = d + cl.sacar();
                }
            }// FIN DEL FOR PARA LA OPERACION


            cl.enconlar(d);
            res=cl.sacar();
            System.out.println("El resultado es "+ res);
            System.out.println("+ " + ope);


        }catch(ExcepcionColaLlena Err){
            System.out.println(Err.getMessage());
        }catch(ExcepcionColaVacia Err){
            System.out.println(Err.getMessage());
        }

    }


    public void Resta(int b,int d,int res){

        ColaEntera cl = new ColaEntera(5);
        try{
            for(int i=0; i<5; i++){
                System.out.println("Ingresa el operando ");
                    b= a.nextInt();
                    ope = ope + b + " ";
                    cl.enconlar(b);
            }// FIN DEL FOR PARA DATOS

            for (int i=0; i<5; i++)
            {
                if(d == 0)
                {
                    d = d + cl.sacar();
                }else {
                    d = d - cl.sacar();
                }
            }// FIN DEL FOR PARA LA OPERACION

            cl.enconlar(d);
            res = cl.sacar();
            System.out.println("El resultado es "+ res);
            System.out.println("- " + ope);

        }catch(ExcepcionColaLlena Err){
            System.out.println(Err.getMessage());
        }catch(ExcepcionColaVacia Err){
            System.out.println(Err.getMessage());
        }

    }

    public void Multiplicacion(int b, int d, int res){

        ColaEntera cl = new ColaEntera(5);
        try{
            for(int i=0; i<5; i++){
                System.out.println("Ingresa el operando ");
                    b= a.nextInt();
                    ope = ope + b + " ";
                    cl.enconlar(b);
            }// FIN DEL FOR PARA DATOS

            for (int i=0; i<5; i++)
            {
                if(!cl.colaVacia()) {
                    d = d * cl.sacar();
                }
            } // FIN DEL FOR PARA REALIZAR OPERACION

            cl.enconlar(d);
            res=cl.sacar();
            System.out.println("El resultado es "+ res);
            System.out.println("* " + ope);

        }catch(ExcepcionColaLlena Err){
            System.out.println(Err.getMessage());
        }catch(ExcepcionColaVacia Err){
            System.out.println(Err.getMessage());
        }
    }

    public void Division(double b, double d, double res){


        ColaGen cl = new ColaGen(5);
        try{
            for(int i=0; i<5; i++){
                System.out.println("Ingresa el operando ");
                    b = a.nextDouble();
                    ope = ope+ b + " ";
                    cl.enconlar(b);
            } // FIN DEL FOR PARA DATOS

            for (int i=0; i<5; i++)
            {
                if(d == 1)
                {
                    d = ((double)cl.sacar());
                }else {
                    d = (d) / ((double) cl.sacar());
                }
            } // FIN PARA EL FOR PARA REALIZAR LA OPERACION

            cl.enconlar(d);
            res=(double) cl.sacar();
            System.out.println("El resultado es "+ res);
            System.out.println("/ " + ope);

        }catch(ExcepcionColaLlena Err){
            System.out.println(Err.getMessage());
        }catch(ExcepcionColaVacia Err){
            System.out.println(Err.getMessage());
        }
    }

} //FIN DE CLASE
