/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gudpick.videotrial.dao;

import java.util.List;
import org.gudpick.videotrial.entity.Video;

/**
 *
 * @author Indu
 */
public interface PlayerDAO {
    public List<Video> getVideos();

    public Video getVideo(int theId);
}
