package com.wcs.app.sb.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wcs.app.sb.main.model.Ledger;
import com.wcs.app.sb.main.service.IService;

@RestController
@CrossOrigin("*")
/*@RequestMapping("/User")*/
public class UserController {
	@Autowired
	IService is;
	
	@RequestMapping(value="/")
	public String m1() {
		
		return "hello";
	}
	
	@RequestMapping(value="/ledger", method=RequestMethod.POST, consumes="application/json", produces="application/json")
	public Ledger addLedger(@RequestBody Ledger led)
	{
		Ledger ledger = is.addLedger(led);
		return ledger;
		
	}
	
	@RequestMapping(value="/ledger", method=RequestMethod.GET, consumes="application/json", produces="application/json")
	public List<Ledger> getLedger()
	{
		List<Ledger> li = is.getLedger();
		return li;
		
	}
}
