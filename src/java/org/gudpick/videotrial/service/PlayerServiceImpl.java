/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gudpick.videotrial.service;

import java.util.List;
import javax.transaction.Transactional;
import org.gudpick.videotrial.dao.PlayerDAO;
import org.gudpick.videotrial.entity.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerDAO playerDAO;
    
    @Override
    @Transactional
    public List<Video> getVideos() {
        return playerDAO.getVideos();
    }

    @Override
    @Transactional
    public Video getVideo(int theId) {
        return playerDAO.getVideo(theId);
    }
    
}
