public class isFoldable {
    static int isStructural(Node root1,Node root2){
        if(root1 == null && root2 == null)	return 1;
        if((root1 == null && root2 != null) || (root2 == null && root1 != null)){
            return 0;
        }
        int left = isStructural(root1.left,root2.right);
        int right = isStructural(root1.right,root2.left);
        if(left == 0 && right == 0)	return 0;
        else if(left == 0 && right != 0)	return 0;
        else if(left != 0 && right == 0)	return 0;
        else return 1;
    }
    static int isPossible(Node root){
        if(root == null)	return 1;
        if(root.left == null && root.right == null)	return 1;

        return isStructural(root.left,root.right);
    }
    static int isFoldable(Node root) {
        // Write your code here
        return isPossible(root);
    }
}
