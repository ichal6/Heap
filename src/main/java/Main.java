public class Main {
    public static void main(String[] args) {
        Heap mainHeap = new Heap();

        mainHeap.add(15);
        mainHeap.add(17);
        mainHeap.add(20);
        mainHeap.add(10);

        mainHeap.poll();

        System.out.println(mainHeap.peek());

        mainHeap.add(8);

        System.out.println(mainHeap.peek());
    }
}
