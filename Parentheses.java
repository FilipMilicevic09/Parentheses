//"() [] {}" valid
//"([])" valid
// "([)]" not valid
// 1) find the last ([{
// 2) Check the item to the right
// 3) Remove both and go again
// 4) Keep going until string empty or determined invalid


//  Class author:  Filip Milicevic
//  Date created:  11/12/2025
//  General description: This prgram will check if a string of brackets/parentheses/braces is valid by going through loops


public class Parentheses {
    // pre-condition: The characters in the string only contain the characters "(,),{,},[,]" 
    //post-condtion: Returns true if the brackets are properly matched & in the correct order but will return false otherwise
   
    public static boolean isValid(String characters) {
        boolean isChanged;

        do{
            isChanged = false;

            for(int i = 0; i < characters.length() - 1; i++){
                char current = characters.charAt(i);
                char next = characters.charAt(i + 1);
                if ((current == '(' && next == ')' ) || (current == '[' && next == ']') || (current == '{' && next == '}' )) {
                    String before = characters.substring (0,i);
                    String after = characters.substring(i+2);
                    characters = before + after;
                    isChanged= true;
                    break; //starts everthing agian in loop
                }
            }
        
        } while (isChanged);
        return characters.length() == 0;

    }
//pre-condition: N/A
//post-condition: runs multiple cases and prints true or false whether they are valid or not 
    public static void main(String[]args) {
        System.out.println(isValid("(){}[]")); //true
        System.out.println(isValid("(]")); //false
        System.out.println(isValid("([{({})}])")); //true
        System.out.println(isValid("(([]){})")); //true
        System.out.println(isValid("{}[())()(]")); //false
        System.out.println(isValid("(){}{")); //false

        System.out.println(isValid("([)]")); //false
        System.out.println(isValid("([{}([)])]")); //false
    }

}