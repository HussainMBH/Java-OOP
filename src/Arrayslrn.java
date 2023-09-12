import java.util.Arrays;

public class Arrayslrn {
    public static void main(String[] args){
        int [] num = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        for(int i = 0; i<10; i++){
            System.out.println(num[i]);
        }
    }
}
