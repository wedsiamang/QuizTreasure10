package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import dao.ViewerDao;
import model.UserName;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/login.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String inputName=request.getParameter("inputName");
		
		UserDao dao=new UserDao();
		UserName user = new UserName();
		
		UserName selectName =dao.selectName(inputName);
	
		System.out.println(selectName.getName());
		System.out.println(inputName);
		
		String name=selectName.getName();
		int id=selectName.getId();
		int age=selectName.getAge();
		String introduction=selectName.getIntroduction();
		
		if(selectName.getName().equals(inputName)) {
			UserName usr = new UserName(id,name,age,introduction);
			
			HttpSession session = request.getSession();
			
			session.setAttribute("usr", usr);
			request.setAttribute("selectName",selectName);
			
			String[]titles= {"maskMap","starLink","snowden"};
			ViewerDao daov=new ViewerDao();
			for(String title : titles) {
			
			daov.insert_name(inputName, title);
			
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
			dispatcher.forward(request, response);
			
		}
		
		
		
	}

}
