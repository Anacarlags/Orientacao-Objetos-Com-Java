package ListaDuplaEncadeada2Descritores;

public class Execulta_ListaDuplaEncadeada {

    public static void main(String[] args) {
        ListaDuplaEncadeada lista = new ListaDuplaEncadeada();

        //Printando lista vazia
        System.out.println(lista);

        //Adicionando elementos na lista
        lista.inserirInicio("Ana Carla");
        lista.inserirInicio("Antonio Carlos");
        lista.inserirInicio("Claudio");
        lista.inserirInicio("Lina");

        //Printando todos os elementos da lista
        System.out.println(lista);

        //Procurando elemento na lista
        System.out.println(lista.procurarndoElementos("Lina"));
    }
}
