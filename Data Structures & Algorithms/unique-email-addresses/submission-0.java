class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set=new LinkedHashSet<>();
        for(String s:emails){
            String ar[]=s.split("@");
            String s1=ar[0];
            String s2=ar[1];
            s1=s1.split("\\+")[0];
            s1=s1.replace(".","");
            set.add(s1+"@"+s2);
        }
        return set.size();
    }
}