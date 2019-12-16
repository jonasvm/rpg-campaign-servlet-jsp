package br.com.rpg.campaign.user.servlet;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rpg.campaign.user.model.Player;

@WebServlet("/edit-player")
public class EditPlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		System.out.println("[Log] : Servlet edit-player acessado!");
		System.out.println("[Log] : Editando jogador!");

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		String characterName = req.getParameter("characterName");
		int points = Integer.parseInt(req.getParameter("points"));
		int strength = Integer.parseInt(req.getParameter("strength"));
		int dexterity = Integer.parseInt(req.getParameter("dexterity"));
		int endurance = Integer.parseInt(req.getParameter("endurance"));
		int armor = Integer.parseInt(req.getParameter("armor"));
		int firepower = Integer.parseInt(req.getParameter("firepower"));
		int level = Integer.parseInt(req.getParameter("level"));
		int hitPoints = Integer.parseInt(req.getParameter("hitPoints"));
		int magicPoints = Integer.parseInt(req.getParameter("magicPoints"));
		Set<String> advantages = new HashSet<String>();
		advantages.add(req.getParameter("advantages"));
		Set<String> disadvantages = new HashSet<String>();
		disadvantages.add(req.getParameter("disadvantages"));
		Set<String> damageTypes = new HashSet<String>();
		damageTypes.add(req.getParameter("damageTypes"));
		Set<String> knownSpells = new HashSet<String>();
		knownSpells.add(req.getParameter("knownSpells"));
		Set<String> moneyAndItems = new HashSet<String>();
		moneyAndItems.add(req.getParameter("moneyAndItems"));
		
		String paramId = req.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Player player = new Player();
		player = (Player) player.searchUserById(id);
		
		player.setUsername(name);
		player.setEmail(email);
		player.setPassword(password);
		
		player.getCharacter().setName(characterName);
		player.getCharacter().setPoints(points);
		player.getCharacter().setStrength(strength);
		player.getCharacter().setDexterity(dexterity);
		player.getCharacter().setEndurance(endurance);
		player.getCharacter().setArmor(armor);
		player.getCharacter().setFirePower(firepower);
		player.getCharacter().setLevel(level);
		player.getCharacter().setHitPoints(hitPoints);
		player.getCharacter().setMagicPoints(magicPoints);
		
		res.sendRedirect("list-user");
	}

}
