package com.xjd.ct.web.ctrlr;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.xjd.ct.biz.bo.ObjectBo;
import com.xjd.ct.biz.bo.SchoolBo;
import com.xjd.ct.biz.service.ObjectQueryService;
import com.xjd.ct.biz.service.ObjectUpdateService;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;
import com.xjd.ct.web.util.I18NUtil;
import com.xjd.ct.web.util.SessionContextUtil;

/**
 * @author elvis.xu
 * @since 2015-05-26 22:02
 */
@Controller
@RequestMapping("/admin/school")
public class SchoolController {
	private static Logger log = LoggerFactory.getLogger(SchoolController.class);

	@Autowired
	ObjectUpdateService objectUpdateService;
	@Autowired
	ObjectQueryService objectQueryService;

	@RequestMapping("/list")
	public String list(Map map) {
		List<ObjectBo> objectBoList = objectQueryService.listAllSchools();
		map.put("objectList", objectBoList);
		return "admin/school_list";
	}

	@RequestMapping("/edit/input")
	public String editInput(@RequestParam(value = "id", required = false) String id,Map map) {
		if (StringUtils.isNotBlank(id)) {
			SchoolBo schoolBo = objectQueryService.getSchoolByObjectId(Long.valueOf(id));
			map.put("school", schoolBo);
		}
		return "admin/school_edit";
	}

	@RequestMapping("/edit")
	public String edit(@RequestParam(value = "id", required = false) String id,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "phone", required = false) String phone,
			@RequestParam(value = "address", required = false) String address,
			@RequestParam(value = "lon", required = false) String lon,
			@RequestParam(value = "lat", required = false) String lat,
			@RequestParam(value = "region", required = false) String region,
			@RequestParam(value = "nature", required = false) String nature,
			@RequestParam(value = "grade", required = false) String grade,
			@RequestParam(value = "intro", required = false) String intro,
			@RequestParam(value = "teacher", required = false) String teacher,
			@RequestParam(value = "cost", required = false) String cost,
			@RequestParam(value = "course", required = false) String course,
			@RequestParam(value = "requistion", required = false) String requistion,
			@RequestParam(value = "flow", required = false) String flow,
			@RequestParam(value = "audit", required = false) String audit,
			@RequestParam(value = "listPic", required = false) String listPic,
			@RequestParam(value = "pic1", required = false) String pic1,
			@RequestParam(value = "pic2", required = false) String pic2,
			@RequestParam(value = "pic3", required = false) String pic3,
			@RequestParam(value = "pic4", required = false) String pic4,
			@RequestParam(value = "pic5", required = false) String pic5, RedirectAttributes redirectAttributes) {

		String errCode, errMsg;
		try {
			SchoolBo schoolBo = new SchoolBo();
			schoolBo.setSchoolName(name);
			schoolBo.setSchoolPhone(phone);
			schoolBo.setSchoolAddress(address);
			schoolBo.setSchoolLon(Double.valueOf(lon));
			schoolBo.setSchoolLat(Double.valueOf(lat));
			schoolBo.setSchoolRegion(region);
			schoolBo.setSchoolNature(Byte.valueOf(nature));
			schoolBo.setSchoolGrade(Byte.valueOf(grade));
			schoolBo.setSchoolIntro(intro);
			schoolBo.setSchoolTeacher(teacher);
			schoolBo.setSchoolCost(cost);
			schoolBo.setSchoolCourse(course);
			schoolBo.setSchoolRequisition(requistion);
			schoolBo.setSchoolFlow(flow);
			schoolBo.setAuditStatus(Byte.valueOf(audit));
			List<String> pics = new ArrayList<String>(7);
			pics.add(listPic);
			pics.add(pic1);
			pics.add(pic2);
			pics.add(pic3);
			pics.add(pic4);
			pics.add(pic5);
			if (StringUtils.isBlank(id)) { // 新增学校
				objectUpdateService.addSchool(SessionContextUtil.getUser().getUserId(), schoolBo, pics);
			} else { // 编辑学校
				schoolBo.setObjectId(Long.valueOf(id));
				objectUpdateService.updateSchool(SessionContextUtil.getUser().getUserId(), schoolBo, pics);
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

		redirectAttributes.addAttribute("errCode", errCode);
		try {
			redirectAttributes.addAttribute("errMsg", URLEncoder.encode(errMsg, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			throw new BusinessException(RespCode.RESP_9999, e);
		}
		return "redirect:/admin/school/edit/input";
	}
}
