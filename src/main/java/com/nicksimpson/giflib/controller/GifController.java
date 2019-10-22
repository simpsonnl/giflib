package com.nicksimpson.giflib.controller;

import com.nicksimpson.giflib.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class GifController {
    @RequestMapping("/")
    public String listGifs(){
        return "home";
    }
    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap){
        Gif gif = new Gif("cowboy-coder", LocalDate.of(2019,8, 12), "simpsonnl", true);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}
