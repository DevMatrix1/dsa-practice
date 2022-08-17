// link- https://devsnest.in/algo-challenges/task-scheduler?tab=question

// help-link-: https://leetcode.com/problems/task-scheduler/discuss/104500/Java-O(n)-time-O(1)-space-1-pass-no-sorting-solution-with-detailed-explanation

static int solve(int n, String[] tasks, int k){
    int[] counter = new int[26];
        int max = 0;
        int maxCount = 0;
        for(String task : tasks) {
            char ch=task.charAt(0);
            counter[ch - 'A']++;
            if(max == counter[ch - 'A']) {
                maxCount++;
            }
            else if(max < counter[ch - 'A']) {
                max = counter[ch - 'A'];
                maxCount = 1;
            }
        }
        
        int partCount = max - 1;
        int partLength = k - (maxCount - 1);
        int emptySlots = partCount * partLength;
        int availableTasks = tasks.length - max * maxCount;
        int idles = Math.max(0, emptySlots - availableTasks);
        
        return tasks.length + idles;
}