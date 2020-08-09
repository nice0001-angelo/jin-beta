/**
 * 
 */
package com.jin.messenger;

import java.io.*;
import java.net.*;
import java.util.*;

public class MultiServer {
	private ArrayList<MultiServerThread> list; //List 컬렉션(ArrayList) 필드
	private Socket socket; //Socket 필드

	public MultiServer() throws IOException {
		list = new ArrayList<MultiServerThread>();//list로 ArrayList 객체생성
		ServerSocket serverSocket = new ServerSocket(5000); //ServerSocket(int port) 생성자 호출 5000포트
		MultiServerThread mst = null;
		boolean isStop = false;
		while (!isStop) {
			System.out.println("Server ready...");
			socket = serverSocket.accept();
			mst = new MultiServerThread(this);
			list.add(mst);
			Thread t = new Thread(mst);
			t.start();
		}
	}
	
	public void Ddos(){
		System.exit(0);
	}
	

	public ArrayList<MultiServerThread> getList(){
		return list;
	}

	public Socket getSocket() {
		return socket;
	}

	public static void main(String arg[]) throws IOException {
		new MultiServer();
	}
}