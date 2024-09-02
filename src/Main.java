import java.util.*;


class Main {
    static boolean foundTheElement(int TargetElement, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == TargetElement) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int TargetElement=sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(foundTheElement(TargetElement, arr));

    }
}