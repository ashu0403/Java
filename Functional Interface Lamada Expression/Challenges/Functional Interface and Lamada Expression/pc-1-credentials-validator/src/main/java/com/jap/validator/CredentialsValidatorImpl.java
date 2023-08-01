package com.jap.validator;

public class CredentialsValidatorImpl {
    public String validateUser(String name, String password){
    
	 if(name.equals("admin")&&password.equals("1234"))
	 {
		 return "valid user";
	 }

        return "invalid user";
    }



}
