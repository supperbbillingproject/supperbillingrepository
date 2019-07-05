package com.wcs.app.sb.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcs.app.sb.main.model.Ledger;
import com.wcs.app.sb.main.repository.ILedgerRepository;

@Service
public class Serviceimpl implements IService{
	@Autowired
	ILedgerRepository ilr;

	@Override
	public Ledger addLedger(Ledger l) {
		Ledger l1 = ilr.save(l);
		return l1;
	}

	@Override
	public List<Ledger> getLedger() {
		List<Ledger>li = ilr.findAll();
		return li;
	}

}
