package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(config -> {config.plugins.enableDevLogging();});
        app.get("/", ctx -> ctx.result("HelloWord"));

        app.get("/users", ctx -> ctx.result("executes GET /users"));
        app.post("/users", ctx -> ctx.result("executes POST /users"));

        app.get("/hello", ctx -> {
            var name = ctx.queryParam("name");
            if (name == null) {
                ctx.result("Hello, World!");
            } else { ctx.result("Hello, " + name + "!"); }
        });

        app.start(7070);
    }
}
