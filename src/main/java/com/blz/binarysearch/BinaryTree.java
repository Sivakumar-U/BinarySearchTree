package com.blz.binarysearch;

public class BinaryTree<K extends Comparable<K>> {

	public BinaryNode<K> root;

	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	private BinaryNode<K> addRecursively(BinaryNode<K> currentValue, K key) {
		if (currentValue == null)
			return new BinaryNode<>(key);
		int result = key.compareTo(currentValue.key);
		if (result == 0)// 0
			return currentValue;
		if (result < 0)
			currentValue.leftSide = addRecursively(currentValue.leftSide, key);// -1
		else
			currentValue.rightSide = addRecursively(currentValue.rightSide, key);// 1
		return currentValue;
	}

	public int getSize() {
		return this.getSizeRecursively(root);
	}

	private int getSizeRecursively(BinaryNode<K> currentValue) {
		return currentValue == null ? 0
				: 1 + this.getSizeRecursively(currentValue.leftSide) + this.getSizeRecursively(currentValue.rightSide);
	}

}
