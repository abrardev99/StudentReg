/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentreg;

public class Student extends Person{
    private String RegNo;
    
    public Student(int id, String name, String address, String phone , String RegNo) {
        super(id, name, address, phone);
        this.RegNo = RegNo;
    }

    public String getRegNo() {
        return RegNo;
    }
    
    
    
}
