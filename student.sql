/*
 Navicat MySQL Data Transfer

 Source Server         : mewpython2
 Source Server Type    : MySQL
 Source Server Version : 80031
 Source Host           : localhost:3306
 Source Schema         : student_system

 Target Server Type    : MySQL
 Target Server Version : 80031
 File Encoding         : 65001

 Date: 12/01/2023 22:22:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `classNumber` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `enterTime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('052106112', '林黄骁', '男', '101', '2023-01-12 21:58:56');
INSERT INTO `student` VALUES ('052106113', '林红骁', '女', '996', '2023-01-12 22:02:21');
INSERT INTO `student` VALUES ('052106114', '林绿骁', '男', '114', '2023-01-12 22:02:51');
INSERT INTO `student` VALUES ('222200231', '游竣超', '男', '110', '2023-01-12 22:01:01');
INSERT INTO `student` VALUES ('222200314', '吴荣榜', '男', '111', '2023-01-12 22:00:27');

SET FOREIGN_KEY_CHECKS = 1;
