# Jedi Academy
## Séance 1 - Spring Boot - First Steps

### 1. Initialisation de l'application
[Spring Boot Initializer](https://start.spring.io/)
### 2. Run
[Intellij Hot Swap](https://stackoverflow.com/questions/23155244/spring-boot-hotswap-with-intellij-ide)
### 3. Création d'un Helloworld
Définition d'un controller d'exemple. 
Utilisation des annotations:
- @RestController
- @RequestMapping
- @GetMapping
- @RequestParam & @PathVariable

#### Définition du controller
```java
Code à ajouter
```
#### Définition d'une méthode avec RequestParam
```java
Code à ajouter
```
#### Définition d'une méthode avec PathVariable
```java
Code à ajouter
```
### 4. Création de l'api météo
- Controller qui renvoie la température d'une ville
- Service métier
- Création d'un service pour contacter l'api OpenWeather
### 5. Appel de l'API OpenWeather
#### API OpenWeather
- [Documentation](https://openweathermap.org/current)
- [Météo à Lille?](http://api.openweathermap.org/data/2.5/weather?lang=fr&units=metric&appid=API_KEY&q=Lille)
#### Ajout du bean RestTemplate
```java
@Bean
public RestTemplate restTemplate(RestTemplateBuilder builder) {
    return builder.build();
}
```
#### Mapping JSON
On génère les beans à partir du retour JSON.
#### Utilisation de la configuration
```java
@Value("${openweather.api.base.url}")
```
#### On test !
Que faire si on a pas accès à l'API?
### 6. Introduction aux profils Spring
Création d'un mock dev pour le local
#### Définition des services en fonction des profiles avec @Profile
```java
@Profile("dev")
```
##### Utilisation du profil au runtime
```
-Dspring.profiles.active=dev
```

### 7. Gestion des erreurs dans les controlleurs
#### Catch des exceptions avec @ExceptionHandler
```java
Code à ajouter
```
#### Génération de la réponse avec @ResponseStatus
```java
Code à ajouter
```