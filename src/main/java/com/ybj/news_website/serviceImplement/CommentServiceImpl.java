package com.ybj.news_website.serviceImplement;

import com.ybj.news_website.mapper.CommentMapper;
import com.ybj.news_website.model.Comment;
import com.ybj.news_website.serviceInterface.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import com.ybj.news_website.mapper.CommentMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentMapper commentMapper;

    @Override
    public void Insert(Comment comment) {
        commentMapper.Insert(comment);
    }

    @Override
    public List<Comment> SelectAll(Integer article_id) {
        return commentMapper.SelectAll(article_id);
    }
}
