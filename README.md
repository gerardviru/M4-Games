# M4-Games MASTERMIND

**Diagrama**

![unknown](https://user-images.githubusercontent.com/97692045/167304417-16fb02c4-262b-46f2-88a2-1fbc4dcf9450.png)

### Estructura Branches

- **Branch 'menuDificultad'**

En esta rama se ha trabajado el menú Vista donde se selecciona  el nivel de dificultad que escoge el usuario. Si no se escoge ningún nivel de dificultad, por defecto saldrá nivel principiante, igual que si el usuario selecciona el botón "Cancelar".
Dependiendo del nivel escogido, tendrá ciertos colores disponibles y diferentes números de intentos.


![Captura](https://user-images.githubusercontent.com/97692045/167302908-70bbdcc2-6711-41f6-9936-7e9eeed22713.PNG)

Opciones diferentes niveles:

1. Principiante -> 4 colores disponibles y 10 intentos
2. Medio -> 5 colores disponibles y 8 intentos
3. Avanzado -> 6 colores adisponibles y 6 intentos

- **Branch 'MenuVistaJuego'**

Aquí se esta definiedo la barra de navegación con las opciones 'Archivo' y 'Ayuda'.

![Captura1](https://user-images.githubusercontent.com/97692045/167303740-273eb202-9b27-4797-b4df-a2ba9e489721.PNG)

Dentro de la opción 'Archivo', tenemos dos opciones:
1. Nuevo Juego
2. Salir

![Captura de pantalla 2022-05-08 173728](https://user-images.githubusercontent.com/97692045/167303781-1e96cb34-1a28-4fb4-a529-401330846869.jpg)

Dentro de la opción 'Ayuda':
1. ¿Como se juega?
2. Ayuda

![Captura de pantalla 2022-05-08 173741](https://user-images.githubusercontent.com/97692045/167303815-25f9b59f-2c6d-4540-8226-3fc19d8037ec.jpg)

- **Branch 'VistaJuego'**

Es dónde se representa la interfaz gráfica para el usuario. Se muestra inicialmente los cuadrados vacios para buscar el color requerido, con la opción de dobleClick hacia delante o hacia atrás, las dos opciones son válidas. 

![Captura de pantalla 2022-05-08 180133](https://user-images.githubusercontent.com/97692045/167304742-91e5d460-e1b2-49bb-9815-e0e068f99e9e.jpg)

<details>
  <summary>Casillas vacias</summary>
<br>
  <p>Cambiamos de color las casillas vacias, con un dobleClick tanto con el botón derecho (hacia delante), como el izquierdo (hacia atrás)</p>
  
 ```java
  
	public void cambiarColor(int mouseButton, Component casilla) {

		// Dinamico segun la dificultad

		if (mouseButton == 1) {
			if (valor >= maxColor)
				valor = 0;
			else
				valor++;
		} else if (mouseButton == maxColor) {
			if (valor <= 0)
				valor = maxColor;
			else
				valor--;
		}
		casilla.setBackground(colores[valor]);

	}
```
</details>
</br>

![Captura de pantalla 2022-05-08 210312](https://user-images.githubusercontent.com/97692045/167311593-60af2877-bab3-4abc-9ce0-6e8640d4f8ae.jpg)


<details>
  <summary>Combinación secreta</summary>
<br>
  <p>Se crea aleatoriamente una combinación de colores, que el usuario tiene que intentar resolver</p>
  
 ```java
  public void generarCasillasSecretas() {
		for (int i = 0; i < 4; i++) {
			int numRandom = (int) (Math.random() * (maxColor+1));
			Casilla casillaSecreta = new Casilla(i, colores[numRandom], false);
			casillasSecretas.add(casillaSecreta);
		}
		System.out.println(casillasSecretas);
```
</details>
</br>

![Captura de pantalla 2022-05-08 210149](https://user-images.githubusercontent.com/97692045/167311540-c15934fb-ea7f-4982-b6f7-3ebe3b80614f.jpg)

<details>
  <summary>Numero de intentos</summary>
<br>
  <p>Se resta 1 intento cada vez, que comprobamos las casillas.</p>
</details>
</br>

![Captura de pantalla 2022-05-08 210817](https://user-images.githubusercontent.com/97692045/167311846-f8d90f78-de7c-49f4-8b22-5027a02f014f.jpg)

<details>
  <summary>Botón Comprobar</summary>
<br>
  <p>Realiza la comprobación tanto del color, como la posicion </p>
  
 ```java
		/*
		 * Acción del botón "Comprobar"
		 */
		comprobarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				nrIntento++;
				
				// Pasar casillas input
				
				controlador.setCasillasInput(casillasInput);

				// Comprobar cuantos colores son correctos
				// Comprobar si el color y la posición es correcta
				controlador.validarCasillas(casillasInput);
				
				// Mostrar el estado de los colores insertados
				controlador.mostrarAciertos(contentPane, nrIntento);

				// Dejar una copia de los colores escogidos en el mismo lugar
				controlador.dejarCopiaPanel(insertarPanel, contentPane, nrIntento);

				// Mover el boton comprobar y el panel insertar colores
				controlador.moverAbajo(comprobarBtn);
				controlador.moverAbajo(insertarPanel);
				contentPane.repaint();
				contentPane.revalidate();
				
				// Actualizar el número de intentos
				labelIntentos.setText((controlador.getMaximoIntentos()- nrIntento) + " Intentos");
				
				if (nrIntento >= controlador.getMaximoIntentos()) {
					controlador.finalizarPartida();
				}

			}
		});

	}
```
</details>
</br>
![Captura de pantalla 2022-05-08 211419](https://user-images.githubusercontent.com/97692045/167312051-bba6f635-3faa-4dab-b10f-b0062af28b9a.jpg)

