Sample demo created from YT Amigoscode.

Getting Started:
Spring Boot 4+
JDK 25

## URLs
- `curl -sS http://localhost:8080/api/v1/posts`
- `curl -sS http://localhost:8080/api/v1/posts | json_pp`

### We can set default json pritty printing to response using:
- `spring.jackson.serialization.indent-output=true`
- No need to apply pipe after curl *| json_pp*
