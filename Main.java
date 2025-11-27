import java.util.Arrays;
//O(1)
// public class Main{
//     public static void main(String[] args){
//         int[] arr = {12,1,2,3,4,5};
//         System.out.println(getFirstElement(arr));
//     }
//     public static int getFirstElement(int[] arr){
//         return arr[0];
//     }
// }

//O(log n)
// public class Main{
//     public static void main(String[] args){
//         int[] arr = {12, 34, 56, 76, 89, 23, 46, 74};
//         int traget = 76;
//         Arrays.sort(arr);
//         System.out.println(Arrays.toString(arr));
//         System.out.println(binarySearch( arr, traget));
//     }
//     public static int binarySearch(int[] arr, int traget){
//         int left = 0;
//         int right = arr.length -1;
//         while (left <= right){
//             int mid =(left + right) / 2;
//             if(arr[mid]==traget){
//                 return mid;
//             }
//             else if(arr[mid] < traget){
//                 left = mid + 1;
//             }
//             else{
//                 right = mid - 1;
//             }
//         }
//         return -1;
//     }
// }

//O(n)
// public class Main{
//     public static void main(String[] args){
//         int[] arr = {12,67,98,0,23,56};
//         int target = 23;
//         System.out.println(linearSearch(arr,target));
//     }
//     public static int linearSearch(int[] arr,int target){
//         for(int i = 0; i<arr.length; i++){
//             if(arr[i] == target){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }

//array
// public class Main{
//     public static void main(String[] args){
//         int[] myArray = {7, 12, 9, 4, 11};
//         int minVal = myArray[0];
//         for(int i=1; i < myArray.length; i++ ){
//             if(myArray[i]<minVal){
//                 minVal = myArray[i];
//             }
//         }
//         System.out.println("Lowest value: " + minVal);
//     }
// }
