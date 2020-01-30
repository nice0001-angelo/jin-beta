package net.jin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.jin.model.Users;

//Mapper in mybatis jpaRepository<table, type of Id>
public interface UsersRepository extends JpaRepository<Users, Long> {
	

}
