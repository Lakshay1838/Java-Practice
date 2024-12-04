public class LowestCommonAncestor {
    static int lca(Node root,int n1,int n2){
        if(root == null)	return -1;

        if(root.data == n1)	return n1;
        if(root.data == n2)	return n2;

        int left = lca(root.left,n1,n2);
        int right = lca(root.right,n1,n2);

        if(left != -1 && right != -1)	return root.data;
        if(left == -1 && right != -1)	return right;
        if(left != -1 && right == -1)	return left;
        return -1;
    }
    static int lowestCommonAncestor(Node root, int k1, int k2) {
        return lca(root,k1,k2);
    }
}
