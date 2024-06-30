/*
 Navicat Premium Data Transfer

 Source Server         : localhost8
 Source Server Type    : MySQL
 Source Server Version : 80036
 Source Host           : localhost:3306
 Source Schema         : mp_db

 Target Server Type    : MySQL
 Target Server Version : 80036
 File Encoding         : 65001

 Date: 30/06/2024 15:03:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `age` int(0) NOT NULL,
  `tel` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1807305612605255682, 'name_bbf737a68ff5', 'password_51456f17ddd4', 45, 'tel_5a67b613bfa8');
INSERT INTO `user` VALUES (1807305827621965826, 'ytazwc', 'ytazwc', 21, '13278785656');
INSERT INTO `user` VALUES (1807305898274988034, 'yt', 'yt', 22, '13278785656');
INSERT INTO `user` VALUES (1807305943162449922, 'zwc', 'zwc', 21, '13278785656');
INSERT INTO `user` VALUES (1807305995599630337, 'hml', 'hml', 21, '13278785656');
INSERT INTO `user` VALUES (1807306052650541058, 'qly', 'qly', 17, '18956565656');
INSERT INTO `user` VALUES (1807306141318189058, 'mgy', 'mgy', 19, '13465658787');

SET FOREIGN_KEY_CHECKS = 1;
