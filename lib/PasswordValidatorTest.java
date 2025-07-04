package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "123";
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 : "+pw+" :Passed Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 : "+pw+" :FAILED Expected INVALID but got " + result1);
        }
        //Test Case 2: รหัสผ่านเป็นตัวอักษรพิมพ์เล็กเพียงอย่างเดียวควรจะ "WEAK"
        pw = "password";
        PasswordStrength result2 = PasswordValidator.validate("password");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 : "+pw+" :Passed 8 Digits or more ");
        } else {
            System.out.println("Test Case 2 : "+pw+" :FAILED Expected WEAK but got " + result2);
        }
        //Test Case 3: รหัสผ่านเป็นตัวอักษรพิมพ์เล็กและตัวเลขควรจะ MEDIUM
        pw = "abcd12345";
        PasswordStrength result3 = PasswordValidator.validate("abcd12345");
        
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 :  "+pw+" :Passed Contain 8 Digits or more with Uppercase");
        } else {
            System.out.println("Test Case 3 :  "+pw+":FAILED Expected MEDIUM but got " + result3);
        }
        //Test Case 4: รหัสผ่านเป็นตัวอักษรผสมกับตัวเลขและตัวอักษรพิเศษควรจะ STRONG
        pw = "abcdefg12345!@#";
        PasswordStrength result4 = PasswordValidator.validate("abcdefg12345!@#");
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 : "+pw+" : Passed Contain 8 Digits or more with Lowercase");
        } else {
            System.out.println("Test Case 4  : "+pw+" :FAILED Expected STRONG but got " + result4);
        }
        // ---g-upo Test Case vnjoq9jv ---
        System.out.println("------------------------------");
        
    }
}
