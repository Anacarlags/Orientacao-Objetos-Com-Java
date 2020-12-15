package Pilha;

public class Pilha {

	 node base;
	 int qtd= 0;
	 
	
	public void push(int valor) {
		node novoNo = new node(valor, base);
		base = novoNo;
		qtd++;
	}
	
	public int pop() {
		int temp = base.getValor();
		base = base.getProximo();
		qtd--;
		return temp;
	}
	
	public int  top() {
		return base.getValor();
		}
	
}
