package com.xjd.ct.utl.constant;

/**
 * 全局常量
 * @author elvis.xu
 * @since 2015-03-23 13:15
 */
public interface AppConstant {
	/** 匿名用户ID */
	Long ANONYMOUS_USERID = 0L;
	
	/** 资源文件保存的根路径 */
	String RESOURCE_ROOT_PATH_KEY = "resource.root";
	/** 资源文件保存的临时路径 */
	String RESOURCE_TMP_PATH_KEY = "resource.tmp";

	/** 文章文件保存的根路径 */
	String ARTICLE_ROOT_PATH_KEY = "article.root";
	/** 文章文件访问的URL前缀 */
	String ARTICLE_URL_PREIFX_KEY = "article.url.prefix";
}
