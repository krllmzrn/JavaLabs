package entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Rating {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idrating")
    private int idrating;
    @Basic
    @JoinColumn(name = "idstudent")
    private Integer idstudent;
    @Basic
    @Column(name = "idsubject")
    private Integer idsubject;
    @Basic
    @Column(name = "rating")
    private Integer rating;

    public int getIdrating() {
        return idrating;
    }

    public void setIdrating(int idrating) {
        this.idrating = idrating;
    }

    public Integer getIdstudent() {
        return idstudent;
    }

    public void setIdstudent(Integer idstudent) {
        this.idstudent = idstudent;
    }

    public Integer getIdsubject() {
        return idsubject;
    }

    public void setIdsubject(Integer idsubject) {
        this.idsubject = idsubject;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rating rating1 = (Rating) o;

        if (idrating != rating1.idrating) return false;
        if (idstudent != null ? !idstudent.equals(rating1.idstudent) : rating1.idstudent != null) return false;
        if (idsubject != null ? !idsubject.equals(rating1.idsubject) : rating1.idsubject != null) return false;
        if (rating != null ? !rating.equals(rating1.rating) : rating1.rating != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idrating;
        result = 31 * result + (idstudent != null ? idstudent.hashCode() : 0);
        result = 31 * result + (idsubject != null ? idsubject.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Rating{" +
                "idrating=" + idrating +
                ", idstudent=" + idstudent +
                ", idsubject=" + idsubject +
                ", rating=" + rating +
                '}';
    }
}
