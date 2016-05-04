import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainClass extends JFrame
{
	private JButton button;
	private JDesktopPane desktopPane; 
	private SubFrame iFrame=null;
	
    public  MainClass()
    {
    	super("主窗体");
    	Container c=this.getContentPane();
    	c.setLayout(new BorderLayout());
		
    	button=new JButton("点击创建一个内部窗体");
    	button.addActionListener(new BtListener());
    	c.add(button, BorderLayout.SOUTH);
    	
    	desktopPane = new JDesktopPane(); //创建desktopPane  
		c.add(desktopPane);
    	
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setLocationRelativeTo(null);
    	this.setSize(400,400);
    	this.show();
    }
    
    class BtListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{	
    		if(iFrame!=null)
    		{
    			 desktopPane.remove(iFrame);
    		}
    		iFrame=SubFrame.getFrame();
    		desktopPane.add(iFrame);
    	}
    }
    
    public static void main (String[] args) 
    {
    	new MainClass();
	}  
}