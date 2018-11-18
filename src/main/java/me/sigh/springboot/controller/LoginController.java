package me.sigh.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class LoginController {

    private static final Map<String, String> success = new HashMap<String, String>() {{

        put("code", "000000");
        put("result", "success");
        put("error", "");
    }};

    private static final Map<String, String> failed = new HashMap<String, String>() {{
        put("code", "100000");
        put("result", "failed");
        put("error", "invalid");

    }};

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(String username, String password) {

        if ("test".equals(username) && "123".equals(password)) {
            return JSONObject.toJSONString(success);
        }
        return JSONObject.toJSONString(failed);
    }


}
