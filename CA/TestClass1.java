package CA;

import java.util.Arrays;

public class TestClass1 {
    public static void main(String[] args) {
        Class1 class1 = new Class1(1, "Nama", 3.7, 5);
//        Class1 class2 = new Class1(2, "Nama", 3.6, 6);
        System.out.println(class1);

//        class1.populateArr();
//        class2.populateArr();
//        System.out.println(Arrays.toString(class1.getArr()));
//        System.out.println(Arrays.toString(class2.getArr()));
//        System.out.println("Sorted Class1 Arr");
//        System.out.println(Arrays.toString(class1.selectionSort()));

//        boolean searchRes = class1.binarySearch(Integer.parseInt(JOptionPane.showInputDialog("Insert query of type (int): ")));
//        System.out.println(searchRes);

        System.out.println("\nAdding 3 Composition objects via addCompositions() method: \n");
        class1.addCompositions(new Composition(5));
        class1.addCompositions(new Composition(90));
        class1.addCompositions(new Composition(99));

        System.out.println(class1);

        Composition[] ptr = class1.getCompositions();
        ptr[0].setSize(10);

        System.out.println(class1);
//        System.out.println(comp1);
//        System.out.println(comp2);

        System.exit(0);
    }
}
