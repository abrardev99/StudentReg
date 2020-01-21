/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentreg;

public class Instructor extends Person {
    private String qualification;

    public Instructor(int id, String name, String address, String phone , String qualification) {
        super(id, name, address, phone);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }
    
    
    
}
