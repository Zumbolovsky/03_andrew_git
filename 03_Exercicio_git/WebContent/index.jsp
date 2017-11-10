<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bem-vindo</title>
<style type="text/css">
body {
	background-color: #87CEFA;
	margin: 30px
}
h1 {
	text-align: center;
}

div {
	text-align: center;
}
</style>
</head>
<body>
	<h1>Seja o Mestre das Piadas</h1>
	
	<div> 
	<form action="piadas" method="post">
	
	<p>Sabe qual a piada do pintinho? </p>
	<select name="piada1">
  		<option value="r1">Pintinho</option>
  		<option value="r2">Piu</option>
  		<option value="r3">Não Sei</option>
	</select>
	<br><br>
	
	<p>O pintinho tinha cu torto... </p>
		<select name="piada2">
	  		<option value="r1">Foi peidar, deu um cavalo de pau.</option>
	  		<option value="r2">Não peidou</option>
	  		<option value="r3">Peidou para cima</option>
		</select>
	
	<br><br>
	
	<p>O que aconteceu com o Pintinho de perna de palito de fósforo?</p>
		<select name="piada3">
	  		<option value="r1">Foi ciscar iluminou a curral</option>
	  		<option value="r2">Morreu</option>
	  		<option value="r3">Foi ciscar e pegou fogo</option>
		</select>
	<br><br>
	
	<input type="submit" name="enviar" value="Enviar">
	</form>
	
	
	<br>
	
	<h3>${mensagem}</h3>
	</div>
</body>
</html>