-- 停车场基本信息表
CREATE TABLE `bs_parking_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) DEFAULT NULL COMMENT '停车场名称',
  `addr` varchar(300) DEFAULT NULL COMMENT '停车场地址',
  `input_user` int(11) DEFAULT NULL COMMENT '信息录入人',
  `input_time` datetime DEFAULT NULL COMMENT '信息录入时间',
  `developer_name` varchar(100) DEFAULT NULL COMMENT '开发商名称',
  `manager_name` varchar(100) DEFAULT NULL COMMENT '管理方名称',
  `operater_name` varchar(100) DEFAULT NULL COMMENT '运营方名称',
  `property_name` varchar(100) DEFAULT NULL COMMENT '物业名称',
  `equipment` varchar(100) DEFAULT NULL COMMENT '设备',
  `properties` varchar(50) DEFAULT NULL COMMENT '停车场性质',
  `type` int(11) DEFAULT NULL COMMENT '停车场类型',
  `property_rights` varchar(50) DEFAULT NULL COMMENT '产权年限',
  `manager_rights` varchar(50) DEFAULT NULL COMMENT '贷后管理年限',
  `level` varchar(20) DEFAULT NULL COMMENT '停车场评级',
  `total` int(11) DEFAULT NULL COMMENT '停车场车位总数量',
  `manager_total` int(11) DEFAULT NULL COMMENT '停车场贷后管理车位总数量',
  `file_id` varchar(100) DEFAULT NULL COMMENT '资源文件ID',
  `create_by` int(11) DEFAULT NULL COMMENT '创建人',
  `create_dt` datetime DEFAULT NULL COMMENT '创建时间',
  `create_name` varchar(50) DEFAULT NULL COMMENT '创建人姓名',
  `modify_by` int(11) DEFAULT NULL COMMENT '修改人',
  `modify_dt` datetime DEFAULT NULL COMMENT '修改时间',
  `modify_name` varchar(50) DEFAULT NULL COMMENT '修改人姓名',
  `dr` int(11) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='停车场基本信息表';

-- 车位基本信息表
CREATE TABLE `bs_parking_lot_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `parking_id` int(11) DEFAULT NULL COMMENT '停车场ID',
  `code` varchar(50) DEFAULT NULL COMMENT '车位编号',
  `lot_no` varchar(50) DEFAULT NULL COMMENT '车位证编号',
  `owner` int(11) DEFAULT NULL COMMENT '车位所有人',
  `owner_mobile` varchar(20) DEFAULT NULL COMMENT '所有人联系电话',
  `valuation` decimal(16,2) DEFAULT NULL COMMENT '车位估值',
  `purchase_price` decimal(16,2) DEFAULT NULL COMMENT '车位购入总价',
  `type` int(11) DEFAULT NULL COMMENT '车位类型',
  `prrchase_time` datetime DEFAULT NULL COMMENT '购入时间',
  `status` int(11) DEFAULT NULL COMMENT '车位当前状态',
  `create_by` int(11) DEFAULT NULL COMMENT '创建人',
  `create_dt` datetime DEFAULT NULL COMMENT '创建时间',
  `create_name` varchar(50) DEFAULT NULL COMMENT '创建人姓名',
  `modify_by` int(11) DEFAULT NULL COMMENT '修改人',
  `modify_dt` datetime DEFAULT NULL COMMENT '修改时间',
  `modify_name` varchar(50) DEFAULT NULL COMMENT '修改人姓名',
  `dr` int(11) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `parking_id_index` (`parking_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='车位基本信息表';

-- 车位销售信息表
CREATE TABLE `bs_lot_sale_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `parking_id` int(11) DEFAULT NULL COMMENT '停车场ID',
  `parking_lot_id` int(11) DEFAULT NULL COMMENT '车位ID',
  `subscriber` int(11) DEFAULT NULL COMMENT '认购人',
  `subscription_time` datetime DEFAULT NULL COMMENT '认购时间',
  `subscriber_mobile` varchar(20) DEFAULT NULL COMMENT '认购人电话',
  `saleman` int(11) DEFAULT NULL COMMENT '销售人',
  `price` decimal(16,2) DEFAULT NULL COMMENT '成交价格',
  `addr_file_id` varchar(100) DEFAULT NULL COMMENT '车位位置图ID',
  `verify_file_id` varchar(100) DEFAULT NULL COMMENT '车位证ID',
  `create_by` int(11) DEFAULT NULL COMMENT '创建人',
  `create_dt` datetime DEFAULT NULL COMMENT '创建时间',
  `create_name` varchar(50) DEFAULT NULL COMMENT '创建人姓名',
  `modify_by` int(11) DEFAULT NULL COMMENT '修改人',
  `modify_dt` datetime DEFAULT NULL COMMENT '修改时间',
  `modify_name` varchar(50) DEFAULT NULL COMMENT '修改人姓名',
  `dr` int(11) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `parking_id_index` (`parking_id`) USING BTREE,
  KEY `parking_lot_id_index` (`parking_lot_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='车位销售信息表';

-- 贷款车位信息表
CREATE TABLE `bs_lot_loans_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `parking_id` int(11) DEFAULT NULL COMMENT '停车场ID',
  `parking_lot_id` int(11) DEFAULT NULL COMMENT '车位ID',
  `loans_status` int(11) DEFAULT NULL COMMENT '贷款状态',
  `loans_period` varchar(50) DEFAULT NULL COMMENT '贷款周期',
  `loans_rate` decimal(16,4) DEFAULT NULL COMMENT '贷款利率',
  `late_status` int(11) DEFAULT NULL COMMENT '逾期状态',
  `late_times` int(11) DEFAULT NULL COMMENT '累计逾期次数',
  `create_by` int(11) DEFAULT NULL COMMENT '创建人',
  `create_dt` datetime DEFAULT NULL COMMENT '创建时间',
  `create_name` varchar(50) DEFAULT NULL COMMENT '创建人姓名',
  `modify_by` int(11) DEFAULT NULL COMMENT '修改人',
  `modify_dt` datetime DEFAULT NULL COMMENT '修改时间',
  `modify_name` varchar(50) DEFAULT NULL COMMENT '修改人姓名',
  `dr` int(11) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `parking_id_index` (`parking_id`) USING BTREE,
  KEY `parking_lot_id_index` (`parking_lot_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='贷款车位信息表';

-- 抵押车位信息表
CREATE TABLE `bs_lot_mortgage_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `parking_id` int(11) DEFAULT NULL COMMENT '停车场ID',
  `parking_lot_id` int(11) DEFAULT NULL COMMENT '车位ID',
  `mortgage_status` int(11) DEFAULT NULL COMMENT '抵押贷款状态',
  `mortgage_period` varchar(50) DEFAULT NULL COMMENT '抵押贷款周期',
  `mortgage_rate` decimal(16,4) DEFAULT NULL COMMENT '抵押贷款利率',
  `late_status` int(11) DEFAULT NULL COMMENT '逾期状态',
  `late_times` int(11) DEFAULT NULL COMMENT '累计逾期次数',
  `create_by` int(11) DEFAULT NULL COMMENT '创建人',
  `create_dt` datetime DEFAULT NULL COMMENT '创建时间',
  `create_name` varchar(50) DEFAULT NULL COMMENT '创建人姓名',
  `modify_by` int(11) DEFAULT NULL COMMENT '修改人',
  `modify_dt` datetime DEFAULT NULL COMMENT '修改时间',
  `modify_name` varchar(50) DEFAULT NULL COMMENT '修改人姓名',
  `dr` int(11) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `parking_id_index` (`parking_id`) USING BTREE,
  KEY `parking_lot_id_index` (`parking_lot_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='抵押车位信息表';

-- 月租车信息表
CREATE TABLE `bs_lot_lease_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `parking_id` int(11) DEFAULT NULL COMMENT '停车场ID',
  `parking_lot_id` int(11) DEFAULT NULL COMMENT '车位ID',
  `lease_user` int(11) DEFAULT NULL COMMENT '租赁人',
  `lease_user_mobile` varchar(50) DEFAULT NULL COMMENT '租赁人电话',
  `lease_user_addr` varchar(10) DEFAULT NULL COMMENT '租赁人住址',
  `lease_time` datetime DEFAULT NULL COMMENT '租赁时间',
  `type` int(11) DEFAULT NULL COMMENT '租赁类型（0：月租，1：季租，2：年租）',
  `lease_period` varchar(50) DEFAULT NULL COMMENT '租赁周期',
  `lease_price` decimal(16,4) DEFAULT NULL COMMENT '租金单价',
  `lease_car_no` varchar(50) DEFAULT NULL COMMENT '租赁人车牌号',
  `create_by` int(11) DEFAULT NULL COMMENT '创建人',
  `create_dt` datetime DEFAULT NULL COMMENT '创建时间',
  `create_name` varchar(50) DEFAULT NULL COMMENT '创建人姓名',
  `modify_by` int(11) DEFAULT NULL COMMENT '修改人',
  `modify_dt` datetime DEFAULT NULL COMMENT '修改时间',
  `modify_name` varchar(50) DEFAULT NULL COMMENT '修改人姓名',
  `dr` int(11) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `parking_id_index` (`parking_id`) USING BTREE,
  KEY `parking_lot_id_index` (`parking_lot_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='月租车信息表';

-- 车位日志表
CREATE TABLE `bs_lot_log_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `parking_id` int(11) DEFAULT NULL COMMENT '停车场ID',
  `parking_lot_id` int(11) DEFAULT NULL COMMENT '车位ID',
  `change_status` int(11) DEFAULT NULL COMMENT '变更状态（0：产权变更，1：车位租赁，2：贷款逾期，3：其他）',
  `change_time` datetime DEFAULT NULL COMMENT '变更时间',
  `change_content` varchar(200) DEFAULT NULL COMMENT '变更记录',
  `create_by` int(11) DEFAULT NULL COMMENT '创建人',
  `create_dt` datetime DEFAULT NULL COMMENT '创建时间',
  `create_name` varchar(50) DEFAULT NULL COMMENT '创建人姓名',
  `modify_by` int(11) DEFAULT NULL COMMENT '修改人',
  `modify_dt` datetime DEFAULT NULL COMMENT '修改时间',
  `modify_name` varchar(50) DEFAULT NULL COMMENT '修改人姓名',
  `dr` int(11) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `parking_id_index` (`parking_id`) USING BTREE,
  KEY `parking_lot_id_index` (`parking_lot_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='车位日志表';