// Scenario #1:
class Scenario2{
    public static void main(String[] args){
        String s1 = new String("ABC");//heap
        String s2 = s1;
        if(s1==s2)
        {
        System.out.println("s1 s2 are ==");
        }
        else
        {
        System.out.println("s1 s2 are not ==");
        }

        //With equals() method
        // String s1 = new String("ABC");
        // String s2 = s1;
        // if(s1.equals(s2))
        // {
        // System.out.println("s1 s2 are equal");
        // }
        // else
        // {
        // System.out.println("s1 s2 are not equal");
        // }
    }
}
