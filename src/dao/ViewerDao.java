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

import model.Viewer;

public class ViewerDao {
	
	
	ResourceBundle	rb = ResourceBundle.getBundle("heroku");
	
	
	public void talkReset(String name) {

		String sql = "Delete From viewer where name=?";

		try {
			Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(rb.getString("jdbc_url"), rb.getString("db_user"),
				rb.getString("db_pass"));
	
				
				
				PreparedStatement st = conn.prepareStatement(sql);) {
			 st.setString(1, name);

			st.executeUpdate();

			// conn.commit();
		} catch (SQLException e) {
			System.out.println("SQLの例外が発生しました");
			e.printStackTrace();
		} catch (MissingResourceException e) {
			e.printStackTrace();
		}
	}
	
	
	public Viewer  selectName(String name,String title) {

		// conn = null;
		// st = null;
		ResultSet rs = null;

	//	List<Game> gameList = new ArrayList<Game>();
		Viewer v = new Viewer();
		// start、endタイム表記が出力用YYYY-MM-DD HH:MI
		String sql = "SELECT name FROM Viewer where title=? and name=?";

		try {
			Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(rb.getString("jdbc_url"), rb.getString("db_user"),
				rb.getString("db_pass"));
	
				PreparedStatement st = conn.prepareStatement(sql);) {

			st.setString(1, title);
			st.setString(2, name);

			// properties.load(s);

			// conn.setAutoCommit(false);

			// SELECT文を実行
			rs = st.executeQuery();

			// SELECT文の結果をARRAYLIST に格納
			while (rs.next()) {

				
				 name = rs.getString("name");
				
				
				
				System.out.println("daoname:" + name);
				v = new Viewer(name);
				// conn.commit();
		//		gameList.add(g);

			}
			return v;
		} catch (SQLException e) {
			System.out.println("SQLの例外が発生しました");
			e.printStackTrace();
		} catch (MissingResourceException e) {
		}
		return v;
	}
	

