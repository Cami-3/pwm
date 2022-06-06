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
						<div itemscope itemtype="http://schema.org/Product"
							class="product">
							<div class="images">

								<a href="" itemprop="image" class="woocommerce-main-image zoom"
									title="" data-rel="prettyPhoto"> <!-- 								inizia form -->
									<img
									src="asset/img-prodotti/<s:property value="prodotto.idprodotto"/>.jpg"
									alt="" style="width: 400px;"></a>
							</div>
							<div class="summary entry-summary">
								<h1 style="font-size: 30px;" itemprop="name"
									class="product_title entry-title">
									<s:property value="prodotto.nome" />
								</h1>


								<h3 class="price">
									<span class="amount"><s:property value="prodotto.prezzo" />
										€</span>
								</h3>





								<s:form action="AggiungiCarrello">
									<s:hidden name="id" value="%{prodotto.idprodotto}" />
									<s:select label="Scegli la taglia" headerKey="-1"
										headerValue="-" list="taglie" name="" />

									<s:textfield name="richiesta" label="Quantità" type="number"
										min="1" value="1" max="3"></s:textfield>
									<br>
									<div>
										<button
											style="background-color: black; border-color: black; color: white"
											; type="submit" class="single_add_to_cart_button button alt">Aggiungi
											al carrello</button>
									</div>



								</s:form>



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

									<meta itemprop="price" content="35" />
									<meta itemprop="priceCurrency" content="USD" />
									<link itemprop="availability" href="http://schema.org/InStock" />
								</div>
								<div itemprop="description">
									<p>Questo classico va ovunque, con qualsiasi cosa. Dotata
										di iconica suola e unità, è aggiornata con eleganti colori che
										ti accompagnano in pista o in qualsiasi altra situazione.</p>
								</div>

								</form>
								<div class="product_meta">
									<span class="posted_in">Categories: <a href="#"
										rel="tag"><s:property value="prodotto.genere" /></a>, <a
										href="#" rel="tag"><s:property
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
																	datetime="2013-06-07T15:54:25+00:00">20
																	Settembre 2021</time>
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
															<label for="rating">Tua Voto</label> <select
																name="rating" id="rating">
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

						</div>
					</div>
				</div>
			</main>

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