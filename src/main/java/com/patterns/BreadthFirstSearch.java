package com.patterns;


import com.util.PrintHelper;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//TODO Breadth First Search (BFS)
public class BreadthFirstSearch {
    static Node root;

    public static void main(String[] args) {
        BreadthFirstSearch bfs = new BreadthFirstSearch();
//        root = new Node(0);
        bfs.insert(47);
        bfs.insert(21);
        bfs.insert(76);
        bfs.insert(18);
        bfs.insert(27);
        bfs.insert(52);
        bfs.insert(82);

        ArrayList<Integer> results = bfs.breadthFirstSearch();

        PrintHelper.printArray(results.stream().mapToInt(i -> i).toArray());


    }

    private ArrayList<Integer> breadthFirstSearch() {
        Node current = root;
        Queue<Node> q = new LinkedList<>();
        q.offer(current);
        ArrayList<Integer> result = new ArrayList<>();
        while(!q.isEmpty()){
            current = q.remove();
            result.add(current.value);
            if(current.left != null)q.offer(current.left);
            if(current.right != null)q.offer(current.right);

        }
        return result;
    }


    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

//    public boolean contains(int value) {
//        if (root == null) return false;
//        Node temp = root;
//        while (temp != null) {
//            if (value < temp.value) {
//                temp = temp.left;
//            } else if (value > temp.value) {
//                temp = temp.right;
//            } else {
//                return true;
//            }
//        }
//        return false;
//    }




}
