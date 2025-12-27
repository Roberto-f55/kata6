package software.ulpgc.kata6;

import io.javalin.Javalin;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create();
        app.get("/hello", Main::hello);
        app.get("/MerryC", Main::merryC);
        app.start(8080);
    }

    private static void hello(@NotNull Context context) {
        context.status(200);
        context.result("Hello world!");
    }

    private static void merryC(@NotNull Context context) {
        context.status(200);
        String name = context.queryParam("name");
        context.json("Feliz navidad " + name);
    }
}
