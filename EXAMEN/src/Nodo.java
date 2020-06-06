public class Nodo {

    public Nodo Siguiente;
    private int Data;

    public Nodo(Nodo Sig, int Data){
        this.Siguiente = Sig;
        this.Data = Data;
    }

    public int getData() {
        return Data;
    }

    public void setData(int Data) {
        this.Data = Data;
    }

    public String toString(){
        return "Data: " + Data;
    }
}
