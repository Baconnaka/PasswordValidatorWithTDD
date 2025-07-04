package lib;
import java.lang.*;


public class PasswordValidator {

    /**
     * ตรวจสอบความแข็งแรงของรหัสที่ผู้ใช้กรอกเข้ามา โดยดูจากความยาว
     * ตัวอกษร ตัวเลข และลักษณะพิเศษ
     * @param password in string form user. รหัสผ่านที่ต้องการตรวจสอบ
     * @return ระดับความแข็งแรงของรหัสผ่าน(INVALTD,WEAK,MEDIUM,STRONG)
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
     public static PasswordStrength validate(String password) { // function type ให้เป็น passwordStrength
    
        int minLength = 8; 
        if (password == null || password.length() < minLength) {
            return PasswordStrength.INVALID;
        }
        boolean isLetter = false;
        boolean isDigit = false;
        boolean isSpecail = false;
        
        for(char c : password.toCharArray()){
            if(Character.isLetter(c)) isLetter = true;
            else if (Character.isDigit(c)) isDigit = true; 
            else isSpecail = true;
        }
        //ถ้ามีตัวอักษร แต่ไม่มีตัวเลขและตัวอักษรพิเศษ
        if (isLetter && !isDigit && !isSpecail) {
            return PasswordStrength.WEAK;
        }
        //ถ้ามีตัวอักษรและตัวเลข แต่ไม่มีตัวอักษรพิเศษ
        else if (isLetter && isDigit && !isSpecail) {
            return PasswordStrength.MEDIUM;
        }
        //ถ้ามีตัวอักษร ตัวเลขและตัวอักษรพิเศษ
         else if (isLetter && isDigit && isSpecail) {
            return PasswordStrength.STRONG;
        }
       
        return PasswordStrength.WEAK;//TODO: การคืนค่านี้ถูกต้องหรือไม่
    }
}