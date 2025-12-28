import javax.security.auth.login.CredentialNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Problem_228 {
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 2, 4, 5, 7};
        int[] nums2 = {0, 2, 3, 4, 6, 8, 9};


        Solution_228 obj = new Solution_228();
        System.out.println(obj.summaryRanges(nums1));
        System.out.println(obj.summaryRanges(nums2));
    }
}

//class Solution_228 {
//    public List<String> summaryRanges(int[] nums) {
//        List<String> li = new ArrayList<>();
//
//        if (nums.length == 1) {
//            li.add("" + nums[0]);
//            return li;
//        }
//
//        int first = nums[0], last = 0;
//        for(int i=0, j=1; j<nums.length; i++, j++) {
//            if(nums[i] - nums[j] != -1) {
//                last = nums[i];
//                if (first == last) li.add("" + first);
//                else li.add(first + "->" + last);
//                first = nums[j];
//            }
//        }
//        if(first == nums[nums.length - 1]) li.add("" + first);
//        else li.add(first + "->" + nums[nums.length - 1]);
//
//        return li;
//    }
//}

class Solution_228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> li = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            StringBuilder nstr = new StringBuilder();
            int start = nums[i];
            while (i<nums.length-1 && nums[i] + 1 == nums[i+1]) i++;
            int end = nums[i];
            if (start == end) nstr.append(start);
            else {
                nstr.append(start);
                nstr.append("->");
                nstr.append(end);
            }
            li.add(new String(nstr));
        }

        return li;
    }
}
