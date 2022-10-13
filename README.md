# curso-java-cfp35-TP2
# Calculador de IMC (Indice de Masa Corporal)

Aplicacion para calcular el indice de masa corporal que devuelve el estado de la persona.
Esto es una aplicación con fines académicos, "NO" tomar como referencia.

# Ejecucíon del programa

Para ejecutar el programa hay dos maneras de hacerlo:

<h2>1:- Ejecución con F5</h2> <br>
<p>La terminal ira guiando los valores que se deben ingresar (peso) y (altura). Al presionar la tecla ENTER el sistema devolverá el valor del IMC y el estado al que corresponde dicho valor. Solamente se debe ingresar numeros sin ningun tipo de medida específica.
Es importante aclarar que al momento de ingresar decimales se debe tener en cuenta la configuración del sistema, e ingresar la coma ( , ) o el punto ( . ) para determinar los decimales.</p>

<h3>Ejemplo de ingreso de valores correcto:</h3>
<table>
    <tr>
        <th>
            <h4><u>Ingrese su peso:</u></h4>
            <p>70</p>
        </th>
        <th>
            <h4><u>Ingrese su altura:</u></h4>
            <p>1,70</p>
        </th>
    </tr>
     <tr>
        <th>
            <h4><u>Ingrese su peso:</u></h4>
            <p>70</p>
        </th>
        <th>
            <h4><u>Ingrese su altura:</u></h4>
            <p>1.70</p>
        </th>
    </tr>
</table>

<h3>Ejemplo de ingreso de valores correcto:</h3>
<table>
    <tr>
        <th>
            <h4><u>Ingrese su peso:</u></h4>
            <p>70 kg</p>
        </th>
        <th>
            <h4><u>Ingrese su altura:</u></h4>
            <p>1,70 mts</p>
        </th>
    </tr>
     <tr>
        <th>
            <h4><u>Ingrese su peso:</u></h4>
            <p>70 kg</p>
        </th>
        <th>
            <h4><u>Ingrese su altura:</u></h4>
            <p>1.70 mts</p>
        </th>
    </tr>
</table>


<hr>

<h2>2:- Ejecución con comando</h2> <br>
<p>Se debe ingresar el comando java Main.java y a continuación se deben ingresar (peso) y (altura) como parámetros. Al presionar la tecla ENTER el sistema devolverá el valor del IMC y el estado al que corresponde dicho valor. Solamente se debe ingresar numeros sin ningun tipo de medida específica. 
Es importante aclarar que al momento de ingresar decimales se debe tener en cuenta la configuración del sistema, e ingresar la coma (,) o el punto (.) para determinar los decimales.</p>

<table>
<tr>
<h3>Ejemplo de ingreso de valores correcto:</h3>
</tr>
    <tr>
        <td>
            <p>java Main.java 70 1,70</p>
        </td>              
    </tr>
    <tr>
        <td>
            <p>java Main.java 70 1.70</p>
        </td> 
    </tr>
</table>
<hr>
<table>
<tr>
<h3>Ejemplo de ingreso de valores incorrecto:</h3>
</tr>
    <tr>
        <td>
            <p>java Main.java 70kg 1,70mts</p>
        </td>              
    </tr>
    <tr>
        <td>
            <p>java Main.java 70kg 1.70mts</p>
        </td> 
    </tr>
</table>

# valores para testing

<table>
    <tr>
        <th>
            peso
        </th>
        <th>
            altura
        </th>
        <th>
            estado
        </th>
    </tr>
    <tr>
        <td>
            40
        </td>
        <td>
            1.70
        </td>
        <td>
        delgadez muy severa
        </td>
    </tr>
    <tr>
        <td>
            45
        </td>
        <td>
            1.70
        </td>
        <td>
        delgadez severa
        </td>
    </tr>
    <tr>
        <td>
            50
        </td>
        <td>
            1.70
        </td>
        <td>
        delgadez
        </td>
    </tr>
    <tr>
        <td>
            65
        </td>
        <td>
            1.70
        </td>
        <td>
        peso correcto
        </td>
    </tr>
    <tr>
        <td>
            75
        </td>
        <td>
            1.70
        </td>
        <td>
        sobre peso
        </td>
    </tr>
    <tr>
        <td>
            90
        </td>
        <td>
            1.70
        </td>
        <td>
        obesidad moderada
        </td>
    </tr>
    <tr>
        <td>
            105
        </td>
        <td>
            1.70
        </td>
        <td>
        dobesidad severa
        </td>
    </tr>
    <tr>
        <td>
            120
        </td>
        <td>
            1.70
        </td>
        <td>
        obesidad mórbida
        </td>
    </tr>
</table>
