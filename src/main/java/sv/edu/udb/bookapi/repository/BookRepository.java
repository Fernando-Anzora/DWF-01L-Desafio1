package sv.edu.udb.bookapi.repository;

import sv.edu.udb.bookapi.model.Book;
import jakarta.persistence.*;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class BookRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Book> findAll() {
        return entityManager.createQuery("SELECT b FROM Book b", Book.class).getResultList();
    }

    public List<Book> searchByTitle(String title) {
        String jpql = "SELECT b FROM Book b WHERE LOWER(b.title) LIKE LOWER(:title)";
        return entityManager.createQuery(jpql, Book.class)
                .setParameter("title", "%" + title + "%")
                .getResultList();
    }

    public Book findById(Long id) {
        return entityManager.find(Book.class, id);
    }

    public void save(Book book) {
        entityManager.persist(book);
    }

    public void delete(Book book) {
        entityManager.remove(entityManager.contains(book) ? book : entityManager.merge(book));
    }
}
