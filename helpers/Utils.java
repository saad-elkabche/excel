/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author SaaDev
 */
public class Utils {
    
    private Component parent;

    public Utils() {
    }

    public Utils(Component parent) {
        this.parent = parent;
    }

    public void showError(String error,String title){
        JOptionPane.showMessageDialog(parent,error,title,JOptionPane.OK_OPTION);
    }
    
    public boolean showQuestion(String question,String title){
        int result=JOptionPane.showConfirmDialog(parent, question,title,JOptionPane.YES_NO_OPTION);
        return (result==JOptionPane.YES_OPTION);
    }
    
}
