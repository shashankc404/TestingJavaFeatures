package com.emabarks;

import java.io.IOException;
import java.sql.SQLOutput;

public class Strings {


    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int i) {
            this.data = i;
            left = null;
            right = null;
        }

        public Node(int i, Node left, Node right) {
            this.data = i;
            this.left = left;
            this.right = right;
        }
    }


    public static void main(String[] args) throws RuntimeException {

//        System.out.println("hello");

        Node n5 = new Node(5);
        Node n4 = new Node(4);
        Node n3 = new Node(3, null, n5);
        Node n2 = new Node(2, n4, null);
        Node root = new Node(1, n2, n3);

        System.out.println("Are siblings :"+check(root,4,5));
    }

    public static boolean check(Node root, int n1, int n2){

       int level1=findLevel(root,n1,0);
       int level2=findLevel(root,n2,0);
        System.out.println("leve1: "+level1+ ","+"level2 :"+level2);
       if(level1!=level2)
           return false;

      return  checkSiblings(root,n1,n2);

    }

    public static boolean checkSiblings(Node root, int n1, int n2){

        if(root==null)
            return false;

        if(root.left!=null && root.right!=null) {
            if ((root.left.data == n1 && root.right.data == n2) || (root.left.data == n2 && root.right.data == n1))
                return true;


        }

       return checkSiblings(root.left,n1,n2) || checkSiblings(root.right,n1,n2);




    }

    public static int findLevel(Node root, int num, int level){

        if(root==null)
            return -1;

        if(root.data==num)
            return level;

          int left=  findLevel(root.left,num,level+1);
          int right=  findLevel(root.right,num,level+1);

          if(left!=-1)
              return left;
          else
              return right;


    }








}
