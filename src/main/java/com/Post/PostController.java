package com.Post;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.LinkedList;
import java.util.List;

@Controller
public class PostController {

    @RequestMapping("/viewposts")
    public String posts(@RequestParam(value="sort", required=false, defaultValue="popular") String sort, Model model){
        List<Post> postList = new LinkedList();
        Post post = new Post();
        post.setEvent("Bike Night!");
        post.setLocationName("The Clubhouse");
        post.setAddInfo("$2 Pints");
        post.setStartTime("12:00AM");
        post.setEndTime("3:00AM");
        post.setAmountGoing(15);

        Post postone = new Post();
        postone.setEvent("Bike Night!");
        postone.setLocationName("The Clubhouse");
        postone.setAddInfo("$2 Pints");
        postone.setStartTime("12:00AM");
        postone.setEndTime("3:00AM");
        postone.setAmountGoing(15);

        postList.add(post);
        postList.add(postone);
        model.addAttribute("postlist", postList);
        return "viewposts";
    }
}
