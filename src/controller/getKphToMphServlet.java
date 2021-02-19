package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.KphToMphConverter;

/**
 * Servlet implementation class getKphToMphServlet
 */
@WebServlet("/getKphToMphServlet")
public class getKphToMphServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getKphToMphServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userMph = request.getParameter("userKph");
		
		KphToMphConverter kphConverter = new KphToMphConverter(Integer.parseInt(userMph));
		
		request.setAttribute("userKphToMph", kphConverter);
		
		getServletContext().getRequestDispatcher("/resultKphToMph.jsp").forward(request, response);
		
	}

}
