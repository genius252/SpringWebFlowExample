package com.jcg.examples.service;

import org.springframework.stereotype.Service;

import com.jcg.examples.bean.LoginBean;

@Service
public class LoginService
{
		public String validateUser(LoginBean loginBean)
		{
				String userName = loginBean.getUserName();
				String password = loginBean.getPassword();
				if(userName.equals("Chandan") && password.equals("TestPassword"))
				{
						return "true";
				}
				else
				{
						return "false";
				}
		}
		
}
