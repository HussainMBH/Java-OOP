import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int[] a = {10,20,30};
        int[] b = {40,50,60};
        int len = a.length + b.length;
        int d[] = new int[3];

        int[] c= new int[5];

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
        System.out.println("arranging two arrays in single array");
        for(int i = 0; i<c.length; i++){
            System.out.print(c[i] + " ");
        }


        //arrays Multiplication
        /*
        want to think like this
        a[0] *b[0] = c[0]
        a[1] * b[1] = c[1]
        a[2] * b[2] = c[2]
         */
        for(int i =0; i<d.length; i++){
            d[i] = a[i] * b[i];
        }
        System.out.println();
        System.out.println("Multiplication");

        for(int i = 0; i<d.length; i++){
            System.out.print(d[i] + " ");
        }

    }
}