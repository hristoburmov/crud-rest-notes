<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>CRUD REST Notes</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-12">
				<h2 class="text-center text-uppercase mb-3 mt-4">CRUD REST Notes Endpoints</h2>
				<table class="table table-bordered table-striped">
					<thead>
						<td class="text-center text-uppercase">Method</td>
						<td class="text-uppercase">URL</td>
						<td class="text-uppercase">Description</td>
					</thead>
					<tbody>
						<tr>
							<td class="text-primary text-center font-weight-bold">GET</td>
							<td>/notes</td>
							<td>Get all notes</td>
						</tr>
						<tr>
							<td class="text-primary text-center font-weight-bold">GET</td>
							<td>/notes/{id}</td>
							<td>Get note</td>
						</tr>
						<tr>
							<td class="text-success text-center font-weight-bold">POST</td>
							<td>/notes</td>
							<td>Create new note</td>
						</tr>
						<tr>
							<td class="text-warning text-center font-weight-bold">PUT</td>
							<td>/notes</td>
							<td>Update note</td>
						</tr>
						<tr>
							<td class="text-danger text-center font-weight-bold">DELETE</td>
							<td>/delete/{id}</td>
							<td>Delete note</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>