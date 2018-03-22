<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="contato" method="post">

		<fieldset>

			<legend>Inclusão de Usuário</legend>

			<p>
				<label for="contato.nome">Nome: </label><input type="text"
					name="contato.nome" id="contato.nome" />
			</p>
			<p>
				<label for="contato.email">Email: </label><input type="text"
					name="contato.email" />
			</p>

			<input type="submit" value="enviar" />

		</fieldset>
	</form>

	<h2>Lista de Contatos</h2>

	<table width="80%" border="1">
		<c:forEach var="contato" items="${listaContatos}">
			<tr>
				<!-- código omitido -->
				<td>${contato.id}</td>
				<td>${contato.nome}</td>
				<td>editar</td>
				<td><form action="contato" method="post">
						<input type="hidden" name="acao" value="deletar" /> <input
							type="hidden" name="contato.id" value="${contato.id}" /> <input
							type="submit" value="remover" />
					</form></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>