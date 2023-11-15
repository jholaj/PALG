package experiments;

public class Cviko07_TreeNode
{
    private Cviko05_Item payload;
    private Cviko07_TreeNode leftChild;
    private Cviko07_TreeNode rightChild;
    private long key;

    public Cviko07_TreeNode(Cviko05_Item payload, Cviko07_TreeNode leftChild, Cviko07_TreeNode rightChild, long key) {
        this.payload = payload;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.key = key;
    }

    public Cviko05_Item getPayload() {
        return payload;
    }

    public Cviko07_TreeNode getLeftChild() {
        return leftChild;
    }

    public Cviko07_TreeNode getRightChild() {
        return rightChild;
    }

    public long getKey() {
        return key;
    }

    public void setPayload(Cviko05_Item payload) {
        this.payload = payload;
    }

    public void setLeftChild(Cviko07_TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Cviko07_TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public void setKey(long key) {
        this.key = key;
    }
}
