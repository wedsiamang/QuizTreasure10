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
@WebServlet("/TalkMain3Servlet")
public class TalkMain3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TalkMain3Servlet() {
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
		String name=usr.getName();
		
		int id = 0;
		String maskMap = request.getParameter("maskMap");
		String starLink = request.getParameter("starLink");
		String snowden = request.getParameter("snowden");
		
	

		System.out.println(maskMap);

		if (maskMap != null) {
			String title = maskMap;
			System.out.println("mask" + title);
			QuizDao dao = new QuizDao();
			List<Quiz> quizList = dao.select_quizList(title);
			Viewer v=new Viewer();
			ViewerDao vdao=new ViewerDao();
			List<Viewer>viewerList = vdao.selectViewer(title,name);
	//		System.out.println("introget:"+ans);
			
			request.setAttribute("quizList", quizList);
			request.setAttribute("maskMap", maskMap);
			request.setAttribute("viewerList", viewerList);
			System.out.println("introgetmaskans:"+v.getAns1());

		} else if (starLink != null) {
			String title = starLink;
			System.out.println("star" + title);
			QuizDao dao = new QuizDao();
			List<Quiz> quizList = dao.select_quizList(title);
			
			ViewerDao vdao=new ViewerDao();
			List<Viewer>viewerList = vdao.selectViewer(title,name);
			
			
			request.setAttribute("quizList", quizList);
			request.setAttribute("starLink", starLink);
			request.setAttribute("viewerList", viewerList);
			
		} else if (snowden != null) {
			String title = snowden;
			System.out.println("snowden:" + title);
			QuizDao dao = new QuizDao();
			List<Quiz> quizList = dao.select_quizList(title);
			
			ViewerDao vdao=new ViewerDao();
			List<Viewer>viewerList = vdao.selectViewer(title,name);
			
			request.setAttribute("quizList", quizList);
			request.setAttribute("snowden", snowden);
			request.setAttribute("viewerList", viewerList);
			
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/talk/main4.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();
		UserName usr = (UserName) session.getAttribute("usr");
		String name=usr.getName();
		
		String maskMap = request.getParameter("maskMap");
		String starLink = request.getParameter("starLink");
		String snowden = request.getParameter("snowden");

		String ans = request.getParameter("ans");

		List<String> resp = new ArrayList<String>();
		resp.add("正解！");
		resp.add("はずれ。");
		
		if (maskMap != null) {
			String title = maskMap;
			System.out.println("mask:" + title);
			QuizDao dao = new QuizDao();
			List<Quiz> quizList = dao.select_quizList(title);
			
			
				if (ans.contains("国")) {
					String res = resp.get(0);
					request.setAttribute("res", res);
//					Audio audio = new Audio();
//					try {
//						audio.audioCollect();
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
				} else {
					String res = resp.get(1);
					request.setAttribute("res", res);
//					Audio audio = new Audio();
//					try {
//						audio.audioUnCollect();
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
				}
			
			
			request.setAttribute("quizList", quizList);
			request.setAttribute("maskMap", maskMap);
			
			ViewerDao vdao=new ViewerDao();
			vdao.insert_ans5(ans,title,name);
			List<Viewer>viewerList = vdao.selectViewer(title,name);
			
			request.setAttribute("viewerList", viewerList);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/talk/main4.jsp");
			dispatcher.forward(request, response);

		} else if (starLink != null) {
			String title = starLink;
			System.out.println("star:" + title);
			QuizDao dao = new QuizDao();
			List<Quiz> quizList = dao.select_quizList(title);
			
			ViewerDao vdao=new ViewerDao();
			vdao.insert_ans5(ans,title,name);
			List<Viewer>viewerList = vdao.selectViewer(title,name);
			
			request.setAttribute("quizList", quizList);
			request.setAttribute("starLink", starLink);
			request.setAttribute("viewerList", viewerList);
			
			if(ans.contains("時間")) {
				String res = resp.get(0);
				request.setAttribute("res", res);
//				Audio audio = new Audio();
//				try{
//					audio.audioCollect();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}else {
				String res = resp.get(1);
				request.setAttribute("res", res);
//				Audio audio = new Audio();
//				try{
//					audio.audioUnCollect();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/talk/main4.jsp");
			dispatcher.forward(request, response);
			
		} else if (snowden != null) {
			String title = snowden;
			System.out.println("snowden:" + title);
			QuizDao dao = new QuizDao();
			List<Quiz> quizList = dao.select_quizList(title);
			
			ViewerDao vdao=new ViewerDao();
			vdao.insert_ans5(ans,title,name);
			List<Viewer>viewerList = vdao.selectViewer(title,name);
			
			request.setAttribute("quizList", quizList);
			request.setAttribute("snowden", snowden);
			request.setAttribute("viewerList", viewerList);
			
			if(ans.contains("秘密")) {
				String res = resp.get(0);
				request.setAttribute("res", res);
//				Audio audio = new Audio();
//				try{
//					audio.audioCollect();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}else {
				String res = resp.get(1);
				request.setAttribute("res", res);
//				Audio audio = new Audio();
//				try{
//					audio.audioUnCollect();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/talk/main4.jsp");
			dispatcher.forward(request, response);
		}
		System.out.println("intropost:"+ans);

		

	}
}
