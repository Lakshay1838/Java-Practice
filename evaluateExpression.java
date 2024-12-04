
public class evaluateExpression {
    static int getVal(Node root){
        if(root == null)	return 0;
        if(root.leftChild == null && root.rightChild == null)	return root.data;

        int left = getVal(root.leftChild);
        int right = getVal(root.rightChild);

        if(root.data == 42)	return left * right;
        if(root.data == 43)	return left + right;
        if(root.data == 45)	return left - right;
        if(root.data == 47){
            if(right == 0)	return 0;
            else 	return left/right;
        }
        return 0;
    }
    static int evaluateTree(Node t1) {
        return getVal(t1);
    }
}
