package mydb_app.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ArrayDb implements MyDao{
	
	private static ArrayList<String> macchineRepository= new ArrayList<>();

	@Override
	public void add(Serializable macchina) {
		if(!String.class.isInstance(macchina))
			throw new RuntimeException("ma che me stai a manda'! io salvo solo stringhe");
		macchineRepository.add((String)macchina);
		
	}

	@Override
	public void delete(Serializable macchina) {
		macchineRepository.remove(macchina);
		
	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Not yet implemented");
	}

	@Override
	public List<Serializable> list() {
		ArrayList<Serializable> result = new ArrayList<>();
		for (String macchina : macchineRepository) {
			result.add(macchina);
		}
		return result;
	}

}
