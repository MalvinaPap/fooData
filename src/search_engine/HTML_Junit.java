package search_engine;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

public class HTML_Junit {


	@Test
	public void test() {

			String expecting = "<!doctype html><html lang=\"el\" prefix=\"og: http://ogp.me/ns#\" id=\"parallax_scrolling\"><head><meta charset=\"utf-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><link rel=\"profile\" href=\"http://gmpg.org/xfn/11\"><link rel=\"pingback\" href=\"http://www.grecofarm.com/xmlrpc.php\"> 				<script type=\"text/javascript\">document.documentelement.classname = document.documentelement.classname + ' yes-js js_active js'</script>			<title>χαρουπόμελο - 250ml - grecofarm</title>			<style>				.wishlist_table .add_to_cart, a.add_to_wishlist.button.alt { border-radius: 16px; -moz-border-radius: 16px; -webkit-border-radius: 16px; }			</style>			<script type=\"text/javascript\">				var yith_wcwl_plugin_ajax_web_url = '/wp-admin/admin-ajax.php';			</script>		  <script type=\"text/javascript\">      var tm_product_page = false;      var themeurl = 'http://www.grecofarm.com/wp-content/themes/flavours';      var imageurl = 'http://www.grecofarm.com/wp-content/themes/flavours/images';      var cssurl = 'http://www.grecofarm.com/wp-content/themes/flavours/css';            var tm_add_to_wishlist_success_text = 'product successfully added to wishlist. <a href=\"http://www.grecofarm.com/wishlist/view/\">browse wishlist</a>';      var tm_add_to_wishlist_exists_text = 'the product is already in the wishlist! <a href=\"http://www.grecofarm.com/wishlist/view/\">browse wishlist</a>';                  tm_product_page = true;          </script>  <!-- this site is optimized with the yoast seo plugin v3.8 - https://yoast.com/wordpress/plugins/seo/ --><link rel=\"canonical\" href=\"http://www.grecofarm.com/product/xaroupomelo-250ml/\" /><meta property=\"og:locale\" content=\"el_gr\" /><meta property=\"og:type\" content=\"article\" /><meta property=\"og:title\" content=\"χαρουπόμελο - 250ml - grecofarm\" /><meta property=\"og:description\" content=\"χαρουπόμελο – 250mlnaturelκυπριακό προϊόν&nbsp;\" /><meta property=\"og:url\" content=\"http://www.grecofarm.com/product/xaroupomelo-250ml/\" /><meta property=\"og:site_name\" content=\"grecofarm\" /><meta property=\"article:publisher\" content=\"https://www.facebook.com/www.grecofarm.gr/\" /><meta property=\"og:image\" content=\"http://www.grecofarm.com/wp-content/uploads/2016/10/831611.jpg\" /><meta property=\"og:image:width\" content=\"800\" /><meta property=\"og:image:height\" content=\"800\" /><meta name=\"twitter:card\" content=\"summary\" /><meta name=\"twitter:description\" content=\"χαρουπόμελο – 250mlnaturelκυπριακό προϊόν&nbsp;\" /><meta name=\"twitter:title\" content=\"χαρουπόμελο";
			try{
			URL url = new URL(
				"http://www.grecofarm.com/product/xaroupomelo-250ml/");
				String result = HTMLreader.getText(url);

				assertEquals(expecting, result);

			} catch (MalformedURLException e) {
				System.out.println("unproper URL insertion");
			} catch (Exception a) {
			}

		}

}
