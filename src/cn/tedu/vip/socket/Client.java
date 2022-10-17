package cn.tedu.vip.socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
	private Socket socket;

	public Client() {
		try {
			/*
			 * 实锟斤拷锟斤拷Socket锟斤拷要锟斤拷锟斤拷锟斤拷锟斤拷 1.锟斤拷锟斤拷锟斤拷锟斤拷IP锟斤拷址 2.锟斤拷锟斤拷锟斤拷锟斤拷,锟剿口猴拷
			 * 
			 * 只要实锟斤拷锟斤拷锟缴癸拷锟斤拷锟斤拷锟斤拷锟接成癸拷 锟斤拷锟绞э拷芫突锟斤拷锟斤拷锟届常
			 * 
			 * 锟剿口猴拷锟角硷拷锟斤拷锟斤拷峁╋拷锟斤拷锟侥接口的憋拷锟斤拷 ip锟斤拷址锟角硷拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷械锟斤拷锟斤拷锟轿伙拷锟�
			 */
			System.out.println("开始连接");
			socket = new Socket("localhost", 8080);
			System.out.println("连接成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * win+R锟斤拷锟斤拷cmd 锟节碉拷锟斤拷锟侥斤拷锟斤拷锟斤拷锟斤拷锟斤拷ipconfig锟桔察本锟斤拷锟斤拷ip锟斤拷址
		 */
	}

	public void start() {
		/*
		 * 要锟诫发锟斤拷锟斤拷息,锟斤拷要锟斤拷socket锟斤拷锟斤拷锟叫伙拷锟斤拷锟斤拷锟斤拷 OutputStream getOutStream;
		 */
		try {
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw, true);

			Scanner scan = new Scanner(System.in);
			while (true) {
				String msg = scan.nextLine();
				pw.println(msg);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		/*
		 * java.net.Socket Socket锟斤拷装锟斤拷TCP通锟斤拷细锟斤拷,锟斤拷锟斤拷只锟斤拷要锟斤拷确IP锟斤拷址锟酵端口猴拷
		 * 锟斤拷锟斤拷锟斤拷锟斤拷朔锟斤拷锟斤拷锟斤拷锟斤拷(锟斤拷锟斤拷锟斤拷)锟斤拷锟斤拷
		 */
		Client client = new Client();
		client.start();
	}
}
