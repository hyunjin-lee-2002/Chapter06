package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

//London
public class Client {

	public static void main(String[] args) throws IOException {
		
		//create socket
		Socket socket = new Socket();
		
		System.out.println("<클라이언트 시작>");
		System.out.println("====================");
		
		//서버에 연결 요청
		System.out.println("[서버에 연결을 요청합니다.]");
		socket.connect(new InetSocketAddress("192.168.1.30", 10001));
		
		//쓰기 스트림 --> 메세지를 보냄
		//OutputStream out = new FileOutputStream("C:\\javaStudy\\MS949-copy.txt");
		OutputStream out = socket.getOutputStream();			//main Stream
		OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		//읽기 스트림 준비
		InputStream in = socket.getInputStream(); //main stream
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		//스캐너 준비
		Scanner sc = new Scanner(System.in);
		
		// <================================>
		while(true) {
			String msg = sc.nextLine(); //입력대기
			if("/q".equals(msg) ) {  //끝내는 상황
				break;
			}
			//메세지 보내기
			bw.write(msg);
			bw.newLine();
			bw.flush();
			
			//메세지 받기
			String reMsg = br.readLine();
			System.out.println("server: [" + reMsg + "]");
		}
		//키보드로 입력 받기
		String msg = sc.nextLine();	//입력 대기
		
		System.out.println("====================");
		System.out.println("<End Client>");
		
		//close
		sc.close();
		br.close();
		bw.close();
		socket.close();
	}

} 
