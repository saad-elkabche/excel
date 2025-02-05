/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author SaaDev
 */
public class Validator {
    
    
    public static boolean isValidInterger(String str){
        boolean isValid=str.matches("^\\d+$");
        return isValid;
    }

    public static boolean isValidNumber(String str){
        boolean isValid=str.matches("^\\d+(.\\d+)?$");
        return isValid;
    }
    
    
}
