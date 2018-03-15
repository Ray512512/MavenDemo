package main.java.dao;

import com.blade.Blade;
import com.blade.mvc.annotation.JSON;
import com.blade.mvc.annotation.Param;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.annotation.PostRoute;
import com.blade.mvc.ui.RestResponse;
import main.java.Application;

@Path(value = "family")
public class HomeController {
    @PostRoute("test")
    @JSON
    public RestResponse register(@Param String test) {
        if(test!=null){
            return RestResponse.ok(test);
        } else {
            return RestResponse.fail("数据不能为空");
        }
    }
}
