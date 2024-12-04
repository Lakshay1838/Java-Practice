public class treeFromInPost {
    static HashMap<Integer,Integer> mp = new HashMap<>();
    static int pIndex;

    static Node createTree(int in[],int post[],int s,int e){

        if(s > e)	return null;

        int num = post[pIndex--];
        Node root = new Node(num);

        int iIndex = mp.get(num);

        root.rightChild = createTree(in,post,iIndex+1,e);
        root.leftChild = createTree(in,post,s,iIndex-1);

        return root;
    }
    static Node buildTree(int in[], int post[], int N) {
        int i=0;
        pIndex = N-1;

        for(int n:in){
            mp.put(n,i++);
        }
        return createTree(in,post,0,N-1);
    }
}
