 package booking.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TouristAttraction extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7662596208949770007L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Da goi den get");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Da goi den post");
	}
	
	@PostMapping("/getall")
	public void getallTuorist() {
		System.out.println("dda goi den multiple service");
	}
}
