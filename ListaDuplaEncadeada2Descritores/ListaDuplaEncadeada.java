package ListaDuplaEncadeada2Descritores;

public class ListaDuplaEncadeada {
    No inicio;
    No fim;
    int tam;

    public void inserirInicio(String nome){
        No no = new No();
        no.info = nome;
        no.anterior = null;
        no.proximo = inicio;

        if(inicio != null){
            inicio.anterior = no;
        }
        inicio = no;
        if(tam == 0){
            fim = inicio;
        }
        tam++;
    }

    public void inserirFim(String nome){
        No no = new No();
        no.info = nome;
        no.proximo = null;
        no.anterior = fim;
        if(fim != null){
            fim.proximo = no;
        }
        fim = no;
        if(tam == 0){
            inicio = no;
        }
        tam++;
    }

    //Exibindo elementos da lista
    public String toString(){
        String elementos = "";
        No c = inicio;
        while(c != null){
            elementos += c.info + "\n";
            c = c.proximo;
        }
        return elementos;
    }

    //Procurando elementos na lista
    public String procurarndoElementos(String nome){
        No c = inicio;
        while(c != null){
            if(c.info == nome){
                return "O elemento " + nome + " foi encontrado na lista";
            }
            c = c.proximo;
        }
        return "O elemento " + nome + " nao foi encontrado na lista";
    }
   
}
