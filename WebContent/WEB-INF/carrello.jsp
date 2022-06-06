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
<div class="container">
	<body
		class="archive post-type-archive post-type-archive-product woocommerce woocommerce-page">
		<%@ include file="Header.jsp"%>

		<table class="source-tableeditor">
			<tbody>
				<tr>
					<td>PRODOTTO</td>
					<td>IMG</td>
				</tr>

				<!-- Iterator -->
				<s:iterator value="carrello">
					<tr>
						<td>
							<h5>Nome:</h5> <s:property value="p.nome" />
						</td>
						<td rowspan="3"> <img
							src="asset/img-prodotti/<s:property value="p.idprodotto"/>.jpg"
							alt="" style="width: 200px; margin-right: 1px"></td>
					</tr>
					<tr>
						<td><h5>Quantità richiesta :</h5> <s:property
								value="quantRichiesta" /></td>
					</tr>
					<tr>
						<td><h5>Prezzo:</h5> <span class="price"> <span
								class="amount"> <s:property value="p.prezzo" />€</td>
					</tr>
					<tr>
						<!-- COL1 -->
						<td><br> <br> </span></span></td>
						<!-- COL2-->

						<td></td>
					</tr>
				</s:iterator>
				<!-- Iterator fine -->

			</tbody>
		</table>




		<br>
		<a href="Pagamento" class="button">Procedi al pagamento</a>
		
		<br>
		
		<br>
</div>






</div>
<%@ include file="footer.jsp"%>
<script src='js/jquery.js'></script>
<script src='js/plugins.js'></script>
<script src='js/scripts.js'></script>
<script src='js/masonry.pkgd.min.js'></script>
</body>
</html>