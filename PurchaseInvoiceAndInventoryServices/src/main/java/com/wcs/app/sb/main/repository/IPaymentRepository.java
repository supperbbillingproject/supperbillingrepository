package com.wcs.app.sb.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.Payment;

public interface IPaymentRepository extends PagingAndSortingRepository<Payment, Integer> {

}
