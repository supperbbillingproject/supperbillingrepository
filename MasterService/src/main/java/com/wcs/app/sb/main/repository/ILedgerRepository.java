package com.wcs.app.sb.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.Ledger;

public interface ILedgerRepository extends PagingAndSortingRepository<Ledger, Integer>{

}