	public void insert_name( String name,String title) {

		Viewer viewer = new Viewer();
		String sql = "Insert into viewer (name,title)values(?,?)";

		try {
			Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(rb.getString("jdbc_url"), rb.getString("db_user"),
				rb.getString("db_pass"));

				PreparedStatement st = conn.prepareStatement(sql);) {

			
			
			st.setString(1, name);
			st.setString(2, title);

			st.executeUpdate();

			// conn.commit();
			//System.out.println("updatedao:"+ans);

		} catch (SQLException e) {
			System.out.println("SQLの例外が発生しました");
			e.printStackTrace();
		} catch (MissingResourceException e) {
			e.printStackTrace();
		}
	}
	public void update_ans1(String ans,String title,String name) {

		Viewer viewer = new Viewer();
		String sql = "UPDATE viewer SET ans1=? where title=? and name=? ";

		try {
			Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(rb.getString("jdbc_url"), rb.getString("db_user"),
				rb.getString("db_pass"));

				PreparedStatement st = conn.prepareStatement(sql);) {

			st.setString(1, ans);
			st.setString(2,title);
			st.setString(3, name);

			st.executeUpdate();

			// conn.commit();
			System.out.println("updatedao:"+ans);

		} catch (SQLException e) {
			System.out.println("SQLの例外が発生しました");
			e.printStackTrace();
		} catch (MissingResourceException e) {
			e.printStackTrace();
		}
	}
	public void insert_ans2(String ans,String title,String name) {

		Viewer viewer = new Viewer();
		String sql = "UPDATE viewer SET ans2=? where title=? and name=?";

		try {
			Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(rb.getString("jdbc_url"), rb.getString("db_user"),
				rb.getString("db_pass"));

				PreparedStatement st = conn.prepareStatement(sql);) {

			st.setString(1, ans);
			st.setString(2, title);
			st.setString(3,name);

			st.executeUpdate();

			// conn.commit();
			System.out.println("updatedao:"+ans);

		} catch (SQLException e) {
			System.out.println("SQLの例外が発生しました");
			e.printStackTrace();
		} catch (MissingResourceException e) {
			e.printStackTrace();
		}
	}
	public void insert_ans3(String ans,String title,String name) {

		Viewer viewer = new Viewer();
		String sql = "UPDATE viewer SET ans3=? where title=? and name=?";

		try {
			Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(rb.getString("jdbc_url"), rb.getString("db_user"),
				rb.getString("db_pass"));

				PreparedStatement st = conn.prepareStatement(sql);) {

			st.setString(1, ans);
			st.setString(2, title);
			st.setString(3, name);

			st.executeUpdate();

			// conn.commit();
			System.out.println("updatedao:"+ans);

		} catch (SQLException e) {
			System.out.println("SQLの例外が発生しました");
			e.printStackTrace();
		} catch (MissingResourceException e) {
			e.printStackTrace();
		}
	}
	public void insert_ans4(String ans,String title,String name) {

		Viewer viewer = new Viewer();
		String sql = "UPDATE viewer SET ans4=? where title=? and name=?";

		try {
			Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(rb.getString("jdbc_url"), rb.getString("db_user"),
				rb.getString("db_pass"));

				PreparedStatement st = conn.prepareStatement(sql);) {

			st.setString(1, ans);
			st.setString(2, title);
			st.setString(3, name);

			st.executeUpdate();

			// conn.commit();
			System.out.println("updatedao:"+ans);

		} catch (SQLException e) {
			System.out.println("SQLの例外が発生しました");
			e.printStackTrace();
		} catch (MissingResourceException e) {
			e.printStackTrace();
		}
	}
	public void insert_ans5(String ans,String title,String name) {

		Viewer viewer = new Viewer();
		String sql = "UPDATE viewer SET ans5=? where title=? and name=?";

		try {
			Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(rb.getString("jdbc_url"), rb.getString("db_user"),
				rb.getString("db_pass"));

				PreparedStatement st = conn.prepareStatement(sql);) {

			st.setString(1, ans);
			st.setString(2, title);
			st.setString(3, name);

			st.executeUpdate();

			// conn.commit();
			System.out.println("updatedao:"+ans);

		} catch (SQLException e) {
			System.out.println("SQLの例外が発生しました");
			e.printStackTrace();
		} catch (MissingResourceException e) {
			e.printStackTrace();
		}
	}
	public void insert_ans6(String ans,String title,String name) {

		Viewer viewer = new Viewer();
		String sql = "UPDATE viewer SET ans6=? where title=? and name=?";

		try {
			Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(rb.getString("jdbc_url"), rb.getString("db_user"),
				rb.getString("db_pass"));

				PreparedStatement st = conn.prepareStatement(sql);) {

			st.setString(1, ans);
			st.setString(2, title);
			st.setString(3, name);

			st.executeUpdate();

			// conn.commit();
			System.out.println("updatedao:"+ans);

		} catch (SQLException e) {
			System.out.println("SQLの例外が発生しました");
			e.printStackTrace();
		} catch (MissingResourceException e) {
			e.printStackTrace();
		}
	}
	public void insert_ans7(String ans,String title,String name) {

		Viewer viewer = new Viewer();
		String sql = "UPDATE viewer SET ans7=? where title=? and name=?";

		try {
			Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(rb.getString("jdbc_url"), rb.getString("db_user"),
				rb.getString("db_pass"));

				PreparedStatement st = conn.prepareStatement(sql);) {

			st.setString(1, ans);
			st.setString(2, title);
			st.setString(3, name);

			st.executeUpdate();

			// conn.commit();
			System.out.println("updatedao:"+ans);

		} catch (SQLException e) {
			System.out.println("SQLの例外が発生しました");
			e.printStackTrace();
		} catch (MissingResourceException e) {
			e.printStackTrace();
		}
	}
	public void insert_ans8(String ans,String title,String name) {

		Viewer viewer = new Viewer();
		String sql = "UPDATE viewer SET ans8=? where title=? and name=?";

		try {
			Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(rb.getString("jdbc_url"), rb.getString("db_user"),
				rb.getString("db_pass"));

				PreparedStatement st = conn.prepareStatement(sql);) {

			st.setString(1, ans);
			st.setString(2, title);
			st.setString(3, name);

			st.executeUpdate();

			// conn.commit();
			System.out.println("updatedao:"+ans);

		} catch (SQLException e) {
			System.out.println("SQLの例外が発生しました");
			e.printStackTrace();
		} catch (MissingResourceException e) {
			e.printStackTrace();
		}
	}
	public void insert_ans9(String ans,String title,String name) {

		Viewer viewer = new Viewer();
		String sql = "UPDATE viewer SET ans9=? where title=? and name=?";

		try {
			Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(rb.getString("jdbc_url"), rb.getString("db_user"),
				rb.getString("db_pass"));

				PreparedStatement st = conn.prepareStatement(sql);) {

			st.setString(1, ans);
			st.setString(2, title);
			st.setString(3, name);

			st.executeUpdate();

			// conn.commit();
			System.out.println("updatedao:"+ans);

		} catch (SQLException e) {
			System.out.println("SQLの例外が発生しました");
			e.printStackTrace();
		} catch (MissingResourceException e) {
			e.printStackTrace();
		}
	}
	public void insert_ans(String ans,String title,String name) {

		Viewer viewer = new Viewer();
		String sql = "UPDATE viewer SET ans1=? where title=? and name=?";

		try {
			Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(rb.getString("jdbc_url"), rb.getString("db_user"),
				rb.getString("db_pass"));

				PreparedStatement st = conn.prepareStatement(sql);) {

			st.setString(1, ans);
			st.setString(2, title);
			st.setString(3, name);

			st.executeUpdate();

			// conn.commit();
			System.out.println("updatedao:"+ans);

		} catch (SQLException e) {
			System.out.println("SQLの例外が発生しました");
			e.printStackTrace();
		} catch (MissingResourceException e) {
			e.printStackTrace();
		}
	}
	
	
	public List<Viewer> selectViewer(String title,String inputName) {
		

			// conn = null;
			// st = null;
			ResultSet rs = null;

			List<Viewer>viewerList=new ArrayList<Viewer>();
			Viewer v = new Viewer();
			// start、endタイム表記が出力用YYYY-MM-DD HH:MI
			String sql = "SELECT* FROM viewer where title=? and name=?";

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
				st.setString(2, inputName);


				// SELECT文を実行
				rs = st.executeQuery();

				// SELECT文の結果をARRAYLIST に格納
				while (rs.next()) {

					int id = rs.getInt("id");
					title=rs.getString("title");
					String ans1 = rs.getString("ans1");
					String ans2 = rs.getString("ans2");
					String ans3 = rs.getString("ans3");
					String ans4 = rs.getString("ans4");
					String ans5 = rs.getString("ans5");
					String ans6 = rs.getString("ans6");
					String ans7 = rs.getString("ans7");
					String ans8 = rs.getString("ans8");
					String ans9 = rs.getString("ans9");
					String name=rs.getString("name");
					
					
					System.out.println("dao ans1:"+ans1);
					

					v = new Viewer(id,title, ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,name);
					// conn.commit();
					viewerList.add(v);

				}
				return viewerList;
			} catch (SQLException e) {
				System.out.println("SQLの例外が発生しました");
				e.printStackTrace();
			} catch (MissingResourceException e) {
			}
			return viewerList;
		}	
		
	}
	
	
	

