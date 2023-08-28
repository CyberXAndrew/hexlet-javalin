package org.example.hexlet;

import io.javalin.Javalin;
import org.example.hexlet.dto.courses.CoursePage;
import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.model.Course;

import java.util.Collections;
import java.util.List;

public class HelloWorld {
    private static final List<Course> courses = List.of(
            new Course(null, null, null),
            new Course(1L,"First_Course", "Here is content of of first"),
            new Course(2L, "Second_Course", "Here is content of of second"),
            new Course(3L,"Third_Course", "Here is content of of third"),
            new Course(4L,"Four_Course", "Here is content of of fourth"));

    public static void main(String[] args) {
        var app = Javalin.create(config -> config.plugins.enableDevLogging());
        app.get("/", ctx -> ctx.render("layout/main.jte"));

        app.get("/courses", ctx -> {
            var header = "Все курсы";
            var page = new CoursesPage(courses, header);
            ctx.render("courses.jte", Collections.singletonMap("page", page));
        });
        app.get("/courses/{id}", ctx -> {
           var id = ctx.pathParam("id");
           var course = courses.get(Integer.parseInt(id));
           var page = new CoursePage(course);
           ctx.render("coursepage.jte", Collections.singletonMap("page", page));
        });

        app.get("/users", ctx -> ctx.result("executes GET /users"));
        app.post("/users", ctx -> ctx.result("executes POST /users"));

        app.get("/hello", ctx -> {
            var name = ctx.queryParam("name");
            if (name == null) {
                ctx.result("Hello, World!");
            } else { ctx.result("Hello, " + name + "!"); }
        });

        app.get("/users/{id}/post/{postid}", ctx -> {
            var id = ctx.pathParam("id");
            var postId = ctx.pathParam("postid");
            ctx.result("User ID: " + id);
            ctx.result("User ID: " + id + ";\nPost num: " + postId);
        });

        app.start(7070);
    }
}
