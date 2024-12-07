package Trie;

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode(); // Initialize root node
    }

    // Insert a word into the trie
    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true; // Mark the end of the word
    }

    // Search for a word in the trie
    public boolean search(String word) {
        TrieNode node = searchNode(word);
        return node != null && node.isEndOfWord;
    }

    // Check if any word in the trie starts with the given prefix
    public boolean startsWith(String prefix) {
        return searchNode(prefix) != null;
    }

    // Helper method to find the node corresponding to a prefix or word
    private TrieNode searchNode(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        return node;
    }
}

// Node class for Trie
public class TrieNode {
    TrieNode[] children; // Array to hold child nodes for 'a' to 'z'
    boolean isEndOfWord; // Flag to indicate end of a word

    public TrieNode() {
        children = new TrieNode[26]; // Initialize 26 child nodes
        isEndOfWord = false;         // Default is not end of a word
    }
}
