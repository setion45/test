package com.example.sweater.repo;

import com.example.sweater.models.Klient;
import org.springframework.data.repository.CrudRepository;

public interface KlientRepository  extends CrudRepository<Klient, String> {
}
