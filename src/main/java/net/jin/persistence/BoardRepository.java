package net.jin.persistence;

import org.springframework.data.repository.CrudRepository;
import net.jin.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long> {

}
