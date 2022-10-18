package CA;

public class Class1 {
    private int num;
    private String name;
    private double floatN;
    private int[] arr;
    private Composition[] compositions;
    private int compositionSize;

    public Class1(int num, String name, double floatN, int compositionSize) {
        setNum(num);
        setName(name);
        setFloatN(floatN);
        setCompositionSize(compositionSize);
    }

    public Composition[] getCompositions() {
        if (compositions!=null) {
            Composition[] copyOfCompositions = new Composition[compositionSize];
            for (int i = 0; i < compositionSize; i++) {
                if (compositions[i]!=null) {
                    copyOfCompositions[i] = new Composition(compositions[i].getSize(),true);
                }else break;
            }
            return copyOfCompositions;
        }else return null;
    }

    public int getCompositionSize() {
        return compositionSize;
    }

    public void setCompositionSize(int compositionSize) {
        this.compositionSize = compositionSize;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Class1\n" +
                "num=" + num +
                ", name=" + name +
                ", floatN=" + floatN + "\n");
        if (getCompositions() != null) {
            for (int i = 0; i < compositionSize ; i++) {
                if (getCompositions()[i] != null) output.append(getCompositions()[i]).append("\n");
            }
        }
        return output.toString();
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

    public void addCompositions(Composition input){
        if (compositions == null){
            compositions = new Composition[compositionSize];
            compositions[0] = new Composition(input.getSize(),true);
        }else {
            for (int i = 0; i < compositionSize; i++) {
                if (compositions[i] == null) {
                    compositions[i] = new Composition(input.getSize(),true);
                    break;
                }
            }
        }
    }
}
