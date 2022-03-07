package org.facebook;

public class Abcd {
	public static void main(String[] args) {
		Facebook a=new Facebook();
		a.setusername("aadvik");
		a.setpassword(1256);
		a.setaccountno(9876543);
		a.setpasword("mani");
		a.setmailid("vishnu");
		a.setpassword1("567");
		a.setmobno(987654321);
		a.setpassword2("23456777");
		String username=a.getusername();
		System.out.println(username);
		int password=a.getpassword();
		System.out.println(password);
		int accountno=a.getaccountno();
		System.out.println(accountno);
		String pasword=a.getpasword();
		System.out.println(pasword);
		String mailid=a.getmailid();
		System.out.println(mailid);
		String password1=a.getpassword1();
		System.out.println(password1);
		int mobno=a.getmobno();
		System.out.println(mobno);
		String password2=a.getpassword2();
		System.out.println(password2);
	}

}
