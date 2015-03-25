
function passnav(form_name) {
	document.forms[form_name].action = makelink(document.forms[form_name].action);
}

function addpassnav(form_name) {
	document.forms[form_name].action = addlink(document.forms[form_name].action);
}

function makelink(linkurl) {
  return linkurl + '?navblks=' + navblks;
}

function addlink(linkurl) {
  return linkurl + '&navblks=' + navblks;
}

function toggleNav(nav_img,nav_idx,nav_sec){

	var e = document.getElementById(nav_sec).style

	if (e.overflow == 'hidden'){
		e.overflow = '';
		e.height = '';
		nav_img.className = '';
		if (nav_idx >= 0) {navblks = navblks.substr(0,nav_idx) + '1' + navblks.substr(nav_idx + 1);}
	} else {
		e.overflow = 'hidden';
		e.height = '26px';
		nav_img.className = 'closed';
		if (nav_idx >= 0) {navblks = navblks.substr(0,nav_idx) + '0' + navblks.substr(nav_idx + 1);}
	}
}
