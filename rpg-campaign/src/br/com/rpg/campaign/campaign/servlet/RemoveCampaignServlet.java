package br.com.rpg.campaign.campaign.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.campaign.model.Campaign;

@WebServlet("/remove-campaign")
public class RemoveCampaignServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		System.out.println("[Log] : Servlet remove-campaign acessado!");

		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Campaign campaign = new Campaign();

		if (campaign.removeCampaign(id)) {
			res.sendRedirect("list-campaign");
		}

	}

}
