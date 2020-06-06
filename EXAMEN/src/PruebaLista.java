public class PruebaLista {

    public static void main(String[] args) {

        ListaEnlazada lista= new ListaEnlazada();
        System.out.println("La lista es ");
        System.out.println(lista);

        lista.agregarAlInicio(new Nodo(null,1));
        System.out.println("La lista es ");
        System.out.println(lista);

        lista.agregarAlInicio(new Nodo(null,2));
        System.out.println("La lista es ");
        System.out.println(lista);

        lista.agregarAlFin(new Nodo(null,10));
        System.out.println("La lista es ");
        System.out.println(lista);

        lista.agregarAlFin(new Nodo(null,20));
        System.out.println("La lista es: ");
        System.out.println(lista);
        /////////////////////////////////////////
        Nodo Busca=new Nodo(null,10);
        boolean Resp;
        Resp =lista.buscar(Busca);
        System.out.println(Resp);

        lista.EliminarPorNodo(Busca);
        System.out.println(lista);

        Nodo eliminado =lista.EliminarAlFin();
        System.out.println(eliminado.Siguiente);
        /////////////////////////////////////////
        System.out.println(lista);
        System.out.println(lista.PorIndice(0));
        for(int j=0; j<lista.getNoElementos(); j++){
            System.out.println(lista.PorIndice(j));
        }
    }
}
