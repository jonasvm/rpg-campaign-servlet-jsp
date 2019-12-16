<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/new-player" var="linkNewPlayer" />

<!DOCTYPE html>
<html>
<title>Rpg Campaign</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body, h1, h2, h3, h4, h5, h6 {
	font-family: "Montserrat", sans-serif
}

.w3-row-padding img {
	margin-bottom: 12px
}
/* Set the width of the sidebar to 120px */
.w3-sidebar {
	width: 120px;
	background: #222;
}
/* Add a left margin to the "page content" that matches the width of the sidebar (120px) */
#main {
	margin-left: 120px
}
/* Remove margins from "page content" on small screens */
@media only screen and (max-width: 600px) {
	#main {
		margin-left: 0
	}
}
</style>
<body class="w3-black">

	<!-- Icon Bar (Sidebar - hidden on small screens) -->
	<nav class="w3-sidebar w3-bar-block w3-small w3-hide-small w3-center">
		<!-- Avatar image in top left corner -->
		<img src="images/rpg-mesa.jpg" style="width: 100%"> <a
			href="/rpg-campaign"
			class="w3-bar-item w3-button w3-padding-large w3-black"> <i
			class="fa fa-home w3-xxlarge"></i>
			<p>HOME</p>
		</a> <a href="/rpg-campaign/user.jsp"
			class="w3-bar-item w3-button w3-padding-large w3-hover-black"> <i
			class="fa fa-user w3-xxlarge"></i>
			<p>USUÁRIOS</p>
		</a> <a href="/rpg-campaign/campaign.jsp"
			class="w3-bar-item w3-button w3-padding-large w3-hover-black"> <i
			class="fa fa-eye w3-xxlarge"></i>
			<p>CAMPANHA</p>
		</a> <a href="#contact"
			class="w3-bar-item w3-button w3-padding-large w3-hover-black"> <i
			class="fa fa-envelope w3-xxlarge"></i>
			<p>CONTATO</p>
		</a>
	</nav>

	<!-- Navbar on small screens (Hidden on medium and large screens) -->
	<div class="w3-top w3-hide-large w3-hide-medium" id="myNavbar">
		<div
			class="w3-bar w3-black w3-opacity w3-hover-opacity-off w3-center w3-small">
			<a href="/rpg-campaign" class="w3-bar-item w3-button"
				style="width: 25% !important">HOME</a> <a
				href="/rpg-campaign/user.jsp" class="w3-bar-item w3-button"
				style="width: 25% !important">USUÁRIOS</a> <a
				href="/rpg-campaign/campaign.jsp" class="w3-bar-item w3-button"
				style="width: 25% !important">CAMPANHA</a> <a href="#contact"
				class="w3-bar-item w3-button" style="width: 25% !important">CONTATO</a>
		</div>
	</div>

	<!-- Page Content -->
	<div class="w3-padding-large" id="main">
		<!-- Header/Home -->
		<header class="w3-container w3-padding-32 w3-center w3-black"
			id="home">
			<h1 class="w3-jumbo">
				<span class="w3-hide-small">RPG Campaign 
			</h1>
			<p>Gerenciador de campanhas de RPG para o sitema 3D&T.</p>
		</header>

		<!-- How to use Section -->
		<div class="w3-content w3-justify w3-text-grey w3-padding-64"
			id="about">
			<h2 class="w3-text-light-grey">Cadastro de Jogador</h2>
			<hr style="width: 200px" class="w3-opacity">
			<form action="${linkNewPlayer}" method="post">
				<table>
					<tr>
						<td width="20%"></td>
						<td width="30%">Nome:</td>
						<td width="50%"><input type="text" name="name"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Email:</td>
						<td width="50%"><input type="text" name="email"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Senha:</td>
						<td width="50%"><input type="password" name="password"></td>
					</tr>
					<tr>
						<td colspan="3"><hr></td>
					</tr>
					<tr>
						<td colspan="3"><h2 class="w3-text-light-grey">Ficha do
								Personagem</h2>
							<hr style="width: 200px" class="w3-opacity"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Nome do Personagem:</td>
						<td width="50%"><input type="text" name="characterName"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Pontos:</td>
						<td width="50%"><input type="text" name="points"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Força:</td>
						<td width="50%"><input type="text" name="strength"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Habilidade:</td>
						<td width="50%"><input type="text" name="dexterity"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Resistência:</td>
						<td width="50%"><input type="text" name="endurance"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Armadura:</td>
						<td width="50%"><input type="text" name="armor"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Poder de Fogo:</td>
						<td width="50%"><input type="text" name="firepower"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Level:</td>
						<td width="50%"><input type="text" name="level"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Pontos de Vida:</td>
						<td width="50%"><input type="text" name="hitPoints"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Pontos de Magia:</td>
						<td width="50%"><input type="text" name="magicPoints"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Vantagens:</td>
						<td width="50%"><input type="text" name="advantages"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Desvantagens:</td>
						<td width="50%"><input type="text" name="disadvantages"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Tipos de Dano:</td>
						<td width="50%"><input type="text" name="damageTypes"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Magias Conhecidas:</td>
						<td width="50%"><input type="text" name="knownSpells"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%">Dinheiro e Itens:</td>
						<td width="50%"><input type="text" name="moneyAndItems"></td>
					</tr>
					<tr>
						<td width="20%"></td>
						<td width="30%"></td>
						<td width="50%" align="right"><br> <input type="submit"
							value="Cadastrar"></td>
					</tr>
				</table>
			</form>
			<%
				System.out.println("[Log] : Página formNewPlayer acessada!");
			%>
			<!-- End About Section -->
		</div>

		<!-- Footer -->
		<footer class="w3-content w3-padding-64 w3-text-grey w3-xlarge">
			<i class="fa fa-facebook-official w3-hover-opacity"></i> <i
				class="fa fa-instagram w3-hover-opacity"></i> <i
				class="fa fa-snapchat w3-hover-opacity"></i> <i
				class="fa fa-pinterest-p w3-hover-opacity"></i> <i
				class="fa fa-twitter w3-hover-opacity"></i> <i
				class="fa fa-linkedin w3-hover-opacity"></i>
			<p class="w3-medium">
				Powered by <a href="https://www.w3schools.com/w3css/default.asp"
					target="_blank" class="w3-hover-text-green">w3.css</a>
			</p>
			<!-- End footer -->
		</footer>

		<!-- END PAGE CONTENT -->
	</div>

</body>
</html>
