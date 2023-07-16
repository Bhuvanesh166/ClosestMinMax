import java.util.Scanner;

public class ClosestMinMax {
    public int closestMinMaxlength(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int latestmin=-1;
        int latestmax=-1;
        int result=Integer.MAX_VALUE;
        for (int i=0; i<arr.length;i++){
            if(arr[i]==min){
                latestmin=i;
                if (latestmax >= 0) {
                    result = Math.min(result, i - latestmax + 1);
                }
            }if(arr[i]==max){
                latestmax=i;
                if (latestmin >= 0) {
                    result = Math.min(result, i - latestmin + 1);
                }
            }

        }
        return result;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sze=scanner.nextInt();
        int[] arr =new int[sze];
        for(int i=0;i<sze;i++){
            arr[i]=scanner.nextInt();

        }
        ClosestMinMax find=new ClosestMinMax();
        System.out.println(find.closestMinMaxlength(arr));


    }
}