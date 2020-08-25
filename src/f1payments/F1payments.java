package f1payments;

import org.w3c.dom.Node;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class F1payments{

    public static void printFooBarBaz(int n){

//        Time -  15:43
//   produce a system that can vary its output based upon a specific count.
//   This output should vary depending on if the count is current at 2, 3 or 6 any number divisible thereby.
//   If the count is not at a number divisible by 2, 3 or 6 it should print the counter, otherwise print foo
//   when the count is divisible by 2,
//   print bar when its divisible by 3 or print baz when its divisible by 6.
//   This cannot be hard coded, please generate a function that does this.
//   The system in theory counts forever printing values, but you don’t have to worry about
//   memory management or anything like that.
//
//    expected output:
//            1
//    foo
//            bar
//    foo
//        5
//    baz
//        7
//    foo
//            bar
//    foo
//        11.

//    }

        for (int i = 0; i <= n; i++) {
             if (i % 6 == 0) {
                System.out.println(" baz");
            } else if (i % 3 == 0) {
                System.out.println(" bar");
            } else if (i % 2 == 0) {
                System.out.println(" foo");
            } else {
            System.out.println(i);}
        }

    }

//    ============================ Problem 2===========================
//    Time - 19:39
//    given a sentence, please reverse the characters within the sentence
//    while leaving the words in the sentence. You can assume all characters
//    are standard UTF-8 and you can ignore punctuation.
//    You can also assume for simplicity that you can fit the entire sentence in memory.
//    Lastly for simplicity, you can assume that there will only ever be one space between
//    each word (so you don't have to worry about mismatched amounts of white space).

//    example
//    input: "the cat is fat"
//    output: "eht tac si taf"
//
//    input: "band camp is great!"
//    output: "dnab pmac si !taerg"

    //method to implment
    public static void reverseCharacters(String input) {

                String [] words = input.split(" ");
                StringBuilder reversedInput = new StringBuilder();

               for (String word: words) {
                   String sentence = new StringBuilder(word).reverse().toString();
                reversedInput.append(sentence + " ");
               }

               System.out.println("The reversed sentence is: " + reversedInput.toString().trim());
        }

//      Time: 2hrs 27 minutes
//    given a sorted array list of integers, please create a balanced binary tree.
//    note that you can use the following helper class if you would like.
//    You should return the root of the tree as your result.
//
//    input: [1,2,3,4,5,6,7]
//    output: 4
//          /  \
//         2    6
//       / \  / \
//     1   3 5   7
//  (you would return the node with a value of 4)

//         class Node {
//        public int value;
//        public Node left;
//        public Node right;
//
//public Node(int v, Node l, Node r) {
//            this.value = v;
//            this.left = l;
//            this.right = r;
//        }
//    }
////
    //method to implement
    static class Node {
        public int value;
        public Node left;
        public Node right;
        public Node(int v, Node l, Node r) {
            this.value = v;
            this.left = l;
            this.right = r;
        }
    }
        // //method to implement
        public static Node balancedTree(int[] inputList) {
            return helper(inputList, 0, inputList.length - 1);
        }
        private static Node helper(int[] nums, int low, int high) {
            if (low > high) {
                return null;
            }
            int mid = low + (high - low) / 2;
            // center val of sorted array as the root of the bst
            Node head = new Node(nums[mid], null, null);
            // left of the mid value should go to the left of this root node to satisfy bst
            head.left = helper(nums, low, mid - 1);
            // right of the mid value should go to the right of this root node to satisfy
            // bst
            head.right = helper(nums, mid + 1, high);
            return head;
        }
        



    public static void main(String args[]){
           printFooBarBaz(11);
           reverseCharacters("the cat is fat");
        ArrayList<Integer> startInts = new ArrayList<>();
        startInts.add(1);
        startInts.add(2);
        startInts.add(3);
        startInts.add(4);
        startInts.add(5);
        startInts.add(6);
        startInts.add(7);
        int[] test = startInts.stream().mapToInt(i -> i).toArray();
        System.out.println(balancedTree(test).value);
           

       }


}




