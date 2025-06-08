package com.kh.overall.farm.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.overall.farm.model.dao.FarmDAO;
import com.kh.overall.farm.model.vo.Farm;
import com.kh.overall.farm.model.vo.Purchase;

public class FarmController {

	private FarmDAO fd = new FarmDAO();
	
	public HashMap<String,Farm> farm = new HashMap<>();
	
	public HashMap<String,Farm> printFarm = new HashMap<>();
	
	public  Farm addNewKind(String name,Farm f) {
		return f;
		
	}
	public void insertNewKind() {
		
	}
	public boolean checkFarm(String name) {
		return false;
		
	}
	public void changeName(int menuNum,String name,int newNum) {
		
	}
	public void removeFarm(String name) {
		
	}
	public void buyFarm(String name,int price,int num,int total) {
		
	}
	public ArrayList<Purchase> printBuyFarm(){
		return null;
		
	}
	
	public void refund(ArrayList<Purchase> list) {
		
	}
	public ArrayList<Purchase> selectAllBuying(){
		return null;}
	
	
	
	
	
}
