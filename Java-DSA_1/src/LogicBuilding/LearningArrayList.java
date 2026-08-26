package Arrays.LogicBuilding;

import java.util.ArrayList;

public class LearningArrayList {

    static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(0,2);
        list.add(1,3);
        list.add(2,4);
        list.add(3,5);
        list.add(4,6);
        System.out.println(list);
         int result[]=new int[5];
        for(int i=0; i<result.length; i++){
            result[i]=list.get(i);
        };


    }
}
