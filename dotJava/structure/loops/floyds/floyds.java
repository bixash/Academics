// 28. Write a program to print the Floyd’s triangle as shown below
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11……..15
// .
// .
// 79………………91

package loops.floyds;
public class floyds {
    public static void main(String[] args) {
        
        int num = 91;
        int temp = 1;

        for (int i = 0; i <num; i++) {   
            
            for (int j = 0; j < i; j++) {
                System.out.print(" "+temp);
                temp++;

                if(temp > num)
                    System.exit(0);
            } 
            System.out.print("\n");
        }
    }
}


