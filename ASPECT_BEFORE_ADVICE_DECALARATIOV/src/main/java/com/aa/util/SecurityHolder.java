package com.aa.util;

public class SecurityHolder {
public static SecurityHolder instance;
public ThreadLocal<Userdetails> userCreadential;
public SecurityHolder() {
  userCreadential=new ThreadLocal<>();
}

public static synchronized SecurityHolder getInsatnace()
{
	if(instance==null)
	{
		instance=new SecurityHolder();
	}
	return instance;
	
}

public void login(String user,String pwd)
{
	Userdetails userdetails=new Userdetails(user, pwd);
	userCreadential.set(userdetails);
}
public void logOut() {
	userCreadential.set(null);
	
}

public boolean authenticate()
{
Userdetails userdetails=null;
userdetails=userCreadential.get();
if (userdetails!=null) {
	if(userdetails.getUserName().equals("mansur") && userdetails.getPassword().equals("java"))
	{
		return true;
	}
	
}
return false;

}
}
