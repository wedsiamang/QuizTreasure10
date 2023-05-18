package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import model.Quiz;

public class QuizDao {
	
	
	ResourceBundle	rb = ResourceBundle.getBundle("heroku");

	
	public List<Quiz> select_quizList(String title) {
		

			// conn = null;
			// st = null;
			ResultSet rs = null;

			List<Quiz>quizList=new ArrayList<Quiz>();
			Quiz q = new Quiz();
			// start、endタイム表記が出力用YYYY-MM-DD HH:MI
			String sql = "SELECT* FROM quiz where title=?";

			try {
				Class.forName("org.postgresql.Driver");
			} catch (Exception e) {
				e.printStackTrace();
			}
			try (Connection conn = DriverManager.getConnection(rb.getString("jdbc_url"), rb.getString("db_user"),
					rb.getString("db_pass"));

					PreparedStatement st = conn.prepareStatement(sql);) {

				// properties.load(s);

				// conn.setAutoCommit(false);
				st.setString(1, title);
				


				// SELECT文を実行
				rs = st.executeQuery();

				// SELECT文の結果をARRAYLIST に格納
				while (rs.next()) {

					int id = rs.getInt("id");
					title = rs.getString("title");
					String opening = rs.getString("opening");
					String intro = rs.getString("intro");
					String main1 = rs.getString("main1");
					String main2 = rs.getString("main2");
					String main3 = rs.getString("main3");
					String main4 = rs.getString("main4");
					String main5 = rs.getString("main5");
					String quiz = rs.getString("quiz");
					String answer = rs.getString("answer");
					String treasure = rs.getString("treasure");
					
					System.out.println("dao"+opening);
					

					q = new Quiz(id, title, opening,intro,main1,main2,main3,main4,
							main5, quiz,answer,treasure);
					// conn.commit();
					quizList.add(q);

				}
				return quizList;
			} catch (SQLException e) {
				System.out.println("SQLの例外が発生しました");
				e.printStackTrace();
			} catch (MissingResourceException e) {
			}
			return quizList;
		}	
		
	}
	
	
	

