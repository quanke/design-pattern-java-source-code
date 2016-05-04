import javax.swing.*;
import java.awt.*;

public class LoginValidatorB extends JFrame implements LoginEventListener
{
	private JPanel p;
	private LoginBean lb;
	private JLabel lblLogo;
	public LoginValidatorB()
	{
		super("China Mobile");
		p=new JPanel();
		this.getContentPane().add(p);
		lb=new LoginBean();
		lb.addLoginEventListener(this);
		
		Font f=new Font("Times New Roman",Font.BOLD,30);
		lblLogo=new JLabel("China Mobile");
		lblLogo.setFont(f);
		lblLogo.setForeground(Color.blue);
		
		p.setLayout(new GridLayout(2,1));
		p.add(lblLogo);
		p.add(lb);
		p.setBackground(new Color(163,185,255));
		this.setSize(600,200);
		this.setVisible(true);
	}
	public void validateLogin(LoginEvent event)
	{
		String userName=event.getUserName();
		String password=event.getPassword();
		
		if(userName.equals(password))
		{
			JOptionPane.showMessageDialog(this,new String("Username must be different from password!"),"alert",JOptionPane.ERROR_MESSAGE);
		}
		else
		{
			JOptionPane.showMessageDialog(this,new String("Rigth details!"),"alert",JOptionPane.INFORMATION_MESSAGE);			
		}
	}
	public static void main(String args[])
	{
		new LoginValidatorB().setVisible(true);
	}
}