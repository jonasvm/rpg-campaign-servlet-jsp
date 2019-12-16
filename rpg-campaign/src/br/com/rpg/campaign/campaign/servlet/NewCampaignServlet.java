package br.com.rpg.campaign.campaign.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.campaign.model.Campaign;
import br.com.rpg.campaign.user.model.DungeonMaster;
import br.com.rpg.campaign.user.model.User;

@WebServlet("/new-campaign")
public class NewCampaignServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Campaign campaign;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		System.out.println("[Log] : Servlet new-campaign acessado!");
		System.out.println("[Log] : Cadastrando nova Campanha!");

		String campaignName = req.getParameter("name");
		String dungeonMaster = req.getParameter("dungeonMaster");

		DungeonMaster dm = null;

		List<User> lista = new ArrayList<User>();
		lista = User.getLista();
		for (User p : lista) {
			if (p.getUsername().contentEquals(dungeonMaster)) {
				dm = (DungeonMaster) p;
			}
		}

		if (dm.getUsername().isEmpty()) {
			throw new IOException("Dungeon Master não encontrado!");
		}

		Campaign c = new Campaign(dm, campaignName);
		setCampaign(c);

		res.sendRedirect("list-campaign");
		
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

}
