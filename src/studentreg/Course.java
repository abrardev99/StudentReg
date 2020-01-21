/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentreg;

public class Course {
    private int id;
    private String title;
    private int fee;

    public Course(int id, String title, int fee) {
        this.id = id;
        this.title = title;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getFee() {
        return fee;
    }
    
    
}
