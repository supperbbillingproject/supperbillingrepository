package com.wcs.app.sb.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.City;
import com.wcs.app.sb.main.model.User;

public interface IUserRepository extends PagingAndSortingRepository<User, Integer>{

}
