package jack.jpa.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "jc_book")
@NamedQueries({
        @NamedQuery(name = "Book.ByName", query = "select b from Book as b where b.bookName =:name"),
        @NamedQuery(name = "Book.ByAuthor", query = "select b from Book as b, Author a where b member of a.bookList and a.authorName =:Author")
})
public class Book implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "book_id")
    private Long bookId;

    @Column(name = "book_name")
    private String bookName;

    @ManyToMany
    @JoinTable(name = "jc_author_book",
        joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authorList;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Set<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(Set<Author> authorList) {
        this.authorList = authorList;
    }

    @Override
    public String toString() {
        return "jack.jpa.entity.Book {" + "bookId = " + bookId + ", bookName = " + bookName + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.bookId != other.bookId && (this.bookId == null || !this.bookId.equals(other.bookId))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.bookId != null ? this.bookId.hashCode() : 0);
        return hash;
    }
}
