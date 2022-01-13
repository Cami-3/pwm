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


		<article class="post invert style3 alt">

			<div style="width: 50%">
				<%-- 			<s:form action="Login" method="post" theme="simple"> --%>

				<!-- 				<div id="regLogin" -->
				<!-- 					style="width: 100%; text-align: center; margin-top: 10%;"> -->

				<!-- 					<h2>Effettua il Login:</h2> -->
				<%-- 					<s:fielderror style="color:red" fieldName="emailpassword" /> --%>
				<!-- 					<div class="containerLogin" style="width: 50%;"> -->
				<!-- 						<label class="labelLogin" for="username"> <b>Username</b> -->
				<!-- 						</label> -->
				<%-- 						<s:textfield name="email" /> --%>
				<!-- 						<label for="password" class="labelLogin"> <b>Password</b></label> -->
				<%-- 						<s:textfield name="password" type="password" /> --%>

				<!-- 						<button class="buttonLogin" type="submit">Login</button> -->
				<!-- 						<label class="labelLogin"> <input type="checkbox" -->
				<!-- 							checked="checked" name="remember"> -->
				<!-- 						</label> -->
				<!-- 					</div> -->
				<!-- 				</div> -->
				<%-- 			</s:form> --%>
			</div>
			<div style="width: 50%; background: white;">
				<div id="regLogin"
					style="width: 100%; text-align: center; margin-top: 5%;">


					<h2 style="color: #1c1c1c;">Registrati qui:</h2>
					<div style="margin-left: 20%; margin-right: 20%;">
						<div>
							<div>
								<span></span>
							</div>
							<s:form theme="simple" method="post" action="Registrazione">
								<div>
									<div>
										<div>
											<label for="email">Email</label>

											<s:textfield cssClass="form-control" name="email" />

											<h6 style="color: red;">
												<s:fielderror fieldName="email" />
											</h6>
											<h6 style="color: red;">
												<s:fielderror fieldName="email_presente" />
											</h6>
										</div>
									</div>
									<div>
										<div>
											<label for="nome">Nome </label>

											<s:textfield cssClass="form-control" name="cliente.nome" />

											<h6 style="color: red;">
												<s:fielderror fieldName="cliente.nome" />
											</h6>
										</div>
									</div>
								</div>
								<div>
									<div>
										<div>
											<label for="cognome">Cognome </label>
											<s:textfield cssClass="form-control" name="cliente.cognome" />
											<h6 style="color: red;">
												<s:fielderror fieldName="cliente.cognome" />
											</h6>
										</div>
									</div>
									<div>

										<form>
											<label>Data di Nascita <input
												type="date" name="cliente.datanascita">
											</label>  
										</form>
										<div>
											<label for="Cf">Codice Fiscale </label>
											<s:textfield cssClass="form-control" name="cliente.CF" />
											<h6 style="color: red;">
												<s:fielderror fieldName="cliente.c_f" />
											</h6>
										</div>
										<div>
											<label for="Piva">P.Iva </label>
											<s:textfield cssClass="form-control" name="cliente.PIva" />
											<h6 style="color: red;">
												<s:fielderror fieldName="cliente.p_iva" />
											</h6>
										</div>
										<div>
											<label for="iban">Iban </label>
											<s:textfield cssClass="form-control" name="cliente.iban" />
											<h6 style="color: red;">
												<s:fielderror fieldName="cliente.iban" />
											</h6>
										</div>
										<div>
											<label for="telefono">Numero di telefono</label>
											<s:textfield cssClass="form-control" name="account.numero" />
											<h6 style="color: red;">
												<s:fielderror fieldName="account.numero" />
											</h6>
										</div>
										<!-- 									<div> -->
										<!-- 										<label for="indirizzo-via">Indirizzo e via</label> -->
										<%-- 										<s:textfield cssClass="form-control" name="indirizzo.via" /> --%>
										<!-- 										<h6 style="color: red;"> -->
										<%-- 											<s:fielderror fieldName="indirizzo.via" /> --%>
										<!-- 										</h6> -->
										<!-- 									</div> 

									<div>
										<label for="indirizzo.civico">Numero civico</label>
										<s:textfield cssClass="form-control" name="indirizzo.civico" />
										<h6 style="color: red;">
											<s:fielderror fieldName="indirizzo.civico" />
										</h6>
									</div>
								</div>-->
										<div>
											<div>
												<label for="password">Password </label>
												<s:password cssClass="form-control" name="password" />
												<h6 style="color: red;">
													<s:fielderror fieldName="password" />
												</h6>
											</div>
										</div>
										<div>
											<div class="form-group">
												<label for="confermaPassword">Conferma password</label>
												<s:password name="confermaPassword" />
												<h6 style="color: red;">
													<s:fielderror fieldName="conferma_incoerente" />
												</h6>
											</div>

										</div>
										<div>
											<div>
												<s:submit value="Registrati"></s:submit>
											</div>
										</div>
									</div>
							</s:form>
							<p></p>

						</div>
					</div>
				</div>
			</div>
		</article>



	</div>

	<%@ include file="footer.jsp"%>
	<script src='js/jquery.js'></script>
	<script src='js/plugins.js'></script>
	<script src='js/scripts.js'></script>
	<script src='js/masonry.pkgd.min.js'></script>
</body>
</html>