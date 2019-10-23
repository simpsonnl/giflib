package com.nicksimpson.giflib.controller;

import com.nicksimpson.giflib.data.GifRepository;
import com.nicksimpson.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchController {

    @Autowired
    GifRepository gifRepository;

    @RequestMapping("/search")
    public String searchResults(@RequestParam String q, ModelMap modelMap){
        List<Gif> gifs = gifRepository.getSearchResults(q);
        modelMap.put("gifs", gifs);
        return "search";
    }
}
