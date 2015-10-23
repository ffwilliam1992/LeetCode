import java.util.ArrayDeque;
import java.util.Queue;

public class BSTIterator {
	private Queue Q;
	public BSTIterator(TreeNode root) {
        Q=new ArrayDeque<TreeNode>();
		inorder(root, Q);
    }
	private void inorder(TreeNode root,Queue q){
		if(root!=null){
			if(root.left!=null)
				inorder(root.left, q);
			q.add(root);
			if(root.right!=null)
				inorder(root.right, q);
		}
	}
	

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !Q.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode t=(TreeNode) Q.remove();
        return t.val;
    }

    
    
}

