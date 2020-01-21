/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentreg;

public class TheoryCourse extends Course{
    private String quiz;
    public TheoryCourse(int id, String title, int fee , String quiz) {
        super(id, title, fee);
        this.quiz = quiz;
    }

    public String getQuiz() {
        return quiz;
    }
        
}
