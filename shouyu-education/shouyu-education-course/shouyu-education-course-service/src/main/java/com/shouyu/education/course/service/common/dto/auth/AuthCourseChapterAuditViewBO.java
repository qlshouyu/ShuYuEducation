package com.shouyu.education.course.service.common.dto.auth;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 章节信息-审核
 *
 * @author 高露
 */
@Data
@Accessors(chain = true)
public class AuthCourseChapterAuditViewBO implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<AuthCourseChapterAuditDTO> userCourseChapterAuditListDTO;
}
