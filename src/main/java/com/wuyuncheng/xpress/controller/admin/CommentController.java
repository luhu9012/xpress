package com.wuyuncheng.xpress.controller.admin;

import com.wuyuncheng.xpress.model.dto.CommentDetailDTO;
import com.wuyuncheng.xpress.service.CommentService;
import com.wuyuncheng.xpress.util.MessageResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @ApiOperation("获取评论列表")
    @GetMapping("/comments")
    @ResponseStatus(HttpStatus.OK)
    public List<CommentDetailDTO> listComments() {
        return commentService.listComments();
    }

    @ApiOperation("删除评论")
    @DeleteMapping("/comments/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteComment(@PathVariable Integer id) {
        Assert.notNull(id, "评论 ID 不能为空");
        commentService.deleteComment(id);
    }

    @ApiOperation("设置评论通过审核")
    @PatchMapping("/comments/{id}/approve")
    @ResponseStatus(HttpStatus.OK)
    public MessageResponse reviewComment(@PathVariable Integer id) {
        Assert.notNull(id, "评论 ID 不能为空");
        commentService.reviewComment(id);
        return MessageResponse.message("评论审核成功");
    }

}
