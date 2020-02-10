package yncrea.lab06.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import java.util.List;

// The @JsonIgnoreProperties annotation is mandatory in our case because it helps the JSON Serialization
// The @ManyToMany annotation is provided because it is not that easy ;)

@JsonIgnoreProperties({ "books" })
public class Author implements Comparable<Author> {


    @Column(name = "firstname")
    private String firstname;


    @Column(name = "lastname")
    private String lastname;

    @ManyToMany(mappedBy = "authors")
    private List<Book> books;


    public Author(final String firstname, final String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }


    @Override public int compareTo(final Author o) {
        if (lastname.equals(o.lastname)) {
            return firstname.compareTo(o.firstname);
        } else {
            return lastname.compareTo(o.lastname);
        }
    }
}
