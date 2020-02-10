package yncrea.lab06.core.entity;

import javax.persistence.*;
import java.util.Set;
// The @ManyToMany annotation is provided because it is not that easy ;)
// Another @ManyToMany annotation is needed !
// Hint : https://www.baeldung.com/jpa-many-to-many
// Hint 2 : https://tomee.apache.org/examples-trunk/jpa-enumerated/

public class Book implements Comparable<Book> {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name="title")
    private String title;

    @ManyToOne
    private Language language;

    @ManyToMany
    @JoinTable(
            name = "book_author",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors;

    @Column(name="image")
    private String image;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Tag> tags;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Review> reviews;


    @Override public int compareTo(final Book o) {
        return title.compareTo(o.title);
    }
}
