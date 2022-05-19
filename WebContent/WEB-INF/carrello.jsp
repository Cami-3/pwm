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
					<td rowspan="1">RIEPILOGO</td>
				</tr>

				<!-- Iterator -->
				<s:iterator value="carrello">
					<tr>
						<td><a href="ShoeDescription?id=<s:property value="p.idprodotto"/>"> <s:property value="p.nome" /> </a> <br> <s:property
								value="quantRichiesta" /> <br> <span class="price">
								<span class="amount"> <s:property value="p.prezzo" />€ </td>
					</tr>
				</s:iterator>
				<!-- Iterator fine -->
				</tr>
			</tbody>
		</table>




		<br>
		<a href="#" class="button">Procedi al pagamento</a>
</div>






</div>
<%@ include file="footer.jsp"%>
<script src='js/jquery.js'></script>
<script src='js/plugins.js'></script>
<script src='js/scripts.js'></script>
<script src='js/masonry.pkgd.min.js'></script>
</body>
</html>