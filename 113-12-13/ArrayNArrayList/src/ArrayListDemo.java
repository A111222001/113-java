import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("ArrayList內容: " + list);

        list.set(1, "Blueberry");
        System.out.println("更新後的ArrayList: " + list);

        list.remove(0);
        System.out.println("刪除後的ArrayList: " + list);

        String fruit = list.get(1);
        System.out.println("第二個水果是: " + fruit);

        int size = list.size();
        System.out.println("ArrayList大小: " + size);

        boolean hasBanana = list.contains("Cherry");
        System.out.println("ArrayList是否包含'Cherry': " + hasBanana);

        if (list.isEmpty()) {
            System.out.println("使用迴圈訪問元素");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        } else {
            System.out.println("ArrayList是空的");
        }
    }
}
