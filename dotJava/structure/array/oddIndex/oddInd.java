// 33. Write a program to add elements stored in odd indices in an array of integer.

package array.oddIndex;
public class oddInd {

    public static void main(String[]args) {

        int i, sum = 0;
        int a[]= {1,2,3,4,5,6,7,8,9,10};

        System.out.print("\nElements of Array: \n");

        for(i=0; i<a.length; i++) 
            System.out.print(a[i]+" ");
            
        System.out.print("\n");
        System.out.print("\nOdd indices elements are: \n");

        for(i=0; i<a.length; i++) {
            
            if(i%2 != 0){
                System.out.print(a[i]+" ");
                sum= sum + a[i];
            }
        }
        System.out.print("\n");
        System.out.println("\nSum: "+sum);
    }
    
}
