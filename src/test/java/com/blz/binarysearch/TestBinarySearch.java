package com.blz.binarysearch;

import org.junit.Assert;
import org.junit.Test;

public class TestBinarySearch {

	// UC1
	@Test
	public void gitven3Numbers_AddedInBinarySearchTree() {
		BinaryTree<Integer> binarySearch = new BinaryTree<>();
		binarySearch.add(56);
		binarySearch.add(30);
		binarySearch.add(70);
		int size = binarySearch.getSize();
		Assert.assertEquals(3, size);
	}

}
