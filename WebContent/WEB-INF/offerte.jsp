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
<!-- 	<div id="page"> -->
<!-- 		<div class="container"> -->
<!-- 			<header id="masthead" class="site-header"> -->
<!-- 				<div class="site-branding"> -->
<!-- 					<h1 class="site-title"> -->
<!-- 						<a href="index.html" rel="home">Moschino</a> -->
<!-- 					</h1> -->
<!-- 					<h2 class="site-description">Minimalist Portfolio HTML -->
<!-- 						Template</h2> -->
<!-- 				</div> -->
<!-- 				<nav id="site-navigation" class="main-navigation"> -->
<!-- 					<button class="menu-toggle">Menu</button> -->
<!-- 					<a class="skip-link screen-reader-text" href="#content">Skip to -->
<!-- 						content</a> -->
<!-- 					<div class="menu-menu-1-container"> -->
<!-- 						<ul id="menu-menu-1" class="menu"> -->
<!-- 							<li><a href="index.html">Home</a></li> -->
<!-- 							<li><a href="about.html">About</a></li> -->
<!-- 							<li><a href="shop.html">Shop</a></li> -->
<!-- 							<li><a href="blog.html">Blog</a></li> -->
<!-- 							<li><a href="elements.html">Elements</a></li> -->
<!-- 							<li><a href="#">Pages</a> -->
<!-- 								<ul class="sub-menu"> -->
<!-- 									<li><a href="portfolio-item.html">Portfolio Item</a></li> -->
<!-- 									<li><a href="blog-single.html">Blog Article</a></li> -->
<!-- 									<li><a href="shop-single.html">Shop Item</a></li> -->
<!-- 									<li><a href="portfolio-category.html">Portfolio -->
<!-- 											Category</a></li> -->
<!-- 								</ul></li> -->
<!-- 							<li><a href="contact.html">Contact</a></li> -->
<!-- 						</ul> -->
<!-- 					</div> -->
<!-- 				</nav> -->
<!-- 			</header> -->
<!-- 			<!-- #masthead --> 
	<div class="container">
			<div id="content" class="site-content">
				<div id="primary" class="content-area column full">
					<main id="main" class="site-main" role="main">
						<p class="woocommerce-result-count">Showing 1–8 of 12 results
						</p>
						<form class="woocommerce-ordering" method="get">
							<select name="orderby" class="orderby">
								<option value="menu_order" selected="selected">Default
									sorting</option>
								<option value="popularity">Sort by popularity</option>
								<option value="rating">Sort by average rating</option>
								<option value="date">Sort by newness</option>
								<option value="price">Sort by price: low to high</option>
								<option value="price-desc">Sort by price: high to low</option>
							</select>
						</form>
						<br />
					<br />
						<div class="grid portfoliogrid" style="position: relative; height: 1455.29px;">

							<s:iterator value="offerte" >
							<article class="hentry">
							<img src="asset/img-prodotti/<s:property value="idprodotto"/>.jpg" 
							
							>
								<a href="ShoeDescription?id=<s:property value="idprodotto"/>"></a> <span
								
										class="onsale">Saldi!</span> 
										<h3>
											<s:property value="nome"/>
										</h3> 
										
										</article>
									
							</s:iterator>

</div>

						
						
					</main>
					<!-- #main -->
				</div>
				<!-- #primary -->
			</div>
			<!-- #content -->
		</div>
		<!-- .container -->
<!-- 		<footer id="colophon" class="site-footer"> -->
<!-- 			<div class="container"> -->
<!-- 				<div class="site-info"> -->
<!-- 					<h1 -->
<!-- 						style="font-family: 'Herr Von Muellerhoff'; color: #ccc; font-weight: 300; text-align: center; margin-bottom: 0; margin-top: 0; line-height: 1.4; font-size: 46px;">Moschino</h1> -->
<!-- 					<a target="blank" href="https://www.wowthemes.net/">&copy; -->
<!-- 						Moschino - Free HTML Template by WowThemes.net</a> -->
<!-- 				</div> -->
<!-- 			</div> -->
<!-- 		</footer> -->
<%-- 		<a href="#top" class="smoothup" title="Back to top"><span --%>
<%-- 			class="genericon genericon-collapse"></span></a> --%>
<!-- 	</div> -->
	<!-- #page -->
	<%@ include file="footer.jsp"%>
	
	<script src='js/jquery.js'></script>
	<script src='js/plugins.js'></script>
	<script src='js/scripts.js'></script>
	<script src='js/masonry.pkgd.min.js'></script>
</body>
</html>