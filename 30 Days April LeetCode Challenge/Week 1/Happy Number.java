class Solution {
    public int sum(int x) {
        int num = 0;
        while(x != 0) {
            num += (x % 10)*(x % 10);
            x /= 10;
        }
        return num;
    }
    
    public boolean isHappy(int n) {
        if(n == 1) {
            return true;
        }
        
        Set<Integer> set = new HashSet<Integer>();
        while(n != 1) {
            int p = sum(n);
            if(p == 1) {
                return true;
            } else if(set.contains(p)) {
                return false;
            }
            set.add(p);
            n = p;
        }
        return false;
    }
}