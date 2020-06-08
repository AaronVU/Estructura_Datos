public class Pila {

    private ListaEnlazada Esquina;

    public Pila(){
        Esquina = new ListaEnlazada();
    }

    public void apilar(int n) throws DesbordamientoPila{
        Esquina.agregarAlInicio(new Nodo(null,n));
    }

    public Nodo sacar() throws SubdesbordamientoPila{
        Nodo esacar = Esquina.EliminarAlInicio();
        return esacar;
    }

}
