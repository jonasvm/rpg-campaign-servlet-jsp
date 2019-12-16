package br.com.rpg.campaign.user.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.user.model.DungeonMaster;

@WebServlet("/new-dm")
public class NewDungeonMasterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		System.out.println("[Log] : Servlet new-dm acessado!");
		System.out.println("[Log] : Cadastrando novo Dungeon Master!");

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		DungeonMaster dm = new DungeonMaster(name, email, password);

		res.sendRedirect("list-user");
	}

}
