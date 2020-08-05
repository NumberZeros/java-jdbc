<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simple Web Application</title>
</head>

<body>
	<div
		style="display: flex; justify-content: center; align-items: center; margin: auto; flex-direction: column; font-size: 3rem; padding: 2em;">
		<div>
			<b> Login </b>
		</div>
		<div>
			<form action="index.html">
				<div style="font-size: 0.8em; padding: 1em 2em;">
					UserName: <input style="font-size: 1em;" name="username" />
				</div>
				<div style="font-size: 0.8em; padding: 1em 2em;">
					Password: <input style="font-size: 1em;" name="password" />
				</div>
				<div style="display: flex; justify-content: center;font-size: 0.8em;">
					<button formmethod="post">Login</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>