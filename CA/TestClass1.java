package CA;

import javax.swing.*;
import java.util.Arrays;

public class TestClass1 {
    public static void main(String[] args) {
        Class1 class1 = new Class1(1, "Nama", 3.7);
        Class1 class2 = new Class1(2, "Nama", 3.6);
        System.out.println(class1);
//        for (int i = 0; i < 5 ; i++) {
//            class1.populateArr();
//            System.out.println(Arrays.toString(class1.getArr()));
//        }
        class1.populateArr();
        class2.populateArr();
        System.out.println(Arrays.toString(class1.getArr()));
        System.out.println(Arrays.toString(class2.getArr()));
        System.out.println("Sorted Class1 Arr");
        System.out.println(Arrays.toString(class1.selectionSort()));

        boolean searchRes = class1.binarySearch(Integer.parseInt(JOptionPane.showInputDialog("Insert query of type (int): ")));
        System.out.println(searchRes);
        System.exit(0);
    }
}
