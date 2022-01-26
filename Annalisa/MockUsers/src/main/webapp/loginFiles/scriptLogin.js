var nickname = document.getElementById("nickname");
var password = document.getElementById("password");
var submit = document.getElementById("invia");
var form = document.getElementById("form");

/*
function ajaxLogin(param, value) {

	var richiesta = new XMLHttpRequest();
	var risposta;

	richiesta.open("POST", "../TestServlet", false);
	richiesta.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	richiesta.send(param + "=" + value);

	richiesta.onload = function() {
		// Parse in JSON
		risposta = JSON.parse(richiesta.responseText);
		
	}

	/*richiesta.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			return JSON.parse(richiesta.responseText);
		}
	}
	return risposta
}
*/

function validaNickname(stringa) {
	var pattern = new RegExp("^[a-zA-Z0-9_]*$");
	return pattern.test(stringa);
}

function validaPassword(password) {
	var patternPass = new RegExp("^[a-zA-Z0-9_]*$");
	return patternPass.test(password);
}

nickname.addEventListener("blur", function() {

	if (!validaNickname(nickname.value)) { 
		console.log("Caratteri non ammessi");
		return;
	}
	/*
		if (parseInt(ajaxLogin("nickname", nickname.value)) != 1) {
			console.log(ajaxLogin("nickname", nickname.value));
			console.log("L'utente non esiste'");
		};
		*/
})

password.addEventListener("blur", function() {
	if (!validaPassword(password.value)) {
		console.log("Valori sbagliati password");
		return;
	}
})

submit.addEventListener("click", function(event) {
	event.preventDefault();

	if (validaPassword(password.value) && validaNickname(nickname.value)) {
		document.getElementById("form").submit();
	} else {
		console.log("valori errati");
		return;
	}

})




