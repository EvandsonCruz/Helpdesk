<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>getChamado</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="css/bootstrap.min.js"></script>
	</head>
	<body>
		<!-- Default form contact -->
	<div class="container">
	<div class="d-flex justify-content-center h-100">
<form class="text-center border border-light p-5" action="$context[/alteraChamado">

    <p class="h4 mb-4">Chamado</p>

    <!-- Name -->
    <input type="text" id="idChamado" class="form-control mb-4" placeholder="ID">
    <input type="date" id="idade" class="form-control mb-4" >
    <input type="text" id="idChamado" class="form-control mb-4" placeholder="Assunto">
    <select class="browser-default custom-select mb-4">
        <option value="" disabled>Choose option</option>
        <option value="1" selected>Fechado</option>
        <option value="2" selected>Aberto</option>
    </select>
    <select class="browser-default custom-select mb-4">
        <option value="" disabled>Choose option</option>
        <option value="1" selected>Bloqueado</option>
        <option value="2" selected>Desbloqueado</option>
    </select>
    <select class="browser-default custom-select mb-4">
        <option value="" disabled>Choose option</option>
        <option value="1" selected>Fila3</option>
        <option value="2" selected>Fila2</option>
    </select>
    <input type="text" id="atendimento" class="form-control mb-4" placeholder="Atendimento">
    <input type="text" id="cliente" class="form-control mb-4" placeholder="Cliente">


    <!-- Message -->
    <div class="form-group">
        <textarea class="form-control rounded-0" id="exampleFormControlTextarea2" rows="3" placeholder="Resposta"></textarea>
    </div>

    
    

    <!-- Send button -->
    <button class="btn btn-info btn-block" type="submit" style="background-color: #B0C4DE; color: black; font-weight: bold;">Alterar</button>

</form>
</body>
</html>