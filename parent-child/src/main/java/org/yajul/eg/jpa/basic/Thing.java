package org.yajul.eg.jpa.basic;

import javax.persistence.*;

/**
 * A very basic JPA entity with a surrogate key.
 */
@Entity
@Table(name = "thing")
public class Thing
{
    private Long id;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }
}