package br.com.rpg.campaign.user.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.user.model.DungeonMaster;
import br.com.rpg.campaign.user.model.Player;
import br.com.rpg.campaign.user.model.User;

@WebServlet("/show-user")
public class ShowUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		System.out.println("[Log] : Servlet user-details acessado!");

		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		Player userTarget = null;
		DungeonMaster dmTarget = null;
		RequestDispatcher rd;

		User user = new Player();
		User dm = new DungeonMaster();
		if (user.getClass() == user.searchUserById(id).getClass()) {
			userTarget = (Player) user.searchUserById(id);
			req.setAttribute("user", userTarget);
			rd = req.getRequestDispatcher("/formEditPlayer.jsp");
		} else {
			dmTarget = (DungeonMaster) dm.searchUserById(id);
			req.setAttribute("dm", dmTarget);
			rd = req.getRequestDispatcher("/formEditDm.jsp");
		}

//		if (dmTarget.getUsername().isEmpty() && userTarget.getUsername().isEmpty()) {
//			throw new ServletException("Usuário não encontrado!");
//		}

		rd.forward(req, res);
	}

}
