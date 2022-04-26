package day10;

public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    public void printNode(){
        System.out.println("Этот узел имеет значение: " + value);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public String toString() {
        return "Node{" +
                "value =" + value +
                ", leftChild =" + leftChild +
                ", rightChild =" + rightChild +
                "}";
    }
}
