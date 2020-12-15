package ListaSimplesCom1Descritor;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        //Printando lista vazia
        System.out.println(lista);

        //Adicionando elementos na lista
        lista.inserirInicio("Ana Carla");
        lista.inserirInicio("Antonio Carlos");
        lista.inserirInicio("Claudio");
        lista.inserirInicio("Lina");

        //Printando todos os elementos da lista
        System.out.println(lista);

        //Adicionando elementos no final da lista
        lista.inserirFinal("Brena");
        lista.inserirFinal("Raquel");

        //Printando todos os elementos da lista
        System.out.println(lista);

        //Procurando elemento na lista
        System.out.println(lista.procurarndoElementos("Brena"));
    }
}
