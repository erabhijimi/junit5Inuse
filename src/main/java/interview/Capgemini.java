package interview;

import java.util.HashSet;
import java.util.Set;

public class Capgemini {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "pqamca";
        //char array
        //remove common elements in 2nd and print
        char[] chs1 =s1
                .toCharArray();
        char[] chs2 = s2.toCharArray();
        Set<Character> set1 = new HashSet<>();
        for(char ch:chs1){
            set1.add(ch);
        }
        Set<Character> set2 = new HashSet<>();
        for(char ch:chs2){
            set2.add(ch);
        }
        set1.stream().forEach(ch->{
            if(set2.contains(ch)){
                set2.remove(ch);
            }
        });
        set2.stream().forEach(System.out::print);
    }
}
