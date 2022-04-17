public class Tree {
    public static void main(String[] args) {
        BinaryTrees binaryTrees = new BinaryTrees();
        binaryTrees.add(6);
        binaryTrees.add(4);
        binaryTrees.add(8);
        binaryTrees.add(3);
        binaryTrees.add(5);
        binaryTrees.add(7);
        binaryTrees.add(9);

        binaryTrees.traverseInOrder(binaryTrees.root);
        System.out.println("\n");
        binaryTrees.traversePostOrder(binaryTrees.root);
        System.out.println("\n");
        binaryTrees.traversePreOrder(binaryTrees.root);
        System.out.println("\n");
        binaryTrees.traverseLevelOrder();
        System.out.println("\n");
        binaryTrees.traverseInOrderWithoutRecursion();
        System.out.println("\n");
        binaryTrees.traversePostOrderWithoutRecursion();
        System.out.println("\n");
        binaryTrees.traversePreOrderWithoutRecursion();

    }
}
