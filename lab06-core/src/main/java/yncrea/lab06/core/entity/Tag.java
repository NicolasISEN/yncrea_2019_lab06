package yncrea.lab06.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
// The @JsonIgnoreProperties annotation is mandatory in our case because it helps the JSON Serialization

@JsonIgnoreProperties({ "books" })
public class Tag implements Comparable<Tag> {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Book> books;


    @Override
    public int compareTo(final Tag o) {
        return name.compareTo(o.name);
    }
}
