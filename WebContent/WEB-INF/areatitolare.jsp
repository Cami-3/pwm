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

<!-- Container Fluid-->
		<div class="container-fluid" id="container-wrapper">
			<div
				class="d-sm-flex align-items-center justify-content-between mb-4">
				<h1 class="h3 mb-0 text-gray-800">Area Personale</h1>

			</div>

			<div class="row">
				<div class="col-lg-12">
					
							<div class="table-responsive p-3">
								<div class="table-responsive">
									<table class="table align-items-center table-flush table-hover"
										id="dataTableHover">
										<thead class="thead-light">
								
										</thead>
										<tbody>

										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>

				</div>

				<div class="col-lg-4">
					<!-- Pannello dati personali sulla destra -->
					<div class="card mb-4">
						<div
							class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
							<h6 style="font-size: 25px; color: black"; class="m-0 font-weight-bold text-primary">Dati personali</h6>
						</div>
						<div class="card-body">
						
						<table>
    <tr>
        <td style="font-size: 18px; color: black">Nome:&nbsp &nbsp<s:property  value="titolare.nome" /></td>
    </tr>
    <tr>
        <td style="font-size: 18px; color: black">Cognome:&nbsp &nbsp <s:property value="titolare.cognome" /></td>
     
    </tr>
    <tr>
        <td style="font-size: 18px; color: black">Email:&nbsp &nbsp<s:property value="account.email" /></td>
      
    </tr>
    <tr>
        <td style="font-size: 18px; color: black">Numero Telefono:&nbsp &nbsp<s:property value="account.numero" /></td>
       
    </tr>
    <tr>
        <td style="font-size: 18px; color: black" >Codice Fiscale:&nbsp &nbsp<s:property value="titolare.CF" /></td>
        
    </tr>
    
</table>
							

				<!-- Input Group -->
				<div class="col-lg-8">

					<div class="card mb-4">
						
							
							<div class="form-group">
								
								<!-- CHIEDERE A TOTO DELLA ACTION Inserisciprenota  -->
									<s:hidden name="cliente.idcliente" value="%{cliente.idcliente}" />
									
										<s:fielderror name="descrizione"></s:fielderror>
										<button style="background-color:black; border-color:black; color:white">Visualizza Ordini</button>
										<a href="richiediAggiungiProdotto"><button style="background-color:black; border-color:black; color:white">Aggiungi un prodotto</button></a>
										<a href="VisualizzaProdotti"><button style="background-color:black; border-color:black; color:white">Visualizza prodotti</button></a>
										 <br>
										 <br>
									

							
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>

</body>


	</div>

	<%@ include file="footer.jsp"%>
	<script src='js/jquery.js'></script>
	<script src='js/plugins.js'></script>
	<script src='js/scripts.js'></script>
	<script src='js/masonry.pkgd.min.js'></script>
</body>
</html>