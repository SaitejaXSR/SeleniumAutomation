package org.cap.demo.dao;

import org.cap.demo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("accountDBDao")
public interface IAccountDBDao extends JpaRepository<Account, Integer>{

}
