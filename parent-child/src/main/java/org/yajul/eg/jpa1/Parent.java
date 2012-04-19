package org.yajul.eg.jpa1;

import javax.persistence.*;

/**
 * Parent entity.
 * <br>
 * User: josh
 * Date: 4/19/12
 * Time: 12:56 PM
 */
@Entity()
@Table(name="parent1")
public class Parent
{
    private Long id;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
