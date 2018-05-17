package com.seeburger.networking;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

public class Server {

	
	public static void main(String[] args) throws IOException {

	
		try {
			ServerSocket ss = new ServerSocket(10001);
			BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
			
		String outString = "";
		Socket s = ss.accept();
		
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			while (!outString.equalsIgnoreCase("quit")) {
				Thread thr = new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						
					}
				})
				 
				String inputString = (String)dis.readUTF();
				System.out.println("message = " + inputString);
								
				outString = sc.readLine();			
				if(!outString.equalsIgnoreCase("quit")) {
					dos.writeUTF(outString);
					//dos.flush();
				}
					//
				
				
				
			}//end while loop
			ss.close();
			sc.close();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}
