public class ExMyListEX {
    public static void main(String[] args) {
        ExMyList<Integer> myList = new ExMyList<>();
        myList.addElement(0,1);
        System.out.println(myList.get(0));
    }
}