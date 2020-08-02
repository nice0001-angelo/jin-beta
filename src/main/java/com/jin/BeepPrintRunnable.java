/**
 * 
 */
package com.jin;

import java.awt.Toolkit;

/**
 * @author njh
 *
 */
public class BeepPrintRunnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				
			}
		});
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("땡");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
