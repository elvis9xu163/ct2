package com.xjd.ct.web.ctrlr;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xjd.ct.biz.service.ObjectUpdateService;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.constant.AppConstant;
import com.xjd.ct.utl.context.AppContext;
import com.xjd.ct.web.util.SessionContextUtil;

/**
 * @author elvis.xu
 * @since 2015-05-26 22:02
 */
@Controller
@RequestMapping("/admin/article")
public class ArticleController {
    private static Logger log = LoggerFactory.getLogger(ArticleController.class);

    @Autowired
    ObjectUpdateService objectUpdateService;

    @RequestMapping("/edit/input")
    public String articleEditInput() {
        return "admin/article_edit";
    }


    @RequestMapping("/edit/text/edit")
    public String articleEditInput(@RequestParam(value = "text", required = false) String text,
                                   @RequestParam(value = "articleId", required = false) String articleId,
                                   HttpServletRequest request, Map map) throws IOException {


        if (StringUtils.isBlank(articleId)) {
            articleId = DateUtil.format(new Date(), DateUtil.PATTERN_YEAR2MILLISECOND);
        }

        if (text == null) {
            text = "";
        }

        String realPath = AppContext.getProperty(AppConstant.ARTICLE_ROOT_PATH_KEY) + "/" + articleId + ".html";

        String url = AppContext.getProperty(AppConstant.ARTICLE_URL_PREIFX_KEY) + articleId + ".html";

        log.trace("文章内容: " + realPath + ", " + url);


        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(realPath), "utf8"));
        writer.write(text);
        writer.flush();
        writer.close();

        map.put("articleId", articleId);
        map.put("url", url);

        return "admin/article_text_result";
    }

    @RequestMapping("/edit")
    public String articleEditInput(@RequestParam(value = "id", required = false) String id,
                                   @RequestParam(value = "title", required = false) String title,
                                   @RequestParam(value = "summary", required = false) String summary,
                                   @RequestParam(value = "img", required = false) String img,
                                   @RequestParam(value = "link", required = false) String link) {

        if (StringUtils.isBlank(id)) { // 新增文件
            objectUpdateService.addArticle(SessionContextUtil.getUser().getUserId(), title, summary, img, link);
        } else { // 编辑文件

        }

        return "admin/article_result";
    }
}
