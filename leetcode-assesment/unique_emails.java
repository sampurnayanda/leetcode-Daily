class Solution {
    public int numUniqueEmails(String[] emails) {
       Set<String> un=new HashSet<>();
       for(String e:emails)
       {
           String p[]=e.split("@");
           String local=p[0];
           String domain=p[1];
           if(local.contains("+"))
           {
               local=local.substring(0,local.indexOf("+"));
           }
           local=local.replace(".","");
           String clean=local+"@"+domain;
           un.add(clean);
           
       }
        return un.size();
    }
}