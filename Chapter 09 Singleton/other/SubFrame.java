import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SubFrame extends JInternalFrame
{
	private static SubFrame frame;//静态实例
	
	/*
	 *私有构造函数
	 */
    private SubFrame()
    {
    	super("子窗体", true, true, true, false);
    	this.setLocation(20,20);  //设置内部窗体位置  
    	this.setSize(200,200);  //设置内部窗体大小 
    	this.addInternalFrameListener(new MyIFListener());//监听窗体事件
    	this.setVisible(true);
    }
    
    public static SubFrame getFrame()//返回窗体实例
    {
    	if(frame==null)//如果窗体对象为空
    	{
    		frame=new SubFrame();//创建该窗体，否则直接返回窗体
    	}
    	return frame;//返回窗体		
    }  
    
    class MyIFListener extends InternalFrameAdapter//事件监听器
    {
    	//子窗体关闭时，将窗体对象设为null
    	public void internalFrameClosing(InternalFrameEvent e) 
    	{
    		if(frame!=null)
    		{
    			frame=null;
    		}
    	}
    }  
}