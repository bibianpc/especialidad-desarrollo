Algoritmo Calculadora
	
	Definir numero1, numero2, resultado Como Real
	Definir opcionOperacion Como Entero
	
	Escribir "Calculadora"
	Escribir "1 Sumar"
	Escribir "2 Restar"
	Escribir "3 Multiplicar"
	Escribir "4 Dividir"
	Escribir "Digite el n�mero de la operaci�n que necesita ejecutar"
	Leer opcionOperacion
	
	Segun opcionOperacion Hacer
		1: //Sumar
			Escribir "Ingrese el primer n�mero"
			Leer numero1
			Escribir "Ingrese el segundo n�mero"
			Leer numero2
			resultado = numero1 + numero2
			Escribir "La suma de los 2 numeros ingresados es igual a: ", resultado
			
		2: //Restar
			Escribir "Ingrese el primer n�mero"
			Leer numero1
			Escribir "Ingrese el segundo n�mero"
			Leer numero2
			resultado = numero1 - numero2
			Escribir "La resta de los 2 numeros ingresados es igual a: ", resultado
			
		3: //Multiplicar
			Escribir "Ingrese el primer n�mero"
			Leer numero1
			Escribir "Ingrese el segundo n�mero"
			Leer numero2
			resultado = numero1 * numero2
			Escribir "La multiplicaci�n de los 2 numeros ingresados es igual a: ", resultado
			
		4: //Dividir
			Escribir "Ingrese el primer n�mero (debe ser mayor al segundo numero)"
			Leer numero1
			Escribir "Ingrese el segundo n�mero"
			Leer numero2
			si numero2 <> 0 Entonces
				resultado = numero1 / numero2
				Escribir "La divisi�n de los 2 numeros ingresados es igual a: ", resultado	
			SiNo
				Escribir "El segundo n�mero no puede ser igual a cero"
			FinSi					
	FinSegun
FinAlgoritmo

