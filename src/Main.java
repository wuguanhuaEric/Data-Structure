import java.util.ArrayList;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        BST<Integer> bst = new BST<>();
        Random random = new Random();

        int n = 1000;

        for(int i = 0; i < n; i ++)
        {
            bst.add(random.nextInt(10000));
        }

        ArrayList<Integer> nums = new ArrayList<>();
        while(!bst.isEmpty())
        {
            nums.add(bst.removeMin());
        }

        System.out.println(nums);
        for(int i = 1; i < nums.size(); i ++)
            if(nums.get(i - 1) > nums.get(i))
                throw new IllegalArgumentException("Error");

        System.out.println("removeMin test completed");

        for(int i = 0; i < n; i ++)
        {
            bst.add(random.nextInt(10000));
        }

        nums = new ArrayList<>();
        while(!bst.isEmpty())
        {
            nums.add(bst.removeMax());
        }

        System.out.println(nums);
        for(int i = 1; i < nums.size(); i ++)
            if(nums.get(i - 1) < nums.get(i))
                throw new IllegalArgumentException("Error");

        System.out.println("removeMax test completed");

        /*int[] nums = {5, 3, 6, 8, 4, 2};
        for(int num: nums)
            bst.add(num);

        bst.levelOrder();*/
        /*bst.preOrder();
        System.out.println();

        bst.preOrderNR();*/

        /*bst.inOrder();
        System.out.println();

        bst.postOrder();
        System.out.println();*/

        //System.out.println(bst);

    }
}
