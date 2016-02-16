$(document).ready(function() {
	
	$('.js-toggle').bind('click', function() {
		$('.js-sidebar').toggleClass('is-toggled');
		$('.js-content').toggleClass('is-toggled');
	});
	
});




/* Menu quando clicado is-selected*/
/*$(document).ready(function() {
	
	$('.js-link-menu-2').bind('click', function() {
		$('.js-link-menu-2').toggleClass('is-selected');
	});
	
});*/