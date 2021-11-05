# htmlimg

a better way to representing data (json suck)

clone and run ./gradlew publishToMavenLocal

for represent object use `@Htmling` annotation for ignore some field use `@Ignore` annotation

# examples

1)

```java

@Htmling(getterPrefix = "")
// by default getterPrefix equals "get", but record provide getters with the same name as fields
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

@Htmling(getterPrefix = "", styles = {
    @Style(name = "background-color", value = "red"),
    @Style(name = "border", value = "medium dashed blue"),
    @Style(name = "font-style", value = "italic")
})
public record Book(
    @Property(styles = {@Style(name = "background-color", value = "orange")})
    String title,
    @Property(styles = {@Style(name = "background-color", value = "yellow")})
    String description,
    @Property(styles = {@Style(name = "background-color", value = "green")})
    LocalDate releasedAt,
    @Property(styles = {@Style(name = "background-color", value = "cyan")})
    int pages,
    @Ignore String secretInfo
) {

}
```

result:

```html

<div style="background-color:red;border:medium dashed blue;font-style:italic;">
  <h1>Book</h1>
  <div style="background-color:orange;">title : title</div>
  <div style="background-color:yellow;">description : description</div>
  <div style="background-color:green;">releasedAt : 2021-11-05</div>
  <div style="background-color:cyan;">pages : 80</div>
</div>
```

![img.png](img.png)
