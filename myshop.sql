/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : myshop

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2022-02-11 22:46:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for power
-- ----------------------------
DROP TABLE IF EXISTS `power`;
CREATE TABLE `power` (
  `power_id` int(11) NOT NULL AUTO_INCREMENT,
  `power` varchar(255) NOT NULL,
  PRIMARY KEY (`power_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of power
-- ----------------------------
INSERT INTO `power` VALUES ('1', '管理员');
INSERT INTO `power` VALUES ('2', '商家');
INSERT INTO `power` VALUES ('3', '用户');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(255) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `loginName` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `headPath` varchar(255) DEFAULT NULL,
  `mobileNumber` varchar(255) DEFAULT NULL,
  `user_power` int(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `power_id` (`user_power`),
  CONSTRAINT `power_id` FOREIGN KEY (`user_power`) REFERENCES `power` (`power_id`)
) ENGINE=InnoDB AUTO_INCREMENT=56622 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('56552', '2', '2', '2', '2', '2', '2', '2');
INSERT INTO `user` VALUES ('56558', '666', '666', '666', '666', '', '666', '2');
INSERT INTO `user` VALUES ('56605', '789', '789', '789', '789', '', '789', '1');
INSERT INTO `user` VALUES ('56606', '789', '789', '789', '789', '', '789', '1');
INSERT INTO `user` VALUES ('56607', '789', '789', '789', '789', '', '789', '1');
INSERT INTO `user` VALUES ('56608', '789', '789', '789', '789', '', '789', '1');
INSERT INTO `user` VALUES ('56609', '789', '789', '789', '789', '', '789', '1');
INSERT INTO `user` VALUES ('56610', '789', '789', '789', '789', '', '789', '1');
INSERT INTO `user` VALUES ('56611', '789', '789', '789', '789', '', '789', '1');
INSERT INTO `user` VALUES ('56612', '789', '789', '789', '789', '', '789', '1');
INSERT INTO `user` VALUES ('56613', '789', '789', '789', '789', '', '789', '1');
INSERT INTO `user` VALUES ('56614', '789', '789', '789', '789', '', '789', '1');
INSERT INTO `user` VALUES ('56615', '789', '789', '789', '789', '', '789', '1');
INSERT INTO `user` VALUES ('56616', '789', '789', '789', '789', '', '789', '1');
INSERT INTO `user` VALUES ('56617', '789', '789', '789', '789', '', '789', '1');
INSERT INTO `user` VALUES ('56618', '789', '789', '789', '789', '', '789', '1');
INSERT INTO `user` VALUES ('56619', '789', '789', '789', '789', '', '789', '1');
INSERT INTO `user` VALUES ('56620', '789', '789', '789', '789', '', '789', '1');
INSERT INTO `user` VALUES ('56621', '789', '789', '789', '789', '', '789', '1');
