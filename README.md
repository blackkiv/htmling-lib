# htmlimg
a better way to representing data (json suck)

clone and run ./gradlew publishToMavenLocal

for represent object use `@Htmling` annotation
for ignore some field use `@IgnoreHtmling` annotation

# examples
1)
```java
@Htmling(getterPrefix = "") // by default getterPrefix equals "get", but record provide getters with the same name as fields
public record Book(String title, String description) {
}

// some method
Book book = new Book("title", "description");
return HtmlingUtil.htmling(book);
```
result:
```html
<div>
  <h1>Book</h1>
  <div>title : title</div>
  <div>description : description</div>
</div>
```
2)
```java
@Htmling
@HtmlingStyle(name = "border", value = "medium dashed green")
public class Book {
  @IgnoreHtmling
  Long id;
  @HtmlingStyles({
      @HtmlingStyle(name = "font-size", value = "30px"),
      @HtmlingStyle(name = "background-color", value = "red")
  })
  String title;
  String description;
  String author;
  int pages;
  LocalDate releaseDate;
}
```
result:
```html
<div style="border:medium dashed green;">
  <h1>Book</h1>
  <div style="font-size:30px;background-color:red;">
    title : Title
  </div>
  <div>description : Description</div>
  <div>author : Author</div>
  <div>pages : 25</div>
  <div>releaseDate : 2021-11-05</div>
</div>
```
![image](https://user-images.githubusercontent.com/36714036/140432715-5f9afdc0-4ed6-4575-9ce5-5bfd79911828.png)
