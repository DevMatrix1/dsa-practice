// link- https://leetcode.com/problems/minimize-deviation-in-array/

class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a, b) -> Integer.compare(b, a));

        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num % 2 == 1) {
                num *= 2;
            }

            maxHeap.offer(num);
            min = Math.min(num, min);
        }

        int diff = maxHeap.peek() - min;

        while (maxHeap.peek() % 2 == 0) {
            int top = maxHeap.poll();
            diff = Math.min(diff, top - min);
            top /= 2;
            min = Math.min(min, top);
            maxHeap.offer(top);
        }
        

        return Math.min(diff, maxHeap.peek() - min);
    }
}

// 2nd treeset approach

class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int x : nums)
            if (x%2 == 0)
                set.add(x);
            else
                set.add(x*2);
        int ans = Integer.MAX_VALUE;
        while (true) {
            int val = set.last();
            ans = Math.min(ans, val - set.first());
            if (val%2 == 0) {
                set.remove(val);
                set.add(val/2);
            } else
                break;
        }
        return ans;
    }
}
