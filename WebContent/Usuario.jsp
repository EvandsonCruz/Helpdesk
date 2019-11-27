<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Controle de usuário</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="css/bootstrap.min.js"></script>
	</head>
	<body>
		<!-- Default form contact -->
	<div class="container">
	<div class="d-flex justify-content-center h-100">
<form class="text-center border border-light p-5" action="$context[/insereUsuario">

    <p class="h4 mb-4">Usuario</p>

    <!-- Name -->
    <input type="text" id="id" class="form-control mb-4" placeholder="id">
    <input type="text" id="nome" class="form-control mb-4" placeholder="nome">
    <input type="password" id="senha" class="form-control mb-4" placeholder="senha">
    <select class="browser-default custom-select mb-4">
        <option value="" disabled>Choose option</option>
        <option value="1" selected>Administrador</option>
        <option value="2" selected>Efetivo</option>
        <option value="3" selected>Estagiario</option>
    </select>
    
    
    

    <!-- Send button -->
    <button class="btn btn-info btn-block" type="submit" style="background-color: #B0C4DE; color: black; font-weight: bold;">Alterar</button>
    
</form>
<!-- Default form contact -->
	</body>
</html>