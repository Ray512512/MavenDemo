package main.java;
import com.blade.Blade;

public class Application {

    public static void main(String[] args){
//        Blade.me() .start(Application.class, args);
//        Blade.me().listen(880).start(Application.class, args);
        Blade me=Blade.me();
        me.listen("http://116.85.54.60",890).get("/", (request, response) -> response.text("Hello XiFU"))
           .start(Application.class, args);
    }

}
