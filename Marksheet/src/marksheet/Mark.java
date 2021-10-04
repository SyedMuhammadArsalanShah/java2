/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marksheet;

/**
 *
 * @author S M Arsalan Shah
 */
public class Mark extends NewAbstract {

    public String subjects(double english, double urdu, double Math, double Islamiyat) {

        double total;
        total = english + urdu + Math + Islamiyat;
        System.out.println(" Total Obtained Marks out of 400 = " + total);

        double per = (total / 400) * 100;
        System.out.println("Percentage is = " + per);
        String grade;
        if (per >= 80 && per <= 100) {
            grade = "A+";
        } else if (per >= 70 && per <= 79) {
            grade = "A";
        } else if (per >= 60 && per <= 69) {
            grade = "B";
        } else if (per >= 50 && per <= 59) {
            grade = "C";
        } else if (per >= 40 && per <= 49) {
            grade = "D";
        } else {
            grade = "fail";
        }
 
        return grade;
    }

    double subjects(String eng, String urdu, String lamiyat, String math) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
