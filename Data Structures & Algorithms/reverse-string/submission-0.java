class Solution {
    public void reverseString(char[] s) {
        int l=0,r=s.length-1;
        while(l<=r){
            char d=s[l];
            s[l]=s[r];
            s[r]=d;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(s));

    }
}