
# Business Assistant - Opendata

### Endpoints disponibles

- http://localhost:8762/v1/api/opendata/test
- http://localhost:8762/v1/api/opendata/test-reactive

### Swagger URL

- http://localhost:8762/swagger-ui/index.html

### Reactive Programming Samples

- Véase HttpClientHelper. Spring WebClient object en lugar de RESTTemplate (pronto deprecada)
- Véase endpoint /test-reactive.

### Testing

- Comando <b>[./gradlew | gradle.bat] :BusinessAssistant-opendata:test </b>

### h2 Database

- Consola accesible en http://localhost:8762/h2-console
- Carga automática al arrancar contexto de files sql de test schema.sql y data.sql
