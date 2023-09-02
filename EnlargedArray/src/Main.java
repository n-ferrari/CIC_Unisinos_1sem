public class Main {
    public static void main(String[] args) {
        NodeInt nodeInt = new NodeInt(1);

        nodeInt.append(2);
        nodeInt.append(3);
        nodeInt.append(4);
        nodeInt.append(5);

        System.out.println("List: ");
        nodeInt.print();
        System.out.println("List size: " + nodeInt.size());
        int index = 10;
        System.out.println("List["+index+"] = "+nodeInt.at(index));
        int value  = 9;
        System.out.println("Number " + value +" exists in the list? " +nodeInt.has(value));

        index = 0;
        value = 9;
        System.out.println("Insert " + value +" in index " + index + ": " +nodeInt.insert(value, index));
        nodeInt.print();
    }
}