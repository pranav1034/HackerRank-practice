import java.util.LinkedList;
import java.util.Queue;


public class LevelOrderTraversal{
    public static void levelOrder(Node root) {
        if(root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0 ; i<size ; i++){
                Node front = q.poll();
                System.out.print(front.data + " ");

                if(front.left != null){
                    q.add(front.left);
                }

                if(front.right != null){
                    q.add(front.right);
                }
            }
        }
    }
}