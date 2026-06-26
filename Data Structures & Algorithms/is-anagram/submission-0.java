class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        if(s.length()==t.length()){
        char []a=s.toCharArray();
        char []w=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(w);
        return Arrays.equals(a,w);}
        else return false;
    }
}
