/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentreg;

public class LabCourse extends Course{
    private String practical;
    
    public LabCourse(int id, String title, int fee , String practical) {
        super(id, title, fee);
        this.practical = practical;
    }

    public String getPractical() {
        return practical;
    }
    
    
    
}
