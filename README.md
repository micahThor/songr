# Songr App
<!-- Short summary or background information -->
### Create an application that uses **Spring Framework**.  

### Project dependencies include *tThymeleaf*, *Spring Web*, and *Spring Devtools*.  

### This project contains these **routes**:  
    - "/" : Home route.  Displays a welcome message.  
    - "/hello" : Displays another welcome message.
    - "/capitalize" : Displays param in URL in body of HTML as a capitalized word.
    - "/albums: "Displays three Album objects in body of HTML" 
    
### How to **run** Songr:
  1. Clone this repo.
  2. Navigate terminal to repo folder location on local machine.
  3. Enter *"./gradlew BootRun"*
  4. Open web browser of choice
  5. Enter *"http://localhost:8080"*
  6. Visit each page by appending route names above.

## Challenge
<!-- Description of the challenge -->
1.  Ensure that you can run the Spring app.  
2.  Create a hello world route at /hello, and ensure that you can visit that route in your browser and see a rendered template come back.  
3.  Create a route that turns words into UPPER CASE. For instance, I should be able to visit /capitalize/hello and get back an HTML page containing the response HELLO, or I could visit /capitalize/this is Kinda Capitalized and get an HTML page containing the response THIS IS KINDA CAPITALIZED.  
4.  Create a basic splash page for the Songr app, available at the root route, and style it appropriately with CSS.  
5.  Create an Album class to act as a model in our app.  
    An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.  
6.  Create a route at /albums that shows three album instances. (These will be hardcoded for today’s lab; create an array that contains three albums, and then display those three on the page.)   
