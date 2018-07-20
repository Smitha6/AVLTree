import java.util.Random;
/**
 * Homework 6, Summer 2018
 *
 * Tests a AVL Tree with random numbers
 * @author A. Smith
 *
 */
public class HW6 {
    public static void main(String args[]){

        AvlTree<Integer> tree = new AvlTree<>();
        Random r = new Random();

        //checks exception is working
        try{
            tree.findMax();
        }
        catch(UnderflowException e){
            System.out.println(e);
        }



        //makes a bunch of random trees
        for (int j = 0; j < 100; j++){

            for (int i = 0; i < 20; i++){
                int ran = r.nextInt((100 - 1) + 1) + 1;
                tree.insert(ran);
            }
            tree.printTreeLevelOrder();
            tree.checkBalance();
            tree.makeEmpty();
        }










    }
}
