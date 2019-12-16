package br.com.rpg.campaign.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.user.model.Player;

@WebServlet("/remove-user")
public class RemoveUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("[Log] : Servlet remove-user acessado!");
		
		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Player player = new Player();
		
		if(player.removeUser(id)) {
			res.sendRedirect("list-user");
		}
		
	}

}
