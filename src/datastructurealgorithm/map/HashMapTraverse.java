package datastructurealgorithm.map;
import java.util.HashMap;
import java.util.Map;

public class HashMapTraverse {

    //key points
    //
    //For operation like add,remove,containsKey,time complexity is 0(log n where n is the numbeer of elements present in treeMap
    //TreeMap always keeps the elementsin  a sorted

    public static void main(String[] args){

int[] number={34,56,77,89,57,56,30,21,34,89,56};





    }
static void printFrequency(int arr[]) {
        //Wrapper class: Holding all the primitive type of data

    //empty hashMap
    HashMap<Integer,Integer> hashMap=new HashMap<>();

    for (int i=0; i<arr.length;i++) {


        Integer c=hashMap.get(arr[i]);

        if (hashMap.get(arr[i]) == null) {
          hashMap.put(arr[i], 1);

        }
        else{
            hashMap.put(arr[i],++c);
        }
    }
    for (Map.Entry mp:hashMap.entrySet()) {
        System.out.println("Frequency of " +mp.getKey()+" : " +mp.getValue());
    }
}


}
