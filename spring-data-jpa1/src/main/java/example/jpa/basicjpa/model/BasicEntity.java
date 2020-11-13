package example.jpa.basicjpa.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@MappedSuperclass
public class BasicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @CreationTimestamp
    @Column(name = "created")
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    @Column(name = "updated")
    private LocalDateTime updateDateTime;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public LocalDateTime getUpdateDateTime() {
        return updateDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BasicEntity)) return false;
        BasicEntity that = (BasicEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return getClass().getCanonicalName() + "{" +
                innerToString() +
                '}';
    }

    protected String innerToString() {
        return "id=" + id +
                ", createDateTime=" + createDateTime +
                ", updateDateTime=" + updateDateTime;
    }
}
