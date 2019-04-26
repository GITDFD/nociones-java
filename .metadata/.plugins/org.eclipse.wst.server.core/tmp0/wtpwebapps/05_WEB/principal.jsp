<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bienvenido</title>
</head>
<body>
	<h2 style="color:blue"> Loggin correcto.</h2><br/>	
	<!-- usamos el atributo que hemos recibido desde el controlador para pintar en pantalla -->
	<h3>Esta en su pagina principal de acceso, ${atributoUsuario.nombre}</h3>
</body>
</html>