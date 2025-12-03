//    public class Main {
//        public static void main(String[] args) {
//            int[] myArray = {64, 34, 25, 12, 22, 11, 90, 5};
//            int n = myArray.length;
//            for (int i = 0; i < n - 1; i++) {
//                for (int j = 0; j < n - i - 1; j++) {
//                    if (myArray[j] > myArray[j + 1]) {
//                           swap
//                        int temp = myArray[j];
//                        myArray[j] = myArray[j + 1];
//                        myArray[j + 1] = temp;
//                    }
//                }
//            }
//            System.out.print("Sorted array: ");
//            for (int num : myArray) {
//                System.out.print(num + " ");
//            }
//        }
//    }

//    public class Main{
//        public static void main(String[] args){
//            int[] nums = {2,7,11,15};
//            int target = 18;
//            for (int i = 0; i < nums.length; i++){
//                for (int j = i+1 ; j < nums.length; j++){
//                    if(target == nums[i] + nums[j]){
//                        System.out.println("the indecis are " +i+ " and "+j);
//                    }
//                }    
//            }
//        }
//    }

//   largest element in a aarya
//    public class Main{
//        public static void main(String[] agrs){
//            int[] nums ={12,56,78,34,68,99};
//            int max = nums[0] ;
//            for(int i=1; i < nums.length; i++){
//                if(nums[i] > max){
//                    max = nums[i];
//                }
//            }
//            System.out.println(max);
//        }
//    }

//   smallest element
//    public class Main{
//        public static void main(String[] agrs){
//            int[] nums = {1234,246,34,67,98,45,49,53,18};
//            int min = nums[0];
//            for(int i = 1; i < nums.length; i++){
//                if(nums[i] < min){
//                    min = nums[i];
//                }
//            }
//            System.out.println(min);
//        }
//    }

//   2nd largest
//    public class Main{
//        public static void main(String[] agrs){
//            int[] nums = {12, 35, 1, 10, 34, 1};
//            int max = nums[0];
//            int secMax = nums[0];
//            for (int i = 1; i < nums.length; i++){
//                if(nums[i] > max){
//                    secMax = max;
//                    max = nums[i];
//                }
//                else if(nums[i] < max && nums[i] > secMax){
//                        secMax = nums[i];
//                    }
//            }
//            System.out.println(secMax);
//        }
//    }

//    reverse an array
//    public class Main{
//        public static void main(String[] args){
//            int[] nums = {12, 35, 1, 10, 34, 1};
//            for( int i = nums.length - 1; i >= 0; i--){
//                System.out.println(nums[i]);
//            }
//        }
//    }

//    count even and odd numbers
//    public class Main{
//        public static void main(String[] args){
//            int[] num = {1, 2, 4, 7};
//            int even=0;
//            int odd=0;
//            for(int i = 0; i <num.length; i++){
//                if(num[i] % 2 == 0){
//                    even++;
//                }
//                else{
//                    odd++;
//                }
//            }
//            System.out.println("even: "+even+ " odd: "+odd);
//        }
//    }