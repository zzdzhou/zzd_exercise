package jack.springboot.starter.starter20180310.entities;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class EBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String reader;

    private String isbn;

    private String name;

    private String author;

    private String description;

    public EBook() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
