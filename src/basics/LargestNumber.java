package basics;

public class LargestNumber {
    public static void main(String[] args) {
        int[] num = {26,63,67,42,79,88,24};
        int max = num[0];
        for(int i = 1;i<=num.length -1;i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        System.out.println("Largest Number is: " +max);
    }
}
