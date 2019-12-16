package br.com.rpg.campaign.campaign.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.campaign.model.Campaign;

@WebServlet("/edit-campaign")
public class EditCampaignServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		System.out.println("[Log] : Servlet new-campaign acessado!");
		System.out.println("[Log] : Cadastrando nova Campanha!");

		String campaignName = req.getParameter("name");
		String dungeonMaster = req.getParameter("dungeonMaster");
		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Campaign campaign = new Campaign();
		campaign = campaign.searchCampaignById(id);
		
		campaign.setCampaignName(campaignName);
		campaign.getDungeonMaster().setUsername(dungeonMaster);

		req.setAttribute("campaign", campaign);
		RequestDispatcher rd = req.getRequestDispatcher("/list-campaign");
		rd.forward(req, res);
		
	}



}
