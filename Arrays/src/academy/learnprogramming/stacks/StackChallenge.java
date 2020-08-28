package academy.learnprogramming.stacks;

import java.util.LinkedList;

public class StackChallenge {

    public static void main(String[] args) {

        System.out.println(checkForPalindrome("madam"));

        System.out.println(checkForPalindrome("I did, did I?"));
    }


    public static boolean checkForPalindrome(String string){

        LinkedList<Character> stack = new LinkedList<>();

        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();
        for(int i=0;i<lowerCase.length();i++){
            char c = lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z'){
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedString = new StringBuilder(stack.size());
        while(!stack.isEmpty()){
            reversedString.append(stack.pop());
        }
        return reversedString.toString().equals(stringNoPunctuation.toString());
    }
}
