/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gudpick.videotrial.controller;

import java.util.List;
import org.gudpick.videotrial.entity.Video;
import org.gudpick.videotrial.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Indu
 */
@Controller
@RequestMapping("/player")
public class PlayerController {
    
    @Autowired
    private PlayerService playerService;
    
    @RequestMapping("/list")
    public String getVideos(Model theModel)
    {
        List<Video> videos=playerService.getVideos();
        theModel.addAttribute("videos",videos);
        return "list-videos";
    }
    
    @RequestMapping("/playVideo")
    public String getVideo(@RequestParam("videoId") int theId,Model theModel)
    {
        List<Video> videos=playerService.getVideos();
        theModel.addAttribute("videos",videos);
        Video video=playerService.getVideo(theId);
        theModel.addAttribute("video",video);
        return "play-video";
    }
}
