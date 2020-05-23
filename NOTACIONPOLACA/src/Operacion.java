import java.util.*;
public class Operacion {

    Scanner a = new Scanner(System.in);
    int[] op = new int[5];




    public void Suma(int b,int d,int res){
        int[] op = new int[5];

        ColaEntera cl = new ColaEntera(5);
        try{
            for(int i=0; i<5; i++){
                System.out.println("Ingresa el operando ");
                b= op[i] =a.nextInt();

                d=d+b;
            }
            cl.enconlar(d);
            System.out.println(" + "+op[0]+" "+op[1]+" "+op[2]+" "+op[3]+" "+op[4]);
            res=cl.sacar();
            System.out.println("El resultado es "+d);

        }catch(ExcepcionColaLlena Err){
            System.out.println(Err.getMessage());
        }catch(ExcepcionColaVacia Err){
            System.out.println(Err.getMessage());
        }

    }


    public void Resta(int b,int d,int res){
        int[] op = new int[5];

        ColaEntera cl = new ColaEntera(5);
        try{
            for(int i=0; i<5; i++){
                System.out.println("Ingresa el operando ");
                b= op[i] =a.nextInt();

                d=d-b;
            }
            cl.enconlar(d);
            System.out.println(" - "+op[0]+" "+op[1]+" "+op[2]+" "+op[3]+" "+op[4]);
            res=cl.sacar();
            System.out.println("El resultado es "+d);

        }catch(ExcepcionColaLlena Err){
            System.out.println(Err.getMessage());
        }catch(ExcepcionColaVacia Err){
            System.out.println(Err.getMessage());
        }

    }

    public void Multiplicacion(int b, int d, int res){
        int[] op = new int[5];

        ColaEntera cl = new ColaEntera(5);
        try{
            for(int i=0; i<5; i++){
                System.out.println("Ingresa el operando ");
                b= op[i] =a.nextInt();

                d=(d)*(b);
            }
            cl.enconlar(d);
            System.out.println(" * "+op[0]+" "+op[1]+" "+op[2]+" "+op[3]+" "+op[4]);
            res=cl.sacar();
            System.out.println("El resultado es "+d);

        }catch(ExcepcionColaLlena Err){
            System.out.println(Err.getMessage());
        }catch(ExcepcionColaVacia Err){
            System.out.println(Err.getMessage());
        }
    }

    public void Division(double b, double d, double res){

        double[] op = new double[5];

        ColaGen cl = new ColaGen(5);
        try{
            for(int i=0; i<5; i++){
                System.out.println("Ingresa el operando ");
                b= op[i] =a.nextDouble();

                d=(d)/(b);
            }
            cl.enconlar(d);
            System.out.println(" * "+op[0]+" "+op[1]+" "+op[2]+" "+op[3]+" "+op[4]);
            res=(double) cl.sacar();
            System.out.println("El resultado es "+d);

        }catch(ExcepcionColaLlena Err){
            System.out.println(Err.getMessage());
        }catch(ExcepcionColaVacia Err){
            System.out.println(Err.getMessage());
        }
    }

} //FIN DE CLASE
