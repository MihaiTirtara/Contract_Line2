package model;

import java.util.ArrayList;

public class AccountList 

{
	private ArrayList<Account>accounts;

	
	public AccountList() 
	{
		accounts = new ArrayList<Account>();
	}
	
	public int getNumberOfAccounts(){
		
		return accounts.size();
	}
	
	public void addAccount(Account a){
		
		accounts.add(a);
	}
	
	public Account getAccount(int index){
		
		return accounts.get(index);
	}
	
	public void removeAccount(int index){
		
		accounts.remove(index);
	}
	
	public boolean isEmpty(){
		
		if(accounts.size() == 0){
			
			return true;
		}
		else{
			
			return false;
		}
	}
	
	public Account getAccountByFname(String fname){
		
		for(int i = 0;i<accounts.size();i++){
			
			if(accounts.get(i).getfName().equals(fname)){
				
				return accounts.get(i);
			}
		}
		
		return null;
	}
	
	public Account getAccountByLname(String lname){
		
		for(int i = 0;i<accounts.size();i++){
			
			if(accounts.get(i).getlName().equals(lname)){
				
				return accounts.get(i);
			}
		}
		
		return null;
	}
	
	public Account getAccountById(String id){
		
		for(int i = 0;i<accounts.size();i++){
			
			if(accounts.get(i).getId().equals(id)){
				
				return accounts.get(i);
			}
		}
		
		return null;
	}
	
	
	

}
