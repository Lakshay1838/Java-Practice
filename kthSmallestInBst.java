public class kthSmallestInBst {

    static int ans = -1;

    static void kthEle(Node root,int[] k){
        if(root == null)	return;

        kthEle(root.left,k);
        k[0]--;
        if(k[0] == 0){
            ans = root.data;
            return;
        }
        kthEle(root.right,k);
    }
    static int kSmallest(Node root, int key) {
        if(root == null)	return 0;
        int k[] = new int[1];
        k[0] = key;
        kthEle(root,k);
        return ans;
    }

}
