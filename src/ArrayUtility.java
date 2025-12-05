public class ArrayUtility {

    public static void print(int[] array) {
        String output = "";
        for (int i: array){
            output += i;
            output += ", ";
        }
        System.out.println(output);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return (sum);
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        double a = (double)sum/array.length;
        a*= 100;
        a = (int) a;
        return (double)a / 100;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for (int i: array){
            if (i<min){
                min = i;
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int i: array){
            if (i>max){
                max = i;
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int counter = 0;
        for (int i: array){
            if (i%2==0){
                counter +=1;
            }
        }
        return counter;
    }

    public static int[] reverseOne(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i=0; i<array.length;i++){
            reversedArray[i]= array[array.length-1-i];
        }
        return reversedArray;
    }

    public static void reverseTwo(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i=0; i<array.length;i++){
            reversedArray[i]= array[array.length-1-i];
        }
        for (int i=0; i<array.length;i++){
            array[i]= reversedArray[i];
        }

    }

    public static boolean linearSearchInt(int[] array, int num) {
        boolean answer = false;
        for (int i:array){
            if (i==num){
                answer = true;
            }
        }
        return answer;
    }

    public static boolean linearSearchString(String[] array, String str) {
        boolean answer = false;
        for (String i:array){
            if (i.equals(str)){
                answer = true;
            }
        }
        return answer;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i=0; i<array.length;i++){
            array[i]*=2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i=0; i<array.length;i++){
            array[i]*=n;
        }
    }

    public static String toString(int[] array) {
        String str = "";
        for (int i=0; i<array.length;i++){
            str+=array[i];
            if (i<array.length-1) {
                str += ", ";
            }
        }
        return str;
    }

    public static boolean twoSum(int[] array, int num) {
        boolean answer = false;
        for (int i: array){
            for (int j:array){
                if (i!=j){
                    if (i+j==num){
                        answer = true;
                    }
                }
            }
        }
        return answer;
    }

    public static void shiftRight(int[] array) {
        int last =array[array.length-1];
        for (int i=array.length-1; i>0;i--){
            array[i] = array[i-1];
        }
        array[0] = last;
    }

    public static void shiftLeft(int[] array) {
        int first =array[0];
        for (int i=0; i<array.length-1;i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = first;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        n = n%array.length;
        if (n==0) return;
        int[] newArray = new int[n];
        for (int i=0;i<n;i++){
            newArray[i]=array[array.length-n+i];
        }
        for (int i = array.length-1; i>n-1;i--){
            array[i] = array[i-n];
        }
        for (int i = 0;i<n;i++){
            array[i] = newArray[i];
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        n = n%array.length;
        if (n==0) return;
        int[] newArray = new int[n];
        for (int i=0;i<n;i++){
            newArray[i]=array[i];
        }
        for (int i = 0; i<array.length-1-n;i++){
            array[i] = array[i+n];
        }
        System.arraycopy(newArray, 0, array, array.length-n, n);
    }


}