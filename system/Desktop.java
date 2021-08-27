package org.system;

public class Desktop extends Computer{

	public void desktopSize()
	{

        int model=2000;
		System.out.println("DesktopSize   "+model);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Desktop des=new Desktop();
    des.computerModel();
    des.desktopSize();
	}

}
