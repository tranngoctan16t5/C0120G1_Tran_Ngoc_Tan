package on_tap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //phan 1 interface List
        //khai bao mang su dung arrayList
        ArrayList<String> list = new ArrayList<>();
        //them phan tu
        list.add("A1");
        list.add("A2");
        list.add("A3");

        list.add(2, "AB");
        list.set(2, "ABC");
        //xoa phan tu trong mang
//        list.remove(0);
        //swap phan tu
        String tmp = list.get(2);
        list.set(2, list.get(3));
        list.set(3, tmp);
        //duyet qua cac phan tu mang
        //cach 1
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //cach 2
//        for(String item:list){
//            System.out.println(item);
//        }
//        //cach 3
//        Iterator<String> iterator=list.iterator();
//        while (iterator.hasNext()){  //phan tu nay co kha nang tim kiem phan tu tiep theo khong
//            String item=iterator.next();
//            System.out.println(item);
//        }
//        //cach 4
//        list.forEach((item)->{
//            System.out.println(item);
//        });
        //khai bao vector
//        Vector<String>list2=new Vector<>();
        //khai bao linklist
//        LinkedList<String>list3=new LinkedList<>();
        //sets
        HashMap<String, String> map = new HashMap<>();
        map.put("fullname", "Tran van diep");
        map.put("age", "max");
        System.out.println(map.get("fullname"));
        //cach duyet phan tu trong hashmap
        Set<String> keys = map.keySet();
        keys.forEach((key) -> {
            System.out.println("key:" + key + ":" + map.get(key));
        });
        //Queus
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.offer("A1");
        queue.offer("A2");
        queue.offer("A3");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }


}
