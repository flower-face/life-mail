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

 Date: 08/11/2018 22:47:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for mail_attachment
-- ----------------------------
DROP TABLE IF EXISTS `mail_attachment`;
CREATE TABLE `mail_attachment` (
  `id` bigint(20) NOT NULL,
  `created` bigint(20) NOT NULL COMMENT '创建时间',
  `updated` bigint(20) NOT NULL COMMENT '修改时间',
  `created_by` bigint(20) NOT NULL COMMENT '创建人',
  `updated_by` bigint(20) NOT NULL COMMENT '修改人',
  `deleted` int(2) NOT NULL COMMENT '删除标识',
  `file_name` varchar(255) COLLATE utf8mb4_bin NOT NULL COMMENT '附件名称',
  `file_path` varchar(255) COLLATE utf8mb4_bin NOT NULL COMMENT '附件地址',
  `file_size` bigint(20) DEFAULT NULL COMMENT '附件大小',
  `mail_id` bigint(20) NOT NULL COMMENT '邮件id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Table structure for mail_info
-- ----------------------------
DROP TABLE IF EXISTS `mail_info`;
CREATE TABLE `mail_info` (
  `id` bigint(20) NOT NULL,
  `receiver` varchar(255) COLLATE utf8mb4_bin NOT NULL COMMENT '接收者',
  `subject` varchar(255) COLLATE utf8mb4_bin NOT NULL COMMENT '邮件主题',
  `content` text COLLATE utf8mb4_bin NOT NULL COMMENT '邮件内容',
  `created` bigint(20) NOT NULL COMMENT '创建时间',
  `updated` bigint(20) NOT NULL COMMENT '修改时间',
  `deleted` int(2) NOT NULL COMMENT '删除标识，0-> 未删除 1->已删除',
  `created_by` bigint(20) NOT NULL COMMENT '创建人',
  `updated_by` bigint(20) NOT NULL COMMENT '修改人',
  `classify` enum('sample','html','attachment','resource') COLLATE utf8mb4_bin NOT NULL COMMENT '邮件类型，sample、html、attachments、resource',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

SET FOREIGN_KEY_CHECKS = 1;
