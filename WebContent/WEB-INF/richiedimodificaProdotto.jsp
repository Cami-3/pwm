<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en-US">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Moschino | Minimalist Free HTML Portfolio by
	WowThemes.net</title>
<link rel='stylesheet' href='css/woocommerce-layout.css' type='text/css'
	media='all' />
<link rel='stylesheet' href='css/woocommerce-smallscreen.css'
	type='text/css' media='only screen and (max-width: 768px)' />
<link rel='stylesheet' href='css/woocommerce.css' type='text/css'
	media='all' />
<link rel='stylesheet' href='css/font-awesome.min.css' type='text/css'
	media='all' />
<link rel='stylesheet' href='style.css' type='text/css' media='all' />
<link rel='stylesheet'
	href='https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500,700%7CHerr+Von+Muellerhoff:400,500,700%7CQuattrocento+Sans:400,500,700'
	type='text/css' media='all' />
<link rel='stylesheet' href='css/easy-responsive-shortcodes.css'
	type='text/css' media='all' />
</head>
<body
	class="archive post-type-archive post-type-archive-product woocommerce woocommerce-page">
	<%@ include file="Header.jsp"%>

	<div class="container">
		<div id="regLogin"
			style="width: 100%; text-align: left; margin-top: 10%;">
			<h2>Area titolare: Modifica un prodotto</h2>

			<!-- DENTRO IL FORM CI VANNO SOLO I DATI DA MANDARE ALLA PAGINA SUCCESSIVA -->
			<div>
				<s:form action="IncrementaProdotto" method="post" theme="simple">
					<%-- 				<s:hidden name="p1.idprodotto" value="%{pA.idprodotto}"/> --%>
					<!-- CON QUESTA DICHIARAZIONE APRI UN FORM -->


					<div>
						<!-- Ogni volta che dovete aggiungere un parametro al form, copiate da questa riga fino alla chiusura del div (</div> - riga 45) e adattate i parametri, mi raccomando la dicitura p. -->
						<label> Nome: </label>
						<s:textfield name="p2.nome" value="%{pM.nome}"></s:textfield>
						<%-- 						<s:hidden name="p1.nome" value="%{pM.nome}" /> --%>
					</div>
					<br>

					<div>
						<label> Marca: </label>

						<s:textfield name="p2.marca" value="%{pM.marca}"></s:textfield>

					</div>
					<br>

					<div>
						<label> Genere: </label>
						<s:textfield name="p2.genere" value="%{pM.genere}"></s:textfield>

					</div>
					<br>

					<div>
						<label> Prezzo: </label>
						<s:textfield name="p2.prezzo" value="%{pM.prezzo}"></s:textfield>

					</div>
					<br>

					<div>
						<label> Taglia: </label>
						<s:textfield name="p2.taglia" value="%{pM.taglia}"></s:textfield>
					</div>


					<br>

					<div>
						<label> Colore: </label>
						<s:textfield name="p2.colore" value="%{pM.colore}"></s:textfield>

					</div>
					<br>

					<div>
						<label> tipoCliente: </label>
						<s:textfield name="p2.tipoCliente" value="%{pM.tipoCliente}"></s:textfield>

					</div>
					<br>
					<!-- 					<div>  -->
					<!-- 						<label> Quantità: </label> -->
					<%-- 						<s:textfield name="p.quantita" /> --%>
					<!-- 					</div> -->

					<div>
						<label> Quantità: </label>
						<s:textfield name="p2.quantita" value="%{pM.quantita}"></s:textfield>
					</div>
<br>
					<button type="submit">Aggiungi</button>
					<!-- CON SUBMIT MANDI I DATI DEL FORM ALLA ACTION -->
				</s:form>
				<!-- CON QUESTA DICHIARAZIONE CHIUDI UN FORM -->
			</div>

		</div>
	</div>










	<%@ include file="footer.jsp"%>
	<script src='js/jquery.js'></script>
	<script src='js/plugins.js'></script>
	<script src='js/scripts.js'></script>
	<script src='js/masonry.pkgd.min.js'></script>
</body>
</html>