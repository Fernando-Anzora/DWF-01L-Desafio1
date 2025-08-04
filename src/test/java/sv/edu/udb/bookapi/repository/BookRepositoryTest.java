package sv.edu.udb.bookapi.repository;

import sv.edu.udb.bookapi.model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    @Transactional
    void testSaveAndFindById() {
        Book book = Book.builder()
                .title("Clean Code")
                .author("Robert C. Martin")
                .publicationYear(2008)
                .build();

        bookRepository.save(book);

        List<Book> result = bookRepository.searchByTitle("Clean");
        assertFalse(result.isEmpty());
        assertEquals("Clean Code", result.get(0).getTitle());
    }

    @Test
    @Transactional
    void testDelete() {
        Book book = Book.builder()
                .title("To Delete")
                .author("Anonymous")
                .publicationYear(2020)
                .build();

        bookRepository.save(book);

        List<Book> found = bookRepository.searchByTitle("Delete");
        assertFalse(found.isEmpty());

        bookRepository.delete(found.get(0));

        List<Book> afterDelete = bookRepository.searchByTitle("Delete");
        assertTrue(afterDelete.isEmpty());
    }
}
