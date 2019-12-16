package br.com.rpg.campaign.campaign.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.campaign.model.Campaign;

@WebServlet("/show-campaign")
public class ShowCampaignServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		System.out.println("[Log] : Servlet show-campaign acessado!");

		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Campaign campaign = new Campaign();
		Campaign target = campaign.searchCampaignById(id);
		
		if(target.getCampaignName().isEmpty()) {
			throw new ServletException("Campanha não encontrada!");
		}
		
		req.setAttribute("campaign", target);
		RequestDispatcher rd = req.getRequestDispatcher("/formEditCampaign.jsp");
		rd.forward(req, res);
	}

}
