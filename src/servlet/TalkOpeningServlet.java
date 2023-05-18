package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.QuizDao;
import dao.ViewerDao;
import model.Quiz;
import model.UserName;
import model.Viewer;

/**
 * Servlet implementation class MaskMapServlet
 */
@WebServlet("/TalkOpeningServlet")
public class TalkOpeningServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TalkOpeningServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();
		UserName usr = (UserName) session.getAttribute("usr");
		String name = usr.getName();

		int id = 0;
		String maskMap = request.getParameter("maskMap");
		String starLink = request.getParameter("starLink");
		String snowden = request.getParameter("snowden");
		
		ViewerDao vdao=new ViewerDao();
		vdao.talkReset(name);

		// System.out.println(maskMap);

		if (maskMap != null) {
			String title = maskMap;
			System.out.println("openingname" + name);
			QuizDao dao = new QuizDao();
			List<Quiz> quizList = dao.select_quizList(title);

//			Audio audio = new Audio();
//			try {
//				audio.audioCollect();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}

			request.setAttribute("quizList", quizList);
			request.setAttribute("maskMap", maskMap);

		} else if (starLink != null) {
			String title = starLink;
			System.out.println("openingservlet" + title);
			QuizDao dao = new QuizDao();
			List<Quiz> quizList = dao.select_quizList(title);
			request.setAttribute("quizList", quizList);
			request.setAttribute("starLink", starLink);
		} else if (snowden != null) {
			String title = snowden;
			System.out.println("openingservlet:" + title);
			QuizDao dao = new QuizDao();
			List<Quiz> quizList = dao.select_quizList(title);
			request.setAttribute("quizList", quizList);
			request.setAttribute("snowden", snowden);
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/talk/opening.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		int id = 0;
		HttpSession session = request.getSession();
		UserName usr = (UserName) session.getAttribute("usr");
		String name = usr.getName();

		String maskMap = request.getParameter("maskMap");
		String starLink = request.getParameter("starLink");
		String snowden = request.getParameter("snowden");
		String ans = request.getParameter("ans");
		List<String> resp = new ArrayList<String>();
		resp.add("正解！");
		resp.add("はずれ。");

		if (maskMap != null) {
			String title = maskMap;
			QuizDao dao = new QuizDao();
			List<Quiz> quizList = dao.select_quizList(title);

			Viewer v = new Viewer();
			ViewerDao vdao = new ViewerDao();
			vdao.update_ans1(ans, title, name);
			

			List<Viewer>viewerList = vdao.selectViewer(title, name);
			request.setAttribute("viewerList", viewerList);
			request.setAttribute("quizList", quizList);
			request.setAttribute("maskMap", maskMap);

			if (ans.contains("中国語")) {
				String res = resp.get(0);
				request.setAttribute("res", res);
//				Audio audio = new Audio();
//				try {
//					audio.audioCollect();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			} else {
				String res = resp.get(1);
				request.setAttribute("res", res);
//				Audio audio = new Audio();
//				try {
//					audio.audioUnCollect();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}

			}

			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/talk/intro.jsp");
			dispatcher.forward(request, response);

		} else if (starLink != null) {
			String title = starLink;
			System.out.println("star:" + title);
			QuizDao dao = new QuizDao();
			List<Quiz> quizList = dao.select_quizList(title);

			ViewerDao vdao = new ViewerDao();
			vdao.update_ans1(ans, title, name);
			List<Viewer> viewerList = vdao.selectViewer(title, name);
			request.setAttribute("viewerList", viewerList);

			request.setAttribute("quizList", quizList);
			request.setAttribute("starLink", starLink);

			if (ans.contains("戦争")) {
				String res = resp.get(0);
				request.setAttribute("res", res);
//				Audio audio = new Audio();
//				try {
//					audio.audioCollect();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			} else {
				String res = resp.get(1);
				request.setAttribute("res", res);
//				Audio audio = new Audio();
//				try {
//					audio.audioUnCollect();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}

			}

			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/talk/intro.jsp");
			dispatcher.forward(request, response);

		} else if (snowden != null) {
			String title = snowden;
			System.out.println("snowden:" + title);
			QuizDao dao = new QuizDao();
			List<Quiz> quizList = dao.select_quizList(title);
			request.setAttribute("quizList", quizList);
			request.setAttribute("snowden", snowden);

			ViewerDao vdao = new ViewerDao();
			vdao.update_ans1(ans, title, name);
			List<Viewer> viewerList = vdao.selectViewer(title, name);
			request.setAttribute("viewerList", viewerList);

			if (ans.contains("アメリカ")) {
				String res = resp.get(0);
				request.setAttribute("res", res);
//				Audio audio = new Audio();
//				try {
//					audio.audioCollect();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			} else {
				String res = resp.get(1);
				request.setAttribute("res", res);
//				Audio audio = new Audio();
//				try {
//					audio.audioUnCollect();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}

			}

			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/talk/intro.jsp");
			dispatcher.forward(request, response);
		}
		System.out.println("opening:" + ans);

	}
}
