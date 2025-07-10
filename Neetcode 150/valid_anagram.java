import java.util.Scanner;

class valid_anagram
{
    public static boolean isAnagram(String s,String t)
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        int counts[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            counts[s.charAt(i)-'a']++;
            counts[t.charAt(i)-'a']--;
        }
        for(int count:counts)
        {
            if(count!=0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        System.out.println(isAnagram(s, t));
        sc.close();
    }
}