package ListaSimplesCom1Descritor;

public class Lista {
    No inicio = null;
    int tam = 0;

    //Inserindo elemento no inicio
    public void inserirInicio(String info){
        No no = new No();
        no.info = info;
        no.proximo = inicio;
        inicio = no;
        tam++;
    }
    
    public void inserirFinal(String info){
        No no = new No();
        no.info = info;
        //Verificando se a lista possui algum elemento
        if(inicio == null){
            no.proximo = null;
            inicio = no;
        }else{
            No c = inicio;
            while(c.proximo != null){
                c = c.proximo;
            }
            c.proximo = no;
            no.proximo = null;
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