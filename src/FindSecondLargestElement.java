import java.util.ArrayList;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        int FirstLargest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
        for (int eachNum :arr) {
            if ( eachNum> FirstLargest) {
                SecondLargest = FirstLargest;
                FirstLargest = eachNum;
            }else if(eachNum<FirstLargest && eachNum>SecondLargest){
                SecondLargest = eachNum;
            }
        }
        System.out.println("The SecondLargest value is "+ SecondLargest);
    }
}
