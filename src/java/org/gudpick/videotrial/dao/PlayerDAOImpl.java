/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gudpick.videotrial.dao;

import java.util.List;

import org.gudpick.videotrial.entity.Video;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerDAOImpl implements PlayerDAO {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public List<Video> getVideos() {
        Session session=sessionFactory.getCurrentSession();
        Query<Video> theQuery=session.createQuery("from Video",Video.class);
        List<Video> videos=theQuery.getResultList();
        return videos;
    }

    @Override
    public Video getVideo(int theId) {
        Session session=sessionFactory.getCurrentSession();
        Video video=session.get(Video.class, theId);
        return video;
    }
    
}
