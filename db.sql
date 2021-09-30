drop database  IF EXISTS log;
create DATABASE log;
use log;
DROP TABLE IF EXISTS `log_api_action`;
CREATE TABLE `log_api_action`  (
                                   `id` int NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                   `action` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '接口地址',
                                   `create_time` datetime NULL DEFAULT NULL COMMENT '调用时间',
                                   `create_user` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用人',
                                   PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '接口调用日志' ROW_FORMAT = Dynamic;
INSERT INTO `log_api_action` VALUES (1, 'test', '2021-09-30 14:34:40', 'xxc');

drop database  IF EXISTS his;
create DATABASE his;
use his;
DROP TABLE IF EXISTS `his_hospital`;
CREATE TABLE `his_hospital`  (
                                 `id` int NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                 `hospital_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '医院编码',
                                 `hospital_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '医院名字',
                                 `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
                                 `update_user` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '更新用户',
                                 PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 45 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '医院信息表' ROW_FORMAT = Dynamic;
INSERT INTO `his_hospital` VALUES (2, 'TEST', '测试使用医院', '2031-09-03 13:56:33', NULL);
INSERT INTO `his_hospital` VALUES (6, 'SZYY01', '测试-医院01', '2021-09-03 13:56:46', NULL);
INSERT INTO `his_hospital` VALUES (10, 'TEST-YJW', '测试医院-YJW', '2021-09-07 14:25:08', NULL);
INSERT INTO `his_hospital` VALUES (11, 'XUE-TEST', 'XUE-测试医院', '2021-09-07 20:11:45', NULL);
INSERT INTO `his_hospital` VALUES (41, 'GZSBJSNYXRMYY-0913', '纳雍0913新增', '2021-09-13 13:20:48', NULL);
INSERT INTO `his_hospital` VALUES (43, 'Test', '测试', '2021-09-17 08:48:24', NULL);

drop database  IF EXISTS dict;
create DATABASE dict;
use dict;
DROP TABLE IF EXISTS `dict_disease`;
CREATE TABLE `dict_disease`  (
                                 `id` int NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                 `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '疾病编码',
                                 `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '疾病名称',
                                 `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
                                 `update_user` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '更新用户',
                                 PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '疾病字典' ROW_FORMAT = DYNAMIC;
INSERT INTO `dict_disease` VALUES (1, '1', '感冒', '2021-09-30 14:34:57', 'xxc');


