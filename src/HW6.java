import java.util.Random;

public class HW6 {
    public static void main(String args[]){

        AvlTree<Integer> tree = new AvlTree<>();
        Random r = new Random();

        for (int j = 0; j < 100; j++){

            for (int i = 0; i < 100; i++){

                int ran = r.nextInt((100 - 1) + 1) + 1;
                tree.insert(ran);
            }
            tree.printTreeLevelOrder();
            tree.makeEmpty();
        }





    }
}
