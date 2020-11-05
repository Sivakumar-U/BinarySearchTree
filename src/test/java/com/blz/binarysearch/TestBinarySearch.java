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

	// UC2
	@Test
	public void givenNumbers_AddedInBinarySearchTree() {
		BinaryTree<Integer> binarySearch = new BinaryTree<>();
		binarySearch.add(56);
		binarySearch.add(30);
		binarySearch.add(70);
		binarySearch.add(60);
		binarySearch.add(95);
		binarySearch.add(65);
		binarySearch.add(63);
		binarySearch.add(67);
		binarySearch.add(22);
		binarySearch.add(40);
		binarySearch.add(11);
		binarySearch.add(3);
		binarySearch.add(16);
		int size = binarySearch.getSize();
		Assert.assertEquals(13, size);
	}

	// UC3
	@Test
	public void givenNumbers_ToSearchNumber_InBinarySearchTree() {
		BinaryTree<Integer> binarySearch = new BinaryTree<>();
		binarySearch.add(56);
		binarySearch.add(30);
		binarySearch.add(70);
		binarySearch.add(60);
		binarySearch.add(95);
		binarySearch.add(65);
		binarySearch.add(63);
		binarySearch.add(67);
		binarySearch.add(22);
		binarySearch.add(40);
		binarySearch.add(11);
		binarySearch.add(3);
		binarySearch.add(16);
		boolean result = binarySearch.searchRecursively(binarySearch.root, 63);
		Assert.assertTrue(result);
	}

}
