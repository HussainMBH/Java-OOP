import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int[] a = {10,20,30};
        int[] b = {40,50};
        int len = a.length + b.length;

        int[] c= new int[len];

        //int[] c={10,20,30,40,50};

        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }

        System.out.println();

        for(int i = 0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println();
        //Copying array
        int j = 0;
        for(int i = 0; i<a.length; i++){
            c[i] = a[i];
        }
        for(int i = a.length; i<c.length; i++){
            /* in here a.length is number 3 but in b of array have no third index,
             so should start from zero so want to assign new integer than assign in b of array
             that integer than can do with copying array. in here mainly use concatenation
             */
            c[i] = b[j];
            j++;
        }

        for(int i = 0; i<c.length; i++){
            System.out.print(c[i] + " ");
        }

    }
}