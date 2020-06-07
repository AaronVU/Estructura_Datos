public class Pila {

    private int Esquina[];
    private int indice;

    //constructor
    public Pila(){
    }

    public void apilar(int num)throws DesbordamientoPila{
        ListaEnlazada apilar=new ListaEnlazada();
        apilar.agregarAlInicio(new Nodo(null,num));
    }

    public Nodo sacar()throws SubdesbordamientoPila{
        ListaEnlazada esacar=new ListaEnlazada();
        Nodo e=esacar.EliminarAlInicio();
        return e;
    }

    public boolean vacia(){
        if(indice==0){
            return true;
        }
        return false;
    }

    public boolean llena(){
        if(indice==Esquina.length){
            return true;
        }
        return false;
    }

    public int capacidad(){
        return Esquina.length;
    }

    public int cantidad(){
        ListaEnlazada cantidad=new ListaEnlazada();
        int p=cantidad.getNoElementos();
        return p;
    }

}
