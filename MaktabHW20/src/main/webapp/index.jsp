<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>
    <style>
        * {
            box-sizing: border-box;
        }
        body {
            background-color: #287fb7;
        }

        table{
            width: 100%;
            height: 160px;
        }

        td {
            padding: 3px;
        }
        .row {
            width: 100%;
            display: flex;
            justify-content: center;
        }

        .box {
            width: 300px;
            height: 250px;
            background-color: white;
            border-radius: 5px;
            text-align: center;
        }

        .box-content {
            font-size: 2em;
            padding: 30px;
        }

        input.text {
            background-color: #ebeff0;
            width: 100%;
            height: 100%;
            border: none;
            text-align: center;
        }

        input.button {
            background-color: #3597d9;
            color: white;
            width: 100%;
            height: 100%;
            border: none;
            border-radius: 5px;
        }
    </style>
</head>
<body>
<div class="row">
    <div class="box">
        <div class="box-content">
            <form action="">
                <table>
                    <thead>
                    Login
                    </thead>
                    <tbody>
                    <tr>
                        <td><input type="text" name="username" id="username" placeholder="username" class="text" required></td>
                    </tr>

                    <tr>
                        <td><input type="password" name="password" id="password" placeholder="password" class="text" required></td>
                    </tr>

                    <tr>
                        <td><input type="submit" name="login" id="login" value="login" class="button"></td>
                    </tr>
                    </tbody>
                </table>
            </form>
        </div>
    </div>
</div>
</body>
</html>
