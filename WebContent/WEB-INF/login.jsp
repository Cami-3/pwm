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


		<s:form action="Login" method="post" style="margin-left: -41px;margin-top: -65px;" theme="simple">

			<div id="regLogin"
				style="width: 100%; text-align: left; margin-top: 10%;margin-left:375px;">
		
					<h2 style="margin-left: 44px;">Effettua il Login:</h2>
			


				<div class="containerLogin" style="width: 50%;margin-top: 27px;">
					<label class="labelLogin" for="email"> <b>Username</b>
					</label>

					<s:textfield name="email" />
					<br> <br> <label for="password" class="labelLogin">
						<b>Password</b>
					</label>
					<s:textfield name="password" type="password" />
					<br> <br>
					<div style="text-align: left">
						<button
							style="background-color: black; border-color: black; color: white;margin-left: 136px;"
							;
						class="buttonLogin" type="submit">Login</button>
						<label class="labelLogin">
					</div>
					<br> </label>
				</div>


			</div>

		</s:form>

		<a href="RichiediRegistrazione"><button
				style="background-color: black; border-color: black; color: white;margin-left: 448px;";>Registrazione</button></a>
		<br> <br>

	</div>




	<%@ include file="footer.jsp"%>
	<script src='js/jquery.js'></script>
	<script src='js/plugins.js'></script>
	<script src='js/scripts.js'></script>
	<script src='js/masonry.pkgd.min.js'></script>
</body>
</html>