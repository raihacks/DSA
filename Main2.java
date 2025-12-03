//    public class Main{
//        public static void main(String[] args){
//            int[] num={1, 2, 3};
//            int sum = 0;
//            for(int i = 0; i <num.length; i++){
//                sum += num[i];
//                  System.out.println(sum);
//            }
//            System.out.println(sum);
//        }
//    }

//    public class Main{
//        public static boolean isSorted(int[] num){
//            for (int i = 1; i < num.length; i++){
//                if (num[i] < num[i - 1]){
//                    return false;
//                }
//            }
//            return true;
//        }
//        public static void main(String[] args){
//            int[] b = {1, 2, 3, 5};
//            int[] a = {1, 3, 2};
//            System.out.println(isSorted(a));
//            System.out.println(isSorted(b));
//        }
//    }

//    public class Main{
//        public static void moveZeroes(int[] nums){
//            int insertPos = 0;
//            for (int num : nums){
//                if (num != 0){
//                    nums[insertPos++] = num;
//                }
//            }
//            while (insertPos < nums.length){
//                nums[insertPos++] = 0;
//            }
//        }
//        public static void main(String[] args){
//            int[] arr = {0, 1, 0, 3, 12};
//            moveZeroes(arr);
//            for (int num : arr){
//                System.out.print(num + " ");
//            }
//        }
//    }

// public class Solution {
//     public int removeDuplicates(int[] nums) {
//         if (nums.length == 0) {
//             return 0;
//         }
//         int uniquePosition = 1;
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] != nums[i - 1]) {
//                 nums[uniquePosition] = nums[i];
//                 uniquePosition++;
//             }
//         }
//         return uniquePosition;
//     }
//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         int[] nums = {1, 1, 2, 2, 3, 3, 4};
//         int length = solution.removeDuplicates(nums);
//         System.out.println("Number of unique elements: " + length);
//         System.out.print("Updated Array: ");
//         for (int i = 0; i < length; i++) {
//             System.out.print(nums[i] + " ");
//         }
//     }
// }