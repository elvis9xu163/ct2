package com.xjd.ct.web.ctrlr;

import com.xjd.ct.biz.service.ObjectUpdateService;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.constant.AppConstant;
import com.xjd.ct.utl.context.AppContext;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;
import com.xjd.ct.web.util.I18NUtil;
import com.xjd.ct.web.util.SessionContextUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.Map;

/**
 * @author elvis.xu
 * @since 2015-05-26 22:02
 */
@Controller
@RequestMapping("/admin/topic")
public class TopicController {
    private static Logger log = LoggerFactory.getLogger(TopicController.class);

    @Autowired
    ObjectUpdateService objectUpdateService;

    @RequestMapping("/edit/input")
    public String input() {
        return "admin/topic_edit";
    }

    @RequestMapping("/edit")
    public String edit(@RequestParam(value = "id", required = false) String id,
                       @RequestParam(value = "title", required = false) String title,
                       @RequestParam(value = "summary", required = false) String summary,
                       @RequestParam(value = "img", required = false) String img) {

        String errCode, errMsg;
        try {
            if (StringUtils.isBlank(id)) { // 新增文件
                objectUpdateService.addTopic(SessionContextUtil.getUser().getUserId(), title, summary, img);
            } else { // 编辑文件

            }
            errCode = RespCode.RESP_0000;
            errMsg = I18NUtil.getMsg(errCode);
        } catch (Exception e) {

            if (e instanceof BusinessException) {
                errCode = ((BusinessException) e).getCode();
                errMsg = ((BusinessException) e).getMsg();
            } else {
                log.error("", e);
                errCode = RespCode.RESP_9999;
                errMsg = I18NUtil.getMsg(errCode);
            }
        }

        return "admin/topic_edit";
    }
}
