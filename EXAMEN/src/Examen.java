import java.util.Random;

public class Examen {

    public static void main(String[] args) {

        Random Spwaner = new Random();

        ListaEnlazada listaM = new ListaEnlazada();
        ListaEnlazada listaH =new ListaEnlazada();
        ListaEnlazada listaR = new ListaEnlazada();
        //PilaResina PilaR = new PilaResina(30);
        //PilaHilo PilaH = new PilaHilo(30);

        int m=0,h=0,r=0; //acumuladores
        int mad = 0, hil = 0, res = 0, bas = 0, cue = 0, ca = 0; // elementos de operación

        int mesa=0,baston=0,cuerda=0,cañas=0,barco=0;
        for(int i=1;i<=30;i++){

            System.out.println("****************DIA "+ i +"*************");


            int n = Spwaner.nextInt(3);
            if(n == 0){
                System.out.println("Encontraste 1 de madera  ");
                listaM.agregarAlInicio(new Nodo(null,n));
                mad++;
                m++;
            }else if(n == 1){
                System.out.println("Encontraste 1 de hilo");
                listaH.agregarAlInicio(new Nodo(null,n));
                hil++;
                h++;
            }else if(n == 2){
                System.out.println("Encontraste 1 de resina ");
                listaR.agregarAlInicio(new Nodo(null,n));
                res++;
                r++;
            }

            if(mad == 4){
                listaM.EliminarAlInicio();
                listaM.EliminarAlInicio();
                listaM.EliminarAlInicio();
                listaM.EliminarAlInicio();
                mad = mad - 4;
                mesa++;
                System.out.println("Crafteaste una mesa");
            }

            if(mesa == 1 && mad == 2){
                listaM.EliminarAlInicio();
                listaM.EliminarAlInicio();
                mad = mad - 2;
                bas++;
                baston++;
                System.out.println("Crafteaste un bastón");
            }

            if(mesa == 1){
                if(hil >= 4 && res >= 1){
                    listaH.EliminarAlInicio();
                    listaH.EliminarAlInicio();
                    listaH.EliminarAlInicio();
                    listaH.EliminarAlInicio();

                    //listaR.EliminarAlInicio();
                    hil = hil - 4;
                    res = res - 1;
                    cue++;
                    cuerda++;
                    System.out.println("Crafteaste una cuerda");
                }
            }

            if(mesa == 1){
                if(cue >=1 && bas >= 1){
                    cue = cue - 1;
                    bas = bas - 1;
                    ca++;
                    cañas++;
                    System.out.println("Crafteaste una caña");
                }
            }

            if (mesa == 1 && ca >= 1)
            {
                ca = ca - 1;
                barco++;
                System.out.println("Has crafteado un barco");
            }


        } // FIN DEL CLICO FOR

        System.out.println("****************Obtuviste***************");
        System.out.println("Madera " + m);
        System.out.println("Resina " + r);
        System.out.println("Hilo " + h);
        System.out.println();
        System.out.println("****************Crafteaste***************");
        System.out.println("Cañas "+cañas);
        System.out.println("Mesas "+mesa);
        System.out.println("Baston "+baston);
        System.out.println("Cuerda "+cuerda);
        System.out.println("Barco "+barco);
        
    }

}
