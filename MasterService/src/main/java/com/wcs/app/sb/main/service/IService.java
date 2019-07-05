package com.wcs.app.sb.main.service;

import java.util.List;

import com.wcs.app.sb.main.model.Ledger;

public interface IService {
	public Ledger addLedger(Ledger l);
	public List<Ledger> getLedger();
}
