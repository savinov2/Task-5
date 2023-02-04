package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "serial")
    private int serial;
    @Column(name = "model")
    private String model;

    @OneToOne(mappedBy = "car")
    private User user;

    public Car() {
    }

    public Car(int serial, String model) {
        this.serial = serial;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

}
