import java.util.*;
public class Operacion {

    Scanner a = new Scanner(System.in);

    public void Suma(int b,int d,int res){

        ColaEntera cl = new ColaEntera(5);
        try{
            for(int i=0; i<5; i++){
                System.out.println("Ingresa el operando ");
                    b= a.nextInt();
                    cl.enconlar(b);
                    d=d+cl.sacar();
            }
            cl.enconlar(d);
            res=cl.sacar();
            System.out.println("El resultado es "+ res);

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
                    cl.enconlar(b);
                    d=d-cl.sacar();
            }
            cl.enconlar(d);
            res=cl.sacar();
            System.out.println("El resultado es "+ res);

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
                    cl.enconlar(b);
                    d=(d)*(cl.sacar());
            }
            cl.enconlar(d);
            res=cl.sacar();
            System.out.println("El resultado es "+ res);

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
                    b=a.nextDouble();
                    cl.enconlar(b);
                    d=(d)/((double)cl.sacar());
            }
            cl.enconlar(d);
            res=(double) cl.sacar();
            System.out.println("El resultado es "+ res);

        }catch(ExcepcionColaLlena Err){
            System.out.println(Err.getMessage());
        }catch(ExcepcionColaVacia Err){
            System.out.println(Err.getMessage());
        }
    }

} //FIN DE CLASE
