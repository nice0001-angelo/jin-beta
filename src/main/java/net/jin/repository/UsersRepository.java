/*
 * This is a Jin-beta Project
 * File name : Users.java
 * Created by : Jinhyun
 * Created on : Jan 2020
 * Contents : Table Repository Object
 */
package net.jin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.jin.model.Users;

//Mapper in mybatis jpaRepository<table, type of Id>
public interface UsersRepository extends JpaRepository<Users, Long> {
	

}
