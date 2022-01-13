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
<!-- <body class="single single-product woocommerce woocommerce-page"> -->
<!-- <div id="page"> -->
<!-- 	<div class="container"> -->
<!-- 		<header id="masthead" class="site-header"> -->
<!-- 		<div class="site-branding"> -->
<!-- 			<h1 class="site-title"><a href="index.html" rel="home">Moschino</a></h1> -->
<!-- 			<h2 class="site-description">Minimalist Portfolio HTML Template</h2> -->
<!-- 		</div> -->
<!-- 		<nav id="site-navigation" class="main-navigation"> -->
<!-- 		<button class="menu-toggle">Menu</button> -->
<!-- 		<a class="skip-link screen-reader-text" href="#content">Skip to content</a> -->
<!-- 		<div class="menu-menu-1-container"> -->
<!-- 			<ul id="menu-menu-1" class="menu"> -->
<!-- 				<li><a href="index.html">Home</a></li> -->
<!-- 				<li><a href="about.html">About</a></li> -->
<!-- 				<li><a href="shop.html">Shop</a></li> -->
<!-- 				<li><a href="blog.html">Blog</a></li> -->
<!-- 				<li><a href="elements.html">Elements</a></li> -->
<!-- 				<li><a href="#">Pages</a> -->
<!-- 				<ul class="sub-menu"> -->
<!-- 					<li><a href="portfolio-item.html">Portfolio Item</a></li> -->
<!-- 					<li><a href="blog-single.html">Blog Article</a></li> -->
<!-- 					<li><a href="shop-single.html">Shop Item</a></li> -->
<!-- 					<li><a href="portfolio-category.html">Portfolio Category</a></li> -->
<!-- 				</ul> -->
<!-- 				</li> -->
<!-- 				<li><a href="contact.html">Contact</a></li> -->
<!-- 			</ul> -->
<!-- 		</div> -->
<!-- 		</nav> -->
<!-- 		</header> -->
<!-- 		<!-- #masthead -->
<%@ include file="Header.jsp"%>
	<div class="container">
<div id="content" class="site-content">
	<div id="primary" class="content-area column full">
		<main id="main" class="site-main" role="main">
			<div id="container">
				<div id="content" role="main">
					<nav class="woocommerce-breadcrumb" itemprop="breadcrumb">
						<a href="Menu">Home</a> /
						<s:property value="prodotto.nome" />
						/
						<s:property value="prodotto.tipo_cliente" />
					</nav>
					<div itemscope itemtype="http://schema.org/Product" class="product">
						<div class="images">
						
							<a href="" itemprop="image" class="woocommerce-main-image zoom"
								title="" data-rel="prettyPhoto"> 
