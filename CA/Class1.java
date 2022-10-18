package CA;

public class Class1 {
    private int num;
    private String name;
    private double floatN;
    private int[] arr;

    public Class1(int num, String name, double floatN) {
        this.num = num;
        this.name = name;
        this.floatN = floatN;
    }

    @Override
    public String toString() {
        return "Class1{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", floatN=" + floatN +
                '}';
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFloatN() {
        return floatN;
    }

    public void setFloatN(double floatN) {
        this.floatN = floatN;
    }

    public void populateArr(){
        arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int)Math.floor(Math.random()*(50-10)+10);
        }
    }

    public int[] getArr() {
        return arr;
    }

    public int[] selectionSort() {
        for (int i = 0; i < arr.length-1; i++) {
            int m = i;
            int temp;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[m]) m = j;
            }
            temp = arr[i];
            arr[i] = arr[m];
            arr[m] = temp;
        }
        return arr;
    }


    public boolean binarySearch(int To_Find)
    {
        int lo = 0, hi = arr.length - 1;
        // This below check covers all cases , so need to check
        // for mid=lo-(hi-lo)/2
        while (hi - lo > 1) {
            int mid = (hi + lo) / 2;
            if (arr[mid] < To_Find) {
                lo = mid + 1;
            }
            else {
                hi = mid;
            }
        }
        if (arr[lo] == To_Find) {
            return true;
        }
        else if (arr[hi] == To_Find) {
            return true;
        }
        else {
            return false;
        }
    }
}
