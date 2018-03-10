package jack.springboot.starter.starter20180310.dao;

import jack.springboot.starter.starter20180310.entities.EBook;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepo extends JpaRepository<EBook, Long> {
    List<EBook> findByReader(String reader);
}
