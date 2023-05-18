package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.GameDao;
import model.Game;
import model.UserName;

/**
 * Servlet implementation class GameServlet
 */
@WebServlet("/GameServlet")
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GameServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
		String name = usr.getName();
		String ran2num6 = request.getParameter("ran2num6");
		String ran3num3 = request.getParameter("ran3num3");
		String ran3num6 = request.getParameter("ran3num6");
		String ran3num9 = request.getParameter("ran3num9");

		int id = 0;
		// id=Integer.parseInt(request.getParameter("id"));
		System.out.println("servletid:" + id);
		
		int count = 0;
		int hit = 0;
		int blow = 0;
		count = (int) session.getAttribute("count");
		int one = Integer.parseInt(request.getParameter("one"));
		int two = Integer.parseInt(request.getParameter("two"));
		int three = 0;

		int[] input = { one, two, three }; // 入力した数字が入る
		// 入力値をプロパティに設定
		Game game = new Game();
		// コンピュータの答えと入力値の一致を判定

		if (ran2num6 != null) {
			
			int answerLength=2;
			int[] ranNum = (int[]) session.getAttribute("random");
			session.setAttribute("ranNum", ranNum);
			// System.out.println("servletcount:" + count);
			System.out.println("gameservlet:inp:" + input[0] + input[1] );
			System.out.println("gameservlet:ans:" + ranNum[0] + ranNum[1] );
			int numA = ranNum[0];
			int numB = ranNum[1];
			// int numC = ranNum[2];
			// コンピュータと入力値の完全一致
			if (numA == one) {
				hit++;
			}
			if (numB == two) {
				hit++;
			}
			if (numB == one) {
				blow++;
			}
			if (numA == two) {
				blow++;
			}
			count++;
			Game g = new Game();
			GameDao dao = new GameDao();
			dao.insert_gameRan2(count, numA, numB, one, two, hit, blow, name);

			List<Game> gameList = dao.gameList(name);
			request.setAttribute("gameList", gameList);
			session.setAttribute("count", count);
			System.out.println("servletcount:" + count);

			if (hit == answerLength) {
				String msg = "";
				System.out.println("CLEARED!!");
				msg += "CLEARED!!";
				request.setAttribute("msg", msg);

				Game ans = dao.selectGameList(count, name);
				request.setAttribute("ans", ans);
				request.setAttribute("ran2num6", ran2num6);

				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/game/gameClear.jsp");
				dispatcher.forward(request, response);

			} else {
				request.setAttribute("ran2num6", ran2num6);
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/game/gameRetry.jsp");
				dispatcher.forward(request, response);
			}
		}
		if (ran3num3 != null) {
			int answerLength=3;
			three = Integer.parseInt(request.getParameter("three"));
			int[] ranNum = (int[]) session.getAttribute("random");
			session.setAttribute("ranNum", ranNum);
			// System.out.println("servletcount:" + count);

			System.out.println("gameservlet:inp:" + input[0] + input[1] + input[2]);
			System.out.println("gameservlet:ans:" + ranNum[0] + ranNum[1] + ranNum[2]);
			int numA = ranNum[0];
			int numB = ranNum[1];
			int numC = ranNum[2];
			// コンピュータと入力値の完全一致
			if (numA == one) {
				hit++;
			}
			if (numB == two) {
				hit++;
			}
			if (numC == three) {
				hit++;
			}
			if (numB == one) {
				blow++;
			}
			if (numC == one) {
				blow++;
			}
			if (numA == two) {
				blow++;
			}
			if (numC == two) {
				blow++;
			}
			if (numA == three) {
				blow++;
			}
			if (numB == three) {
				blow++;
			}
			count++;

			Game g = new Game();
			GameDao dao = new GameDao();
			dao.insert_gameRan3(count, numA, numB, numC, one, two, three, hit, blow, name);
			List<Game> gameList = dao.gameList(name);
			request.setAttribute("gameList", gameList);
			session.setAttribute("count", count);
			System.out.println("servletcount:" + count);

			if (hit == answerLength) {
				String msg = "";
				System.out.println("CLEARED!!");
				msg += "CLEARED!!";
				request.setAttribute("msg", msg);

				Game ans = dao.selectGameList(count, name);
				request.setAttribute("ans", ans);
				request.setAttribute("run3num3", ran3num3);
				// 正解した時のイベント表示
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/game/gameClear.jsp");
				dispatcher.forward(request, response);

			} else {
				request.setAttribute("run3num3", ran3num3);
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/game/gameRetry.jsp");
				dispatcher.forward(request, response);
			}
		} else if (ran3num6 != null) {
			int answerLength=3;
			three = Integer.parseInt(request.getParameter("three"));
			int[] ranNum = (int[]) session.getAttribute("random");
			session.setAttribute("ranNum", ranNum);
			// System.out.println("servletcount:" + count);

			System.out.println("gameservlet:inp:" + input[0] + input[1] + input[2]);
			System.out.println("gameservlet:ans:" + ranNum[0] + ranNum[1] + ranNum[2]);
			int numA = ranNum[0];
			int numB = ranNum[1];
			int numC = ranNum[2];
			// コンピュータと入力値の完全一致
			if (numA == one) {
				hit++;
			}
			if (numB == two) {
				hit++;
			}
			if (numC == three) {
				hit++;
			}
			if (numB == one) {
				blow++;
			}
			if (numC == one) {
				blow++;
			}
			if (numA == two) {
				blow++;
			}
			if (numC == two) {
				blow++;
			}
			if (numA == three) {
				blow++;
			}
			if (numB == three) {
				blow++;
			}
			count++;

			Game g = new Game();
			GameDao dao = new GameDao();
			dao.insert_gameRan3(count, numA, numB, numC, one, two, three, hit, blow, name);
			List<Game> gameList = dao.gameList(name);
			request.setAttribute("gameList", gameList);
			session.setAttribute("count", count);
			System.out.println("servletcount:" + count);

			if (hit == answerLength) {
				String msg = "";
				System.out.println("CLEARED!!");
				msg += "CLEARED!!";
				request.setAttribute("msg", msg);

				Game ans = dao.selectGameList(count, name);
				request.setAttribute("ans", ans);
				request.setAttribute("ran3num6", ran3num6);
				// 正解した時のイベント表示
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/game/gameClear.jsp");
				dispatcher.forward(request, response);

			} else {
				request.setAttribute("ran3num6", ran3num6);
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/game/gameRetry.jsp");
				dispatcher.forward(request, response);
			}
		} else if (ran3num9 != null) {
			int answerLength=3;
			three = Integer.parseInt(request.getParameter("three"));
			int[] ranNum = (int[]) session.getAttribute("random");
			session.setAttribute("ranNum", ranNum);
			// System.out.println("servletcount:" + count);

			System.out.println("gameservlet:inp:" + input[0] + input[1] + input[2]);
			System.out.println("gameservlet:ans:" + ranNum[0] + ranNum[1] + ranNum[2]);
			int numA = ranNum[0];
			int numB = ranNum[1];
			int numC = ranNum[2];
			// コンピュータと入力値の完全一致
			if (numA == one) {
				hit++;
			}
			if (numB == two) {
				hit++;
			}
			if (numC == three) {
				hit++;
			}
			if (numB == one) {
				blow++;
			}
			if (numC == one) {
				blow++;
			}
			if (numA == two) {
				blow++;
			}
			if (numC == two) {
				blow++;
			}
			if (numA == three) {
				blow++;
			}
			if (numB == three) {
				blow++;
			}
			count++;

			Game g = new Game();
			GameDao dao = new GameDao();
			dao.insert_gameRan3(count, numA, numB, numC, one, two, three, hit, blow, name);
			List<Game> gameList = dao.gameList(name);
			request.setAttribute("gameList", gameList);
			session.setAttribute("count", count);
			System.out.println("servletcount:" + count);

			if (hit == answerLength) {
				String msg = "";
				System.out.println("CLEARED!!");
				msg += "CLEARED!!";
				request.setAttribute("msg", msg);

				Game ans = dao.selectGameList(count, name);
				request.setAttribute("ans", ans);
				request.setAttribute("ran3num9", ran3num9);
				// 正解した時のイベント表示
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/game/gameClear.jsp");
				dispatcher.forward(request, response);

			} else {
				request.setAttribute("ran3num9", ran3num9);
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/game/gameRetry.jsp");
				dispatcher.forward(request, response);
			}
		}

	}
}
