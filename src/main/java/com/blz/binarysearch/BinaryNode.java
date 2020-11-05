package com.blz.binarysearch;

public class BinaryNode<K extends Comparable<K>> {

	K key;
	BinaryNode<K> leftSide;
	BinaryNode<K> rightSide;

	public BinaryNode(K key) {
		super();
		this.key = key;
		this.leftSide = null;
		this.rightSide = null;
	}

}
