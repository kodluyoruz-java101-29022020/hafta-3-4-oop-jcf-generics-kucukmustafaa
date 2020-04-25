package LinkedList;

import javax.management.RuntimeErrorException;

public class LinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	private Node<T> iter;
	private int size;

	public LinkedList() {
		this.size = 0;
		this.head = this.tail = null;
	}

	public int getSize() {
		return size;
	}

	public void increamentSize() {
		this.size++;
	}

	public void decreamentSize() {
		this.size--;
	}

	public void add(T item) {
		Node<T> new_node = new Node<T>(item);
		if (head == null) {
			head = new_node;
			tail = head;
		} else {
			new_node.setPrevNode(tail);
			tail.setNextNode(new_node);
			tail = tail.getNextNode();
		}
		increamentSize();
	}

	public boolean add(T item, int index) {

		if (index >= 0 && index <= size - 1) {
			int temp_index=0;
			iter = head;

			while (iter != null) {
				if (index == 0) {
					Node<T> newNode = new Node<T>(item);
					head.setPrevNode(newNode);
					head.getPrevNode().setNextNode(head);
					head = head.getPrevNode();
					head.setPrevNode(null);
					increamentSize();
					return true;
				} else if (index == size - 1) {
					Node<T> newNode = new Node<T>(item);
					tail.setNextNode(newNode);
					tail.getNextNode().setPrevNode(tail);
					tail = tail.getNextNode();
					tail.setNextNode(null);
					increamentSize();
					return true;
				}
				else if (index == temp_index) {
					Node<T> newNode = new Node<T>(item);
					iter.getPrevNode().setNextNode(newNode);
					iter.getNextNode().setPrevNode(newNode);
					newNode.setNextNode(iter);
					newNode.setPrevNode(iter.getPrevNode());
					increamentSize();
					break;
				}
				iter = iter.getNextNode();
				temp_index++;
			}

		} else {
			return false;
		}
		return false;
	}

	

	public void remove() {
		if (tail == null) {
			throw new RuntimeErrorException(null);
		} else {
			Node<T> tempNode;
			tail = tail.getPrevNode();
			tail.setNextNode(null);
			tempNode = null;
			decreamentSize();
		}
	}

	public void remove(T item) {
		if (tail == null) {
			throw new RuntimeErrorException(null);
		} else {
			int index = 0;
			iter = head;
			Node<T> tempNode = head;

			while (iter != null) {
				if (iter.getItem().equals(item) && index == 0) {
					head = head.getNextNode();
					tempNode = null;
					head.setPrevNode(null);
					decreamentSize();
					break;
				} else if (iter.getItem().equals(item) && index == size - 1) {
					tail = tail.getPrevNode();
					tempNode = null;
					tail.setNextNode(null);
					decreamentSize();
					break;
				} else if (iter.getItem().equals(item)) {
					tempNode = iter;
					iter.getPrevNode().setNextNode(iter.getNextNode());
					iter.getNextNode().setPrevNode(iter.getPrevNode());
					tempNode = null;
					decreamentSize();
					break;
				}
				iter = iter.getNextNode();
			}
		}

	}

	public boolean contain(T item) {
		iter = head;
		while (iter != null) {
			if (iter.getItem().equals(item)) {
				return true;
			}
			iter = iter.getNextNode();
		}
		return false;
	}

	public int indexOf(T item) {
		int index = 0;
		iter = head;
		while (iter != null) {
			if (iter.getItem().equals(item)) {
				return index;
			}
			iter = iter.getNextNode();
			index++;
		}
		return -1;
	}

	public void print() {
		iter = head;
		while (iter != null) {
			System.out.println(iter.getItem());
			iter = iter.getNextNode();
		}
		iter = null;
	}

}
