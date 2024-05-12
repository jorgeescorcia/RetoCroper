# Automatización de Pruebas para Croper
Este proyecto contiene scripts de automatización de pruebas para la web de Croper. Las pruebas se han realizado utilizando Java, Maven y Selenium.

## Características de las Pruebas
- Búsqueda de Productos: Las pruebas automatizadas buscan un producto específico, en este caso, “filtro de aceite”, en la barra de búsqueda de productos y verifican que el nombre del producto enviado esté presente en los resultados.
- Navegación: Las pruebas interactúan con cada botón en la barra de navegación para asegurarse de que todos estén funcionando correctamente. Si los botones abren nuevas URL, las pruebas verifican que las URL sean las correspondientes a cada botón. 
- Tarjetas: Las pruebas localizan varias tarjetas en la página, hacen clic en cada una de ellas y verifican si las URL contienen las palabras clave que las identifican.

### Requisitos para la ejecucion

- Clonar Repositorio
- Java Development Kit (JDK) 17
- Gradle 7.6.3
- Gherkin
- Chrome Version > 100
