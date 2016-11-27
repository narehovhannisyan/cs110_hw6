package utils;


public class math {
    public static long factorial(int num){
        if(num == 0){
            return 1;
        }
        return num*math.factorial(num-1);
    }
    public static long factorialLoop(int num) {
        long sum = 1;
        while (num > 0) {
            sum *= num;
            --num;
        }
        return sum;
    }
}