package br.com.rpg.campaign.campaign.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.campaign.model.Campaign;

@WebServlet(urlPatterns = "/list-campaign")
public class ListCampaignServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private Campaign campaign;
	private List<Campaign> list;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		//chamar o JSP
				RequestDispatcher rd = req.getRequestDispatcher("/campaignList.jsp");
				req.setAttribute("campaignList", Campaign.getLista());
				rd.forward(req, res);

		System.out.println("[Log] : Servlet list-campaign acessado!");

	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public List<Campaign> getList() {
		return list;
	}

	public void setList(List<Campaign> list) {
		this.list = list;
	}

}
