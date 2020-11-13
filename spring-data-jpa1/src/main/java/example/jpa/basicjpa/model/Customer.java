package example.jpa.basicjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer extends BasicEntity {
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    protected String innerToString() {
        return super.innerToString() +
                ", firstName=" + firstName + ", lastName=" + lastName;
    }
}
