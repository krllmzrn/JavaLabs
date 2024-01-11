package entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Subjects {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idsubject")
    private int idsubject;
    @Basic
    @Column(name = "subject")
    private String subject;

    public int getIdsubject() {
        return idsubject;
    }

    public void setIdsubject(int idsubject) {
        this.idsubject = idsubject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subjects subjects = (Subjects) o;

        if (idsubject != subjects.idsubject) return false;
        if (subject != null ? !subject.equals(subjects.subject) : subjects.subject != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idsubject;
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Subjects{" +
                "idsubject=" + idsubject +
                ", subject='" + subject + '\'' +
                '}';
    }
}
