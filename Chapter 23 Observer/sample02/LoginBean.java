import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//Concrete Subject
public class LoginBean extends JPanel implements ActionListener
{
	private JLabel labUserName,labPassword;
	private JTextField txtUserName;
	private JPasswordField txtPassword;
	private JButton btnLogin,btnClear;
	
	private LoginEventListener lel;  //Abstract Observer
	
	private LoginEvent le;
	
	public LoginBean()
	{
		this.setLayout(new GridLayout(3,2));
		labUserName=new JLabel("User Name:");
		add(labUserName);
		
		txtUserName=new JTextField(20);
		add(txtUserName);
		
		labPassword=new JLabel("Password:");
		add(labPassword);
		
		txtPassword=new JPasswordField(20);
		add(txtPassword);
		
		btnLogin=new JButton("Login");
		add(btnLogin);
		
		btnClear=new JButton("Clear");
		add(btnClear);
		
		btnClear.addActionListener(this);
		btnLogin.addActionListener(this);//As a concrete observer for another subject,ActionListener as the abstract observer.
	}
	
	//Add an observer.
	public void addLoginEventListener(LoginEventListener lel)
	{
		this.lel=lel;
	}
	
	//private or protected as the notify method
	private void fireLoginEvent(Object object,String userName,String password)
	{
		le=new LoginEvent(btnLogin,userName,password);
		lel.validateLogin(le);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		if(btnLogin==event.getSource())
		{
			String userName=this.txtUserName.getText();
			String password=this.txtPassword.getText();
			
			fireLoginEvent(btnLogin,userName,password);
		}
		if(btnClear==event.getSource())
		{
			this.txtUserName.setText("");			
			this.txtPassword.setText("");
		}
	}
}