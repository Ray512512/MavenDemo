package main.java;

import com.blade.Blade;
import com.blade.mvc.handler.RouteHandler;
import com.blade.mvc.http.Request;
import com.blade.mvc.http.Response;
import main.java.dao.HomeController;

public class Application {

    public static void main(String[] args){
//        Blade.me() .start(Application.class, args);
//        Blade.me().listen(880).start(Application.class, args);
        Blade me=Blade.me();
        me.register(HomeController.class);
        me.get("/", (request, response) -> response.text("Hello XiFU"))
               /* .post("/family", new RouteHandler() {
            @Override
            public void handle(Request request, Response response) {
                response.text("注册成功");
            }
        })*/.start(Application.class, args);
    }
}
