package com.vijfhart.casus.tree;

import java.util.*;

class NameNode<E extends Node<E>> extends AbstractNode<E> implements Node<E>, LevelComparable<E>, Comparator<E> {
//class NameNode extends AbstractNode {
	private String naam;
	private E parentNode;
	
	public NameNode(){}
	
	public NameNode(String naam){
		this.naam = naam;
		this.parentNode = null;
	}
	
	public NameNode(String naam, E parentNode) {
		this.naam = naam;
		this.parentNode = parentNode;
	}

	public String getName() {
		return this.naam;
	}
	
	public E getParent() {
		return this.parentNode;
	}

	public boolean equals(Object o) {
		if(o != null && o instanceof NameNode) {
			NameNode node = (NameNode)o;
			if(node.getName().equals(naam) && parentNode == node.getParent()) {return true;}
		}
		return false;
	}
	
	public String toString(){
		//return "NameNode with name " + this.getName() + " and parent " + (this.getParent()).getName();
		//return "NameNode with name " + this.naam + " and parent " + (this.getParent()).naam;
		return this.naam;
	}

	public boolean isLeaf() {
		return true;
	}

	//public void setParent(E node) {
		//this.parentNode = node;
	//}
	
	//public int compare(E node1, E node2) {
		//return node1.compareLevelTo(node2);
	//}

	//public int compareTo(E node) {
		//return this.compareLevelTo(node);
	//}
	
	//public int compareLevelTo(E node) {
		
		//if(node.getParent() == null) return 1;
		//if(this.getParent() == null) return -1;
		//if((this.getParent()).equals(node.getParent())) {return 0;}
		
		//return (this.getParent()).compareLevelTo(node.getParent());
		
	//}

}
