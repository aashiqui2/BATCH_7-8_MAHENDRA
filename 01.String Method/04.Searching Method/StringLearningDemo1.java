public class StringLearningDemo1 {
    public static void main(String[] args) {
        String s1=new String("Programming World");

        //! Will return the character
        // System.out.println(s1.charAt(2));

        //? if the index is morre than or negative index will return indexOut of Bound
        // System.out.println(s1.charAt(-1));
        // System.out.println(s1.charAt(200));

        //? This will return the a part of a string from string Class
        System.out.println(s1.substring(0,5));
        // error
        System.out.println(s1.substring(20,-2));

        //? Return a  `char` Sequence , this method is from interface
        System.out.println(s1.subSequence(0,10));
    }
}