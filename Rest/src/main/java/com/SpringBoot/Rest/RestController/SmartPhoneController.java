package com.SpringBoot.Rest.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Rest.dao.SmartPhoneRepositry;
import com.SpringBoot.Rest.dto.SmartPhone;

@RestController
public class SmartPhoneController
{
	@Autowired
	private SmartPhoneRepositry smartPhoneRepo;
	
	@GetMapping(path = "/getAllSmartPhone")
	public List<SmartPhone> getAllSmartPhone()
	{
		return smartPhoneRepo.findAll();
	}
	
	@PutMapping(path = "/updateSmartPhone/{id}")
	public List<SmartPhone> updateSmartPhone(@RequestBody SmartPhone smartPhone, @PathVariable int id )
	{
		smartPhoneRepo.updateSmartPhone(smartPhone.getPrice(), smartPhone.getBrand(), id);
		return smartPhoneRepo.findAll();
	}
	
	@PostMapping(path = "/addSmartPhone")
	public List<SmartPhone> addSmartPhone(@RequestBody SmartPhone smartPhone)
	{
		smartPhoneRepo.save(smartPhone);
		return smartPhoneRepo.findAll();
	}

	@DeleteMapping(path = "/deleteSmartphone/{id}")
	public List<SmartPhone> delete(@PathVariable int id)
	{
		smartPhoneRepo.deleteById(id);
		return smartPhoneRepo.findAll();
	}
}
