-- 用户表
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_id` int(11) DEFAULT NULL COMMENT '角色ID',
  `user_name` varchar(100) DEFAULT NULL COMMENT '用户名',
  `real_name` varchar(100) DEFAULT NULL COMMENT '真实名',
  `password` varchar(50) DEFAULT '1' COMMENT '密码',
  `small_image` varchar(200) DEFAULT NULL COMMENT '头像',
  `email` varchar(100) DEFAULT NULL COMMENT '电子邮件',
  `phone` varchar(200) DEFAULT NULL COMMENT '电话号码',
  `mobile` varchar(20) DEFAULT NULL COMMENT '手机号',
  `qq` varchar(50) DEFAULT NULL COMMENT 'QQ',
  `msn` varchar(50) DEFAULT NULL COMMENT 'MSN',
  `last_login_dt` datetime DEFAULT NULL COMMENT '最后登录时间',
  `user_type` int(11) DEFAULT NULL COMMENT '用户类型（0：管理员，1：普通用户）',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  `identity_code` varchar(64) DEFAULT NULL COMMENT '身份证号码',
  `create_by` int(11) DEFAULT NULL COMMENT '创建人',
  `create_dt` datetime DEFAULT NULL COMMENT '创建时间',
  `create_name` varchar(50) DEFAULT NULL COMMENT '创建人姓名',
  `modify_by` int(11) DEFAULT NULL COMMENT '修改人',
  `modify_dt` datetime DEFAULT NULL COMMENT '修改时间',
  `modify_name` varchar(50) DEFAULT NULL COMMENT '修改人姓名',
  `dr` int(11) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `I_SYS_USER_MOBILE` (`mobile`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- 角色表
CREATE TABLE `sys_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_name` varchar(100) DEFAULT NULL COMMENT '角色名称',
  `role_code` varchar(50) DEFAULT NULL COMMENT '角色编码',
  `create_by` int(11) DEFAULT NULL COMMENT '创建人',
  `create_dt` datetime DEFAULT NULL COMMENT '创建时间',
  `create_name` varchar(50) DEFAULT NULL COMMENT '创建人姓名',
  `modify_by` int(11) DEFAULT NULL COMMENT '修改人',
  `modify_dt` datetime DEFAULT NULL COMMENT '修改时间',
  `modify_name` varchar(50) DEFAULT NULL COMMENT '修改人姓名',
  `dr` int(11) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='角色表';