package com.endava.apiexample.feature1.repositories;

import com.endava.apiexample.feature1.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRespository extends CrudRepository <User,Long> {

}
