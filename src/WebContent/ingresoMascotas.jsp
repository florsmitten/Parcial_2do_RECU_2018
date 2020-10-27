<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ingreso Mascotas</title>
    <script>
        function validar() {

            var edad = document.getElementById("edad");
            if (isNaN(edad) || edad.trim() <0)
                return false;

        }
    </script>
</head>
<body>
<form action="ingresoMascotasSRV" onsubmit="validar()" method="post">
    <table>
        <tr>
            <td>Nombre mascota:</td>
            <td>
                <input type="text" id="nombreMascota" name="nombreMascota" />
            </td>
        </tr>
        <tr>
            <td>Nombre humano:</td>
            <td>
                <input type="text" id="nombreHumano" name="nombreHumano" />
            </td>
        </tr>
        <tr>
            <td>Tipo animal:</td>
            <td>
                <input type="radio" name="tipo" value="perro" />Perro
                <input type="radio" name="tipo" value="gato" />Gato
            </td>
        </tr>
        <tr>
            <td>Edad:</td>
            <td>
                <input type="text" name="edad" />
            </td>
        </tr>
        <tr>
            <td>
                Vacunas al dia<input name="extras" type="checkbox" value="vacunas">
            </td>
            <td>
                Come balanceado<input name="extras" type="checkbox" value="balanceado">
            </td>
            <td>
                Tiene alergias<input name="extras" type="checkbox" value="alergias">
            </td>
        </tr>
        <tr>
            <td>Razas: </td>
            <td><SELECT name="comboRazas">
                <%@page import="Controller.*" %>
                <%@ page import="static Controller.Controlador.getRazasST" %>
                <%
                    for(String raz : getRazasST())
                    {
                        out.print("<OPTION>" + raz + "</OPTION>");
                    }
                %>
            </SELECT></td>
        </tr>
    </table>
    <input type="submit" name="btnIngresar" value="Ingresar"/>
    <input type="reset" value="Limpiar" />
</form>
</body>
</html>
