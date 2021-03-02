package com.goverdovsky.bank.repository;

import com.goverdovsky.bank.entity.Credit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface CreditRepository extends CrudRepository<Credit, Long> {
        List<Credit> findAll();
}
