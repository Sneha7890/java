package com.wipro.java.collections.hashmap;

import java.util.LinkedList;

	class MyHashMap<K, V> {
	    private static final int SIZE = 16; // Default size
	    private LinkedList<Entry<K, V>>[] buckets;

	    // Entry class to store key-value pairs
	    static class Entry<K, V> {
	        K key;
	        V value;

	        Entry(K key, V value) {
	            this.key = key;
	            this.value = value;
	        }
	    }

	    // Constructor
	    public MyHashMap() {
	        buckets = new LinkedList[SIZE];
	        for (int i = 0; i < SIZE; i++) {
	            buckets[i] = new LinkedList<>();
	        }
	    }

	    // Hash function to compute bucket index
	    private int getBucketIndex(K key) {
	        return Math.abs(key.hashCode() % SIZE);
	    }

	    // Put method to insert key-value pairs
	    public void put(K key, V value) {
	        int index = getBucketIndex(key);
	        LinkedList<Entry<K, V>> bucket = buckets[index];

	        for (Entry<K, V> entry : bucket) {
	            if (entry.key.equals(key)) {
	                entry.value = value; // Update value if key exists
	                return;
	            }
	        }
	        bucket.add(new Entry<>(key, value)); // Insert new entry
	    }

	    // Get method to retrieve a value by key
	    public V get(K key) {
	        int index = getBucketIndex(key);
	        LinkedList<Entry<K, V>> bucket = buckets[index];

	        for (Entry<K, V> entry : bucket) {
	            if (entry.key.equals(key)) {
	                return entry.value;
	            }
	        }
	        return null; // Key not found
	    }

	    // Remove method to delete a key-value pair
	    public void remove(K key) {
	        int index = getBucketIndex(key);
	        LinkedList<Entry<K, V>> bucket = buckets[index];

	        bucket.removeIf(entry -> entry.key.equals(key));
	    }

	    // Display method to print the HashMap contents
	    public void display() {
	        for (int i = 0; i < SIZE; i++) {
	            if (!buckets[i].isEmpty()) {
	                System.out.print("Bucket " + i + ": ");
	                for (Entry<K, V> entry : buckets[i]) {
	                    System.out.print("[" + entry.key + " -> " + entry.value + "] ");
	                }
	                System.out.println();
	            }
	        }
	    }

	    public static void main(String[] args) {
	        MyHashMap<String, Integer> map = new MyHashMap<>();

	        // Insert key-value pairs
	        map.put("Alice", 25);
	        map.put("Bob", 30);
	        map.put("Charlie", 35);
	        map.put("David", 40);

	        // Retrieve values
	        System.out.println("Bob's Age: " + map.get("Bob")); // Output: 30

	        // Remove a key
	        map.remove("Charlie");

	        // Display the HashMap
	        System.out.println("\nHashMap Contents:");
	        map.display();
	    }
	}

