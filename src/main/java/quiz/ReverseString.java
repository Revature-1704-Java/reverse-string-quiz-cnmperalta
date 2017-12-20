package quiz;

public class ReverseString {
    public String reverse(String input) {
        StringBuilder reversedInput = new StringBuilder(input.length());
        if(input.isEmpty()) return input;
        for(int  i = input.length()-1; i >=0; i--)
            reversedInput.append(input.charAt(i));
        return reversedInput.toString();
    }
}