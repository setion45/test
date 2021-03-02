package com.goverdovsky.bank.repository;

import com.goverdovsky.bank.entity.CreditOffer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditOfferRepository extends CrudRepository<CreditOffer, Long> {

}
