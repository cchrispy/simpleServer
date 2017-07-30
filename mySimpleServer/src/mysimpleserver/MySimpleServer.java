/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysimpleserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author ChrisMac
 */
public class MySimpleServer {
  
  final private int PORT = 8888;

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    System.out.println("Hello World.");
    
    new MySimpleServer();
  }
  
  public MySimpleServer() {
    try {
      ServerSocket mServerSocket = new ServerSocket(PORT);
      System.out.println("Server started at port: " + PORT);
      
      Socket mSocket = mServerSocket.accept();
      
      PrintWriter output = new PrintWriter(mSocket.getOutputStream(), true);
      BufferedReader input = new BufferedReader(new InputStreamReader(mSocket.getInputStream()));
      
      output.println("Connected to server: " + new Date());
      
    } catch (IOException e) {
      System.out.println("Error creating server: " + e);
    }
  }
  
}
