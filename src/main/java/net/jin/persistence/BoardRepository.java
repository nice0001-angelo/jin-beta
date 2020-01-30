/*
 * This is a Jin-beta Project
 * File name : BoardRepository.java
 * Created by : Jinhyun
 * Created on : Jan 2020 
 * Contents : BoardRepository for Board object
 */
package net.jin.persistence;

import org.springframework.data.repository.CrudRepository;
import net.jin.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long> {

}
