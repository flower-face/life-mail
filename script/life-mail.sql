/*
 Navicat Premium Data Transfer

 Source Server         : local-mac
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : life-mail

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 28/09/2018 11:33:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for mail_info
-- ----------------------------
DROP TABLE IF EXISTS `mail_info`;
CREATE TABLE `mail_info` (
  `id` bigint(20) NOT NULL,
  `receiver` varchar(255) COLLATE utf8mb4_bin NOT NULL COMMENT '接收者',
  `mail_subject` varchar(255) COLLATE utf8mb4_bin NOT NULL COMMENT '邮件主题',
  `mail_content` text COLLATE utf8mb4_bin NOT NULL COMMENT '邮件内容',
  `file_path` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '附件地址',
  `created` datetime DEFAULT NULL COMMENT '创建时间',
  `updated` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

SET FOREIGN_KEY_CHECKS = 1;
