package ar.edu.ub.parquesnacionales.Model;


import javax.persistence.*;
import java.awt.*;


@Entity
@Table
public class Encuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Encuesta_id")
    private long id;
    @Column(name="pregunta1")
    private boolean P1;
    @Column(name="pregunta2")
    private boolean P2;
    @Column(name="CantParques")
    private int cantidad_Parques;

    protected Encuesta(){}


    public Encuesta(long id, boolean p1, boolean p2, int cantidad_Parques){
        super();
        this.id=id;
        this.P1=p1;
        this.P2=p2;
        this.cantidad_Parques=cantidad_Parques;



    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isP1() {
        return P1;
    }

    public void setP1(boolean p1) {
        P1 = p1;
    }

    public boolean isP2() {
        return P2;
    }

    public void setP2(boolean p2) {
        P2 = p2;
    }

    public int getCantidad_Parques() {
        return cantidad_Parques;
    }

    public void setCantidad_Parques(int cantidad_Parques) {
        this.cantidad_Parques = cantidad_Parques;
    }
}
