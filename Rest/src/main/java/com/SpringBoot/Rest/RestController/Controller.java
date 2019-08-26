package com.SpringBoot.Rest.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
	@GetMapping(path = "/getMessage")
	public String getMessage()
	{
		return "Hello ! Welcome to Spring boot rest application";
	}
	
	@PostMapping(path = "/sendMessage")
	public String sendMessage(@RequestBody String message)
	{
		return message;
	}
	
	@PutMapping(path = "/update/{position}")
	public List<String> update(@RequestBody String text, @PathVariable(value = "position") int index )
	{
		List<String> list = new ArrayList<>();
		list.add("Imran");
		list.add("Rahul");
		list.add("Sandeep");
		list.remove(index);
		list.add(index, text);
		return list;
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public List<Integer> delete(@PathVariable int id)
	{
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.remove(id);
		return list;
	}
	
	@PostMapping(path = "/add/{index}")
	public List<String> add(@RequestBody String name, @PathVariable(value = "index") int id)
	{
		List<String> names = new ArrayList<>();
		names.add("imran");
		names.add("Suraj");
		names.add("sagar");
		names.add(id,name);
		
		return names;
 	}
}
