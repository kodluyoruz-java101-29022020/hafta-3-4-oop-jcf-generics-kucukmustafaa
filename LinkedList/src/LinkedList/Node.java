package LinkedList;

public class Node <T>{
	private Node<T> nextNode;
	private Node<T> prevNode;
	private T item ;
	
	public Node() {
		this.nextNode=null;
		this.prevNode=null;
		this.item=null;
	}
	public Node(T item) {
		this(null,null,item);
	}
	public Node(Node<T> prev,Node<T> next,T item) {
		this.item=item;
		this.nextNode=null;
		this.prevNode=null;
	}
	public T getItem() {
		return this.item;
	}
	public void setItem(T item)
	{
		this.item=item;
	}
	
	public Node<T> getNextNode() {
		return this.nextNode;
	}
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	public Node<T> getPrevNode() {
		return prevNode;
	}
	public void setPrevNode(Node<T> prevNode) {
		this.prevNode = prevNode;
	}
	
	
}
