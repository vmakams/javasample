package org.example;

public class Teacher {

    private Principal principal;

    public Teacher(){
        this.principal = new Principal();
    }

    public void examPaper(){
        this.principal.examPaper();
    }
}
