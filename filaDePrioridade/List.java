package filaDePrioridade;
import java.util.Scanner;

public class List<T>{
	private Node<T> node;
	Scanner scanner = new Scanner(System.in);
	int quantPessoas = 0;
	public void menu(){
        int op = 0;
        do{
            System.out.print("\nESCOLHA UMA DAS OPCOES ABAIXO\n");
            System.out.println("1 - Atendimento normal\n2 - Atendimento com prioridade\n3 - Atender\n4 - Listar todas as pessoas da fila.\n5 - SAIR");
            op = scanner.nextInt();
            String info = "";
            if(op == 1 || op == 2){
                System.out.print("INFORME O NOME: ");
                scanner.nextLine();
                info = scanner.nextLine();
            }

            
                switch(op){
                    case 1:
                    	insert(1,info);
                        break;
                    case 2:
                    	insert(2,info);
                        break;
                    case 3:
                    	remove();
                        break;
                    case 4:
                    	exibirFila();
                        break;
                    case 5:
                    	if(node == null) {
                    			System.out.println("Quantidade de pessoas atendidas " + quantPessoas);
                    	}else {
                    		op = 99;
                    		System.out.println("A fila nao esta vazia, remova todas as pessoas da fila antes de finalizar a aplicacao");
                    	}
                        
                }
        }while(op!=5);
	}
	public void insert(int data, String name) {
		quantPessoas++;
		node = insert(node, data, name);
	}
	
	private Node<T> insert(Node<T> node, int data, String name) {
		if(node == null) {
			return new Node<T>(data, name);
		}else {
			if(node.data < data) {
				Node<T> newNode = new Node<T>(data, name);
				newNode.next = node;
				return newNode;
			}else {
				node.next = insert(node.next, data,  name);
			}
		}
		return node;
	}
	
	public void remove(){
		if(node != null) {
        node = node.next;
		}else if(node == null){
			System.out.println("Nenhuma pessoa na fila");
		}
    }
	
	public void exibirFila(){
		exibirFila(node);
    }
	
	private void exibirFila(Node<T> node){
        if(node != null){
            System.out.println(node.name);
            exibirFila(node.next);
        }
    }

}