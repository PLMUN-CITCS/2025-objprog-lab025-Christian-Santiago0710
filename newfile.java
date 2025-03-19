public class Item {
    private static int count = 0;
    String name;

    public Item(String name) {
        this.name = name;
        count++;
    }

    public static void main(String[] args) {
        Item laptop = new Item("Laptop");
        Item smartphone = new Item("Smartphone");
        Item tablet = new Item("Tablet");

        System.out.println("Item: " + laptop.name);
        System.out.println("Item: " + smartphone.name);
        System.out.println("Item: " + tablet.name);
        System.out.println("Total objects created: " + count);
    }
}
