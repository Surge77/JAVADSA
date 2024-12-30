package Hashmaps;

//Implementing hashmaps also tests our knowledge of other data structures

import java.util.LinkedList;
import java.util.*;


public class HashmapImplementation {

    // Class to represent key-value pairs
    private class HMNode {
        String key;
        Integer value;

        public HMNode(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String toString() {
            return this.key + "@" + this.value;
        }
    }

    // Array of linked lists (buckets)
    private LinkedList<HMNode>[] bucketArray;
    private int size;  // number of key-value pairs in the hashmap

    public HashmapImplementation(int cap) {
        this.bucketArray = (LinkedList<HMNode>[]) new LinkedList[cap];  // Suppress warning with proper type casting
        this.size = 0;

        for (int i = 0; i < bucketArray.length; i++) {
            bucketArray[i] = new LinkedList<>();
        }
    }

    // Method to put a key-value pair in the hashmap
    public void put(String key, Integer value) {
        // Get the bucket index using the hash function
        int bi = hashFunction(key);
        LinkedList<HMNode> bucket = bucketArray[bi];
        int fi = findInBucket(bucket, key);

        // If the key doesn't exist, add the new key-value pair
        if (fi == -1) {
            HMNode newNode = new HMNode(key, value);
            bucket.addLast(newNode);
            this.size++;
        } else {
            // If key exists, update the value
            HMNode node = bucket.get(fi);
            node.value = value;
        }

        // Check load factor and rehash if necessary
        double threshold = (double) this.size / this.bucketArray.length;
        if (threshold > 0.5) {  // Assuming 2.0 as the load factor for rehashing
            rehash();
        }
    }

    // Method to find the bucket index using the hash code of the key
    public int hashFunction(String key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % bucketArray.length;
    }

    // Method to find the index of a key in a specific bucket
    private int findInBucket(LinkedList<HMNode> bucket, String key) {
        for (int i = 0; i < bucket.size(); i++) {
            HMNode node = bucket.get(i);
            if (node.key.equals(key)) {
                return i;
            }
        }
        return -1;
    }

    // Method to rehash the entire hashmap (doubling the bucket size)
    private void rehash() {
        LinkedList<HMNode>[] oldBucketArray = this.bucketArray;

        this.bucketArray = (LinkedList<HMNode>[]) new LinkedList[2 * oldBucketArray.length];
        this.size = 0;  // Reset size since we'll reinsert elements

        for (int i = 0; i < bucketArray.length; i++) {
            bucketArray[i] = new LinkedList<>();
        }

        // Reinsert each element from the old bucket array
        for (int i = 0; i < oldBucketArray.length; i++) {
            LinkedList<HMNode> bucket = oldBucketArray[i];
            for (HMNode node : bucket) {
                put(node.key, node.value);
            }
        }
    }

    // Method to get the value associated with a key
    public Integer get(String key) {
        int bi = hashFunction(key);
        LinkedList<HMNode> bucket = bucketArray[bi];
        int fi = findInBucket(bucket, key);

        if (fi == -1) {
            return null;  // Key not found
        } else {
            return bucket.get(fi).value;
        }
    }

    // Method to check if a key exists in the hashmap
    public boolean containsKey(String key) {
        int bi = hashFunction(key);
        LinkedList<HMNode> bucket = bucketArray[bi];
        int fi = findInBucket(bucket, key);
        return fi != -1;
    }

    // Method to remove a key-value pair from the hashmap
    public Integer remove(String key) {
        int bi = hashFunction(key);
        LinkedList<HMNode> bucket = bucketArray[bi];
        int fi = findInBucket(bucket, key);

        if (fi == -1) {
            return null;  // Key not found
        } else {
            HMNode node = bucket.remove(fi);
            this.size--;
            return node.value;
        }
    }

    // Method to get all the keys in the hashmap
    public ArrayList<String> keySet() {
        ArrayList<String> keys = new ArrayList<>();

        for (LinkedList<HMNode> bucket : bucketArray) {
            for (HMNode node : bucket) {
                keys.add(node.key);
            }
        }

        return keys;
    }

    // Method to display the contents of the hashmap
    public void display() {
        System.out.println("---------------------------------------------");
        for (int i = 0; i < bucketArray.length; i++) {
            LinkedList<HMNode> bucket = bucketArray[i];
            System.out.print("B" + i + " => ");
            for (HMNode node : bucket) {
                System.out.print(node + ", ");
            }
            System.out.println(".");
        }
        System.out.println("---------------------------------------------");
    }

}