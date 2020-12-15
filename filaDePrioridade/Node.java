package filaDePrioridade;

class Node<T> {
	public String name;
    public int data;
    public Node<T> next;
    
    public Node(int data, String name){
    	this.name = name;
        this.data = data;
        next = null;
    }
}
