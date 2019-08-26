package com.SpringBoot.Rest.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Rest.dto.SmartPhone;

@Repository
public interface SmartPhoneRepositry extends JpaRepository<SmartPhone, Integer>
{
	@Modifying
	@Query("UPDATE SmartPhone SET price = ?1 , brand = ?2, spec = ?3 WHERE id = ?4")
	@Transactional
	void updateSmartPhone(int price, String brand, String spec, int id);
}
