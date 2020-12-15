package Pilha;

public class node {
	private int valor;
	private node proximo;
	
	 public node(int valor, node proximo){
         this.valor = valor ;
         proximo = null;
	 }
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public node getProximo() {
		return proximo;
	}
	
	public void setProximo(node proximo) {
		this.proximo = proximo;
	}

}
