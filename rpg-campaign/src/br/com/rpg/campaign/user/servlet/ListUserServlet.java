package br.com.rpg.campaign.user.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.user.model.Player;
import br.com.rpg.campaign.user.model.User;

@WebServlet(urlPatterns = "/list-user")
public class ListUserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private Player player;
	private List<User> list;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		setPlayer(new Player());

		setList(User.getLista());

		//chamar o JSP
				RequestDispatcher rd = req.getRequestDispatcher("/playerList.jsp");
				req.setAttribute("playerList", User.getLista());
				rd.forward(req, res);

		System.out.println("[Log] : Servlet list-user acessado!");

	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

}
