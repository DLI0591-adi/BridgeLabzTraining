package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Programs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter 5 elements :");
        for (int i = 0; i < 5; i++) {
            a[i] = in.nextInt();
        }
        display(a);
        sum(a);
        maximum(a);
        reverse(a);
        even(a);
        seperate(a);
        countFreq(a,a.length);
        duplicate(a);
        addition();
    }
    static void display(int[] a) {
        System.out.println("_____________________________");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]+" ");
        }

    }

    static void sum(int[] a) {
        int sum = 0, avg;
        for (int i = 0; i < 5; i++) {
            sum = sum + a[i];
        }
        avg = sum / 5;
        System.out.println("\nSum of array :" + sum);
        System.out.println("Average of array :" + avg);
    }

    static void maximum(int[] a)
    {
        int max=0,min=a[0];
        for (int i = 0; i < 5; i++) {
            if(max<a[i])
                max=a[i];
            if(min>a[i])
                min=a[i];
        }
        System.out.println("Maximum :"+max);
        System.out.println("Minimum :"+min);
    }
    static void reverse(int[] arr)
    {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
    static void even(int[] a)
    {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : a) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even count: " + evenCount + ", Odd count: " + oddCount);
    }

    static void seperate(int[] a) {
        int i = 0, pos_count = 0, neg_count = 0;
        int[] pos_Arr = new int[5];
        int[] neg_Arr = new int[5];

        while(i < a.length)
        {
            if(a[i] >= 0) {
                pos_Arr[pos_count] = a[i];
                pos_count++;
            }
            else {
                neg_Arr[neg_count] = a[i];
                neg_count++;
            }
            i++;
        }
        System.out.print("The List of Items in Positive Array = ");
        for(i = 0; i < pos_count; i++)
        {
            System.out.format("%d ", pos_Arr[i]);
        }
        System.out.println();
        System.out.print("The List of Items in Negative Array = ");
        for(i = 0; i < neg_count; i++)
        {
            System.out.format("%d ", neg_Arr[i]);
        }
        System.out.println();
    }

    public static void countFreq(int[] arr, int n)
    {
        boolean[] visited = new boolean[n];

        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++)
        {
            if (visited[i])
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++)
            {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println("Frequency:-");
            System.out.println(arr[i] + " " + count);
        }
    }

    private static void duplicate(int[] arr) {
        System.out.println("Duplicate elements in the given array:");
        // Search for duplicate elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
        System.out.println("-------------------------");
    }
    private static void addition() {
        int[][] a ={{1,3,4},{2,4,3},{3,4,5}};
        int[][] b ={{1,3,4},{2,4,3},{1,2,4}};
        int[][] c =new int[3][3];
        System.out.println("Addition");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Multiplication");
        int[][] c1 =new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c1[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c1[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c1[i][j]+" ");
            }
            System.out.println();
        }
    }
}