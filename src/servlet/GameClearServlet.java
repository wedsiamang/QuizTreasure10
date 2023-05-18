package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.GameDao;
import model.UserName;

/**
 * Servlet implementation class GameClearServlet
 */
@WebServlet("/GameClearServlet")
public class GameClearServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GameClearServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/game/gameAnswer.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String again=request.getParameter("again");
		String next=request.getParameter("next");
	//	int answer = Integer.parseInt(request.getParameter("answer"));

		HttpSession session = request.getSession();
		UserName usr = (UserName) session.getAttribute("usr");
		String name=usr.getName();
		// HttpSession session = request.getSession();
		
		GameDao dao = new GameDao();
		dao.gameReset(name);
		if(again!=null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/game/gameRule.jsp");
			dispatcher.forward(request, response);
		
		}else if(next!=null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/game/gameAnswer.jsp");
			dispatcher.forward(request, response);
			
		}
		
		

			}
		}
	
	

