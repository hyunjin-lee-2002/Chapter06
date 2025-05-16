package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//Seoul
public class Server {

	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = new ServerSocket();
		
		//bind: ip 192.168.1.30		port: 10001
		// InetSoc ketAddress ipport = new InetSocketAddress("192.168.1.30", 100001);
		// new InetSocketAddress(ipport); 
		serverSocket.bind(new InetSocketAddress("192.168.1.30", 10001));
		
		//서버 시작
		System.out.println("<서버 시작>");
		System.out.println("====================");
		System.out.println("[연결을 기다리고 있습니다.]");
		
		//클라이언트가 연결되면 accept() 실행됨
		//socket 종이컵 전화기
		Socket socket = serverSocket.accept();
		System.out.println("[클라이언트가 연결 되었습니다.]");
		
		//읽기 스트림 --> 메세지를 받음
		System.out.println("====================");
		//System.out.println("C:\\javaStudy\\MS949-copy.txt");
		InputStream in = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		//쓰기 스트림 준비
		OutputStream out = socket.getOutputStream(); //main Stream
		OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		//======================================
		while(true) {
			String msg = br.readLine(); //입력대기
			if(msg == null ) {  //끝내는 상황
				break;
			}
			System.out.println("받은 메세지: " + msg);
			//메세지 보내기
			bw.write(msg);
			bw.newLine();
			bw.flush();
		}
		
		//메세지 받음
		String msg = br.readLine();
		
		//메세지 받음
		bw.write(msg);
		
		//자원 정리
		socket.close();
		serverSocket.close();
		
	}

}
