package entity;

import javax.persistence.*;

@Entity
public class Students {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idstudent")
    private int idstudent;
    @Basic
    @Column(name = "srudent")
    private String srudent;
    @Basic
    @Column(name = "group")
    private String group;

    public int getIdstudent() {
        return idstudent;
    }

    public void setIdstudent(int idstudent) {
        this.idstudent = idstudent;
    }

    public String getSrudent() {
        return srudent;
    }

    public void setSrudent(String srudent) {
        this.srudent = srudent;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Students students = (Students) o;

        if (idstudent != students.idstudent) return false;
        if (srudent != null ? !srudent.equals(students.srudent) : students.srudent != null) return false;
        if (group != null ? !group.equals(students.group) : students.group != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idstudent;
        result = 31 * result + (srudent != null ? srudent.hashCode() : 0);
        result = 31 * result + (group != null ? group.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Students{" +
                "idstudent=" + idstudent +
                ", srudent='" + srudent + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
