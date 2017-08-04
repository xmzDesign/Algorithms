package day03;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item>{
	
	private Node first;
	public class Node{
		Node next;
		Item item;
	}
	private int N;
	public boolean isEmpty(){
		return N==0;
	}
	public int size(){
		return N;
	}
	
	public void push(Item item){
		Node oldFirst=first;
		first=new Node();
		first.item=item;
		first.next=oldFirst;
		N++;
	}
	
	public Item pop(){
		//从栈顶删除元素
		Item item = first.item;
		first=first.next;
		N--;
		return item;
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