<!-- 								inizia form -->
								<img
								src="asset/img-prodotti/<s:property value="prodotto.idprodotto"/>.jpg"
								alt=""
								style="width: 300px;"
								></a>
						</div>
						<div class="summary entry-summary">
							<h1 itemprop="name" class="product_title entry-title">
								<s:property value="prodotto.nome" />
							</h1>
							
							<div class="woocommerce-product-rating"
								itemprop="aggregateRating" itemscope
								itemtype="http://schema.org/AggregateRating">
								<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
									class="fa fa-star"></i> <i class="fa fa-star"></i> <i
									class="fa fa-star"></i> <a href="#reviews"
									class="woocommerce-review-link" rel="nofollow">(<span
									itemprop="reviewCount" class="count">2</span> recensioni dei
									clienti)
								</a>
							</div>
							<div itemprop="offers" itemscope
								itemtype="http://schema.org/Offer">
								<p class="price">
									<span class="amount"><s:property value="prodotto.prezzo" /></span>
								</p>
								<meta itemprop="price" content="35" />
								<meta itemprop="priceCurrency" content="USD" />
								<link itemprop="availability" href="http://schema.org/InStock" />
							</div>
							<div itemprop="description">
								<p>Questo classico va ovunque, con qualsiasi cosa. Dotata di
									iconica suola e unità, è aggiornata con eleganti colori che ti
									accompagnano in pista o in qualsiasi altra situazione.</p>
							</div>
							
							
							<form class="cart" method="post" enctype='multipart/form-data'>
								<div class="quantity">
									<input type="number" step="1" min="1" max="" name="quantity"
										value="1" title="Qty" class="input-text qty text" size="1" />
								</div>

								<form class="woocommerce-ordering" method="get">
									<select name="orderby" class="orderby">
										<option value="taglia" selected="selected">Scegli la
											taglia</option>
										<option value="num40">40</option>
										<option value="num41">41</option>
										<option value="num42">42</option>
										<option value="num43">43</option>
										<option value="num44">44</option>
									</select>
								</form>
								
								
								<p>Taglie disponibili</p>
					<s:iterator value="prodottostessonome">
					<s:property value="taglia"/>
					</s:iterator>

								<button type="submit"
									class="single_add_to_cart_button button alt">Aggiungi
									al carrello</button>
							</form>
							<div class="product_meta">
								<span class="posted_in">Categories: <a href="#" rel="tag"><s:property
											value="prodotto.genere" /></a>, <a href="#" rel="tag"><s:property
											value="prodotto.tipo_cliente" /></a>
								</span>
							</div>
						</div>
						<!-- .summary -->
						<div class="woocommerce-tabs wc-tabs-wrapper">
							<div class="panel entry-content wc-tab" id="tab-description">
								<h2>Descrizione del prodotto</h2>
								<p>Modificare in maniera dinamica sei un mitico duracell ai
									non ma fidu chiu</p>
							</div>
							<div class="panel entry-content wc-tab" id="tab-reviews">
								<div id="reviews">
									<div id="comments">
										<h2>
											2 Recensioni per
											<s:property value="prodotto.nome" />
										</h2>
										<ol class="commentlist">
											<li itemprop="review" itemscope
												itemtype="http://schema.org/Review" class="comment">
												<div id="comment-3" class="comment_container">
													<img alt=''
														src='http://0.gravatar.com/avatar/c7cab278a651f438795c2a9ebf02b5ae?s=60&#038;d=mm&#038;r=g'
														srcset='http://0.gravatar.com/avatar/c7cab278a651f438795c2a9ebf02b5ae?s=120&amp;d=mm&amp;r=g 2x'
														class='avatar avatar-60 photo' height='60' width='60' />
													<div class="comment-text">
														<p class="meta">
															<strong itemprop="author">Stefano</strong> &ndash;
															<time itemprop="datePublished"
																datetime="2013-06-07T15:54:25+00:00">10 giugno
																2020</time>
															:
														</p>
														<div itemprop="description" class="description">
															<p>Scarpa molto bella ed arrivata in poco tempo!</p>
														</div>
													</div>
												</div>
											</li>
											<!-- #comment-## -->
											<li itemprop="review" itemscope
												itemtype="http://schema.org/Review" class="comment">
												<div id="comment-4" class="comment_container">
													<img alt=''
														src='http://2.gravatar.com/avatar/59c82b1d2c60537f900fb191b3cb611b?s=60&#038;d=mm&#038;r=g'
														srcset='http://2.gravatar.com/avatar/59c82b1d2c60537f900fb191b3cb611b?s=120&amp;d=mm&amp;r=g 2x'
														class='avatar avatar-60 photo' height='60' width='60' />
													<div class="comment-text">
														<p class="meta">
															<strong itemprop="author">Maria</strong> &ndash;
															<time itemprop="datePublished"
																datetime="2013-06-07T15:54:25+00:00">20 Settembre
																2021</time>
															:
														</p>
														<div itemprop="description" class="description">
															<p>Regalata al mio ragazzo... Adoroo!!</p>
														</div>
													</div>
												</div>
											</li>
											<!-- #comment-## -->
										</ol>
									</div>
									<div id="review_form_wrapper">
										<div id="review_form">
											<div id="respond" class="comment-respond">
												<h3 style="margin-bottom: 10px;" id="reply-title"
													class="comment-reply-title">
													Aggiungi una recenzione <small><a rel="nofollow"
														id="cancel-comment-reply-link"
														href="/demo-moschino/product/woo-logo-2/#respond"
														style="display: none;">Cancella e riscrivi</a></small>
												</h3>
												<form action="#" method="post" id="commentform"
													class="comment-form" novalidate>
													<p class="comment-form-rating">
														<label for="rating">Tua Voto</label> <select name="rating"
															id="rating">
															<option value="">Vota&hellip;</option>
															<option value="5">Ottimo</option>
															<option value="4">Buono</option>
															<option value="3">Soddisfatto</option>
															<option value="2">Non male</option>
															<option value="1">Non soddisfatto</option>
														</select>
													</p>
													<p class="comment-form-comment">
														<label for="comment">Tua recenzione</label>
														<textarea id="comment" name="comment" cols="45" rows="8"
															aria-required="true"></textarea>
													</p>
													<p class="comment-form-author">
														<label for="author">Nome <span class="required">*</span></label><input
															id="author" name="author" type="text" value="" size="30"
															aria-required="true" />
													</p>
													<p class="comment-form-email">
														<label for="email">Email <span class="required">*</span></label><input
															id="email" name="email" type="text" value="" size="30"
															aria-required="true" />
													</p>
													<p class="form-submit">
														<input name="submit" type="submit" id="submit"
															class="submit" value="Invia" /><input type='hidden'
															name='comment_post_ID' value='60' id='comment_post_ID' />
													</p>
												</form>
											</div>

										</div>
									</div>
									<div class="clear"></div>
								</div>
							</div>
						</div>
						<!-- 						<div class="related products"> -->
						<!-- 							<h2>Related Products</h2> -->
						<!-- 							<ul class="products"> -->
						<%-- 								<li class="first product"><a href="shop-single.html"> <span --%>
						<%-- 										class="onsale">Sale!</span> <img --%>
						<!-- 										src="http://s3.amazonaws.com/caymandemo/wp-content/uploads/sites/10/2015/09/10175658/j4-520x520.jpg" -->
						<!-- 										alt=""></img> -->
						<%-- 										<h3>Beige Fedora</h3> <span class="price"><del> --%>
						<%-- 												<span class="amount">$35.00</span> --%>
						<!-- 											</del> -->
						<!-- 											<ins> -->
						<%-- 												<span class="amount">&#36;14.00</span> --%>
						<%-- 											</ins></span> --%>
						<!-- 								</a> <a href="#" class="button">Add to cart</a></li> -->

						<!-- 								<li class="product"><a href="shop-single.html"> <img -->
						<!-- 										src="http://s3.amazonaws.com/caymandemo/wp-content/uploads/sites/10/2015/09/10175658/j6-520x779-520x600.jpg" -->
						<!-- 										alt=""></img> -->
						<%-- 										<h3>Male Jeans</h3> <span class="price"><span --%>
						<%-- 											class="amount">$35.00</span></span> --%>
						<!-- 								</a> <a href="#" class="button">Add to cart</a></li> -->

						<!-- 								<li class="product"><a href="shop-single.html"> <img -->
						<!-- 										src="http://s3.amazonaws.com/caymandemo/wp-content/uploads/sites/10/2015/09/10175658/j7-520x780-520x600.jpg" -->
						<!-- 										alt=""></img> -->
						<%-- 										<h3>Slim Jeans</h3> <span class="price"><span --%>
						<%-- 											class="amount">$20.00</span></span> --%>
						<!-- 								</a> <a href="#" class="button">Add to cart</a></li> -->


						<!-- 								<li class="product last"><a href="shop-single.html"> <img -->
						<!-- 										src="http://s3.amazonaws.com/caymandemo/wp-content/uploads/sites/10/2015/09/10175658/j3-320x320.jpg" -->
						<!-- 										alt=""></img> -->
						<%-- 										<h3>Summer Blouse</h3> <span class="price"><span --%>
						<%-- 											class="amount">$35.00</span></span> --%>
						<!-- 								</a> <a href="#" class="button">Add to cart</a></li> -->
						<!-- 							</ul> -->
						<!-- 						</div> -->
					</div>
				</div>
			</div>
		</main>
		<!-- #main -->
	</div>
	<!-- #primary -->
</div>
<!-- #content -->
</div>
<!-- .container -->
<!-- 	<footer id="colophon" class="site-footer"> -->
<!-- 	<div class="container"> -->
<!-- 		<div class="site-info"> -->
<!-- 			<h1 style="font-family: 'Herr Von Muellerhoff';color: #ccc;font-weight:300;text-align: center;margin-bottom:0;margin-top:0;line-height:1.4;font-size: 46px;">Moschino</h1> -->
<!-- 			<a target="blank" href="https://www.wowthemes.net/">&copy; Moschino - Free HTML Template by WowThemes.net</a> -->
<!-- 		</div> -->
<!-- 	</div> -->
<!-- 	</footer> -->
<%-- 	<a href="#top" class="smoothup" title="Back to top"><span class="genericon genericon-collapse"></span></a> --%>
<!-- </div> -->
<!-- <!-- #page -->



<%@ include file="footer.jsp"%>
<script src='js/jquery.js'></script>
<script src='js/plugins.js'></script>
<script src='js/scripts.js'></script>
<script src='js/masonry.pkgd.min.js'></script>
</body>
</html>