
package optionaltask4;
import java.util.Scanner;
import java.util.Random;
public class OptionalTask4 {
    public static void output  (int arr[][]){
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr.length; j++) {
                 System.out.print(arr[i][j]+"\t");
             } 
             System.out.println(" ");
         }
    }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         Random r=new Random();
         System.out.print("Enter length of array: ");
         int n=sc.nextInt();
         int arr[][]=new int [n][n];
          for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr.length; j++) {
               arr[i][j]=r.nextInt(-6)-6;
             } 
         }
       output(arr);
         System.out.println("\n");
/*OprionalTask 4.1
     Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов 
     k-го столбца (строки).
     */
         System.out.println("First task");
        System.out.print("Enter column number k: ");
         int k=sc.nextInt();
         for (int i = 0; i < arr.length-1; i++) {
             for (int j = i+1; j < arr.length; j++) {
                 if(arr[i][k]>arr[j][k]){
                     for (int l = 0; l < arr.length; l++) {
                         int x=arr[j][l];
                         arr[j][l]=arr[i][l];
                         arr[i][l]=x;
                     }
                 }
             }
             
         }
         System.out.println("New array");
         output(arr);
         System.out.println("\n");
/*OptionalTask 4.2
      Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
    */
         System.out.println("Second task");
        int z=0, t=0,max=0,index=0;
        int arr1 []=new int [n*n];
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr.length; j++) {
                 arr1[index++]=arr[i][j];     
             }
         }
         for (int i = 0; i < arr1.length-1; i++) {
                 if(arr1[i]<arr1[i+1]){
                  z++; 
                 }else{
                     t=z;
                     z=0;
                 }
                 if(t>max){
                     index=i-t;
                     max=t;
                 }
         }
         max=max+1;
         System.out.println("Largest number of increasing: "+ max);
         while(max!=0) {
         System.out.print(arr1[index++]+" "); 
         max--;
         }
         System.out.println("\n");
        
/*OptionalTask 4.3
          Найти сумму элементов матрицы, расположенных между
          первым и вторым положительными элементами каждой строки
    */
         System.out.println("Third task");
         for (int i = 0; i < arr.length; i++) {
              int f=0,summ=0;
              for (int j = 0; j < arr.length; j++) {
                 if (arr[i][j]>0 && f==0) {
                     int c=j+1;
                     f++;
                     if(arr[i][c]<0){
                      while(c<arr.length){
                          if(arr[i][c]<0){
                             summ=summ+arr[i][c];
                          }c++;
                      }
                     }else{
                         summ=0;
                     }
                 }
             }
                  System.out.println("summ: "+summ);  
         }
 
     }
}
