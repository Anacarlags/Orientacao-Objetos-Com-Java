package Pilha;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pilhaTestes {
	@Test
	public void testarPilha() {
	Pilha pilha = new Pilha();
	pilha.push(1);
	pilha.push(10);
	pilha.push(5);

	assertEquals(5, pilha.top());
	pilha.pop();
	assertEquals(10, pilha.top());
	pilha.pop();
	assertEquals(1, pilha.top());
	}

	@Test
	public void testarPilhaVazia() {
	Pilha pilha = new Pilha();
	assertEquals(0, pilha.top());
	}

}
