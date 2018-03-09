-- phpMyAdmin SQL Dump
-- version 2.10.2
-- http://www.phpmyadmin.net
-- 
-- 主机: localhost
-- 生成日期: 2014 年 04 月 17 日 12:38
-- 服务器版本: 5.0.90
-- PHP 版本: 5.2.14

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- 数据库: `db_c2c`
-- 

-- --------------------------------------------------------

-- 
-- 表的结构 `t_admin`
-- 

CREATE TABLE `t_admin` (
  `userId` int(11) NOT NULL auto_increment,
  `userName` varchar(50) default NULL,
  `userPw` varchar(50) default NULL,
  PRIMARY KEY  (`userId`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

-- 
-- 导出表中的数据 `t_admin`
-- 

INSERT INTO `t_admin` VALUES (1, 'admin', 'admin');

-- --------------------------------------------------------

-- 
-- 表的结构 `t_catelog`
-- 

CREATE TABLE `t_catelog` (
  `catelog_id` int(11) NOT NULL auto_increment,
  `catelog_name` varchar(50) default NULL,
  `catelog_miaoshu` varchar(255) default NULL,
  `catelog_del` varchar(50) default NULL,
  PRIMARY KEY  (`catelog_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=8 ;

-- 
-- 导出表中的数据 `t_catelog`
-- 

INSERT INTO `t_catelog` VALUES (2, '号码和虚拟物品                                    ', '号码和虚拟物品', 'no');
INSERT INTO `t_catelog` VALUES (3, '通讯手机                                          ', '通讯手机', 'no');
INSERT INTO `t_catelog` VALUES (4, '电脑网络                                          ', '电脑网络', 'no');
INSERT INTO `t_catelog` VALUES (5, '服饰护肤                                          ', '服饰护肤', 'no');
INSERT INTO `t_catelog` VALUES (6, '生活家居                                          ', '生活家居', 'no');
INSERT INTO `t_catelog` VALUES (7, '777778888', '8888888', 'yes');

-- --------------------------------------------------------

-- 
-- 表的结构 `t_gonggao`
-- 

CREATE TABLE `t_gonggao` (
  `gonggao_id` int(11) NOT NULL auto_increment,
  `gonggao_title` varchar(50) default NULL,
  `gonggao_content` varchar(255) default NULL,
  `gonggao_data` varchar(50) default NULL,
  `gonggao_fabuzhe` varchar(50) default NULL,
  `gonggao_del` varchar(50) default NULL,
  `gonggao_one1` varchar(50) default NULL,
  `gonggao_one2` varchar(50) default NULL,
  `gonggao_one3` varchar(50) default NULL,
  `gonggao_one4` varchar(50) default NULL,
  `gonggao_one5` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `gonggao_one6` timestamp NOT NULL default '0000-00-00 00:00:00',
  `gonggao_one7` int(11) default NULL,
  `gonggao_one8` int(11) default NULL,
  PRIMARY KEY  (`gonggao_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

-- 
-- 导出表中的数据 `t_gonggao`
-- 

INSERT INTO `t_gonggao` VALUES (1, '公告公告公告公告公告                              ', '公告公告公告公告公告', '2011-2-22 20:09:34', NULL, NULL, NULL, NULL, NULL, NULL, '2014-04-17 20:36:33', '2014-04-17 20:36:33', NULL, NULL);
INSERT INTO `t_gonggao` VALUES (2, '公告公告公告公告公告                              ', '请输入内容公告公告公告公告公告', '2011-2-22 20:09:42', NULL, NULL, NULL, NULL, NULL, NULL, '2014-04-17 20:36:33', '2014-04-17 20:36:33', NULL, NULL);
INSERT INTO `t_gonggao` VALUES (3, '公告公告公告公告公告                              ', '请输入内容', '2011-2-22 20:09:45', NULL, NULL, NULL, NULL, NULL, NULL, '2014-04-17 20:36:33', '2014-04-17 20:36:33', NULL, NULL);
INSERT INTO `t_gonggao` VALUES (4, '公告公告公告公告公告                              ', '请输入内容', '2011-2-22 20:09:53', NULL, NULL, NULL, NULL, NULL, NULL, '2014-04-17 20:36:33', '2014-04-17 20:36:33', NULL, NULL);
INSERT INTO `t_gonggao` VALUES (5, '3月底打折', '3月底打折6天', '2012-3-27 19:46:24', NULL, NULL, NULL, NULL, NULL, NULL, '2014-04-17 20:36:33', '2014-04-17 20:36:33', NULL, NULL);

-- --------------------------------------------------------

-- 
-- 表的结构 `t_goods`
-- 

CREATE TABLE `t_goods` (
  `goods_id` int(11) NOT NULL auto_increment,
  `goods_name` varchar(50) default NULL,
  `goods_miaoshu` varchar(255) default NULL,
  `fujian` varchar(50) default NULL,
  `goods_dijia` int(11) default NULL,
  `goods_catelog_id` int(11) default NULL,
  `goods_user_id` int(11) default NULL,
  `goods_shijian` varchar(50) default NULL,
  `goods_del` varchar(50) default NULL,
  PRIMARY KEY  (`goods_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=14 ;

-- 
-- 导出表中的数据 `t_goods`
-- 

INSERT INTO `t_goods` VALUES (1, 'hp3039笔记本', '<p>8成新。有发票</p>', '/upload/1300478649875.jpg', 2000, 4, 1, '2012-3-23 19:44:10', 'no');
INSERT INTO `t_goods` VALUES (2, '联想台式机5623', '联想台式机5623，9诚信', '/upload/1300478705078.jpg', 500, 4, 1, '2012-3-23 19:48:14', 'no');
INSERT INTO `t_goods` VALUES (3, '新柯达M340相机', '<div class="Q_5">\r\n<div class="Q_8">\r\n<p>380元千万像素95成新柯达M340相机</p>\r\n<p>超薄机身M340 智能场景模式 能自动根据环境变化切换拍照模式 真实1000万像素，3倍光学变焦，高感光度 2.7液晶屏 带P档手动 数码防抖有效防止手抖造成模糊&nbsp; 高清照片拍摄 面部追踪功能 支持自连拍 微距功能（开网店拍证文字花草工程效果图等）多种场景模式和色彩模式 闪光防红眼&nbsp; 全景拍摄风景照更震撼 照片误删除后恢复功能 高品质有声录像可连续', '/upload/1300478788375.jpg', 563, 4, 1, '2012-3-23 19:54:14', 'no');
INSERT INTO `t_goods` VALUES (4, '三星p1000手机', '请输入内容', '/upload/1300478853203.jpg', 500, 4, 1, '2012-3-23 20:14:20', 'no');
INSERT INTO `t_goods` VALUES (5, '联想台式机5623 ', '请输入内容', '/upload/1300479583718.jpg', 700, 4, 1, '2012-3-23 20:22:29', 'no');
INSERT INTO `t_goods` VALUES (11, '手机', '手机', '/upload/1332675841490.jpg', 20, 4, 4, '2012-3-25 19:44:10', 'no');
INSERT INTO `t_goods` VALUES (12, '苹果手机', '<p>iphone4s</p>', '/upload/1332676204955.jpg', 4000, 3, 4, '2012-3-25 19:50:11', 'sold');
INSERT INTO `t_goods` VALUES (13, 'htc手机', '<p>htc手机g14</p>', '/upload/1332848613657.jpg', 2000, 3, 5, '2012-3-27 19:43:41', 'sold');

-- --------------------------------------------------------

-- 
-- 表的结构 `t_jingpai`
-- 

CREATE TABLE `t_jingpai` (
  `jingpai_id` int(11) NOT NULL auto_increment,
  `jingpai_jiage` int(11) default NULL,
  `jingpai_goods_id` int(11) default NULL,
  `jingpai_user_id` int(11) default NULL,
  `jingpai_shijian` varchar(50) default NULL,
  `del` varchar(50) default NULL,
  PRIMARY KEY  (`jingpai_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

-- 
-- 导出表中的数据 `t_jingpai`
-- 

INSERT INTO `t_jingpai` VALUES (4, 4000, 12, 4, '2012-3-27 19:19:32', 'no');
INSERT INTO `t_jingpai` VALUES (5, 2000, 13, 4, '2012-3-27 19:44:38', 'no');

-- --------------------------------------------------------

-- 
-- 表的结构 `t_liuyan`
-- 

CREATE TABLE `t_liuyan` (
  `liuyan_id` int(11) NOT NULL auto_increment,
  `liuyan_title` varchar(50) default NULL,
  `liuyan_content` varchar(255) default NULL,
  `liuyan_date` varchar(50) default NULL,
  `liuyan_user` varchar(50) default NULL,
  PRIMARY KEY  (`liuyan_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

-- 
-- 导出表中的数据 `t_liuyan`
-- 

INSERT INTO `t_liuyan` VALUES (1, 'df                                                ', '请输入内容df', '2011-2-23 0:38:40', NULL);
INSERT INTO `t_liuyan` VALUES (2, 'df                                                ', '请输入内容df', '2011-3-5 14:43:36', NULL);
INSERT INTO `t_liuyan` VALUES (3, 'ddddd', '请输入内容df', '2011-3-25 18:38:06', '1                                                 ');
INSERT INTO `t_liuyan` VALUES (4, 'dddddd', '请输入内容ddddd', '2011-3-30 21:15:37', '123456');

-- --------------------------------------------------------

-- 
-- 表的结构 `t_user`
-- 

CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL auto_increment,
  `user_name` varchar(50) default NULL,
  `user_pw` varchar(50) default NULL,
  `user_type` int(11) default NULL,
  `user_realname` varchar(50) default NULL,
  `user_address` varchar(50) default NULL,
  `user_sex` varchar(50) default NULL,
  `user_tel` varchar(50) default NULL,
  `user_email` varchar(50) default NULL,
  `user_qq` varchar(50) default NULL,
  `user_man` varchar(50) default NULL,
  `user_age` varchar(50) default NULL,
  `user_birthday` varchar(50) default NULL,
  `user_xueli` varchar(50) default NULL,
  `user_del` varchar(50) default NULL,
  `user_one1` varchar(50) default NULL,
  `user_one2` varchar(50) default NULL,
  `user_one3` varchar(50) default NULL,
  `user_one4` varchar(50) default NULL,
  `user_one5` varchar(50) default NULL,
  `user_one6` int(11) default NULL,
  `user_one7` int(11) default NULL,
  `user_one8` int(11) default NULL,
  `user_one9` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `user_one10` timestamp NOT NULL default '0000-00-00 00:00:00',
  `user_one11` bigint(20) default NULL,
  `user_one12` bigint(20) default NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

-- 
-- 导出表中的数据 `t_user`
-- 

INSERT INTO `t_user` VALUES (1, '1234567', '1234567', 0, '1234567', '1234567', '男', '13245621235', '1234567@yahoo.cn', '1234567', NULL, NULL, NULL, NULL, 'yes', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2014-04-17 20:36:33', '2014-04-17 20:36:33', NULL, NULL);
INSERT INTO `t_user` VALUES (2, '123qwe', '123qwe', 0, '123qwe', '123qwe', '男', '1345598564', '123qwe@yahoo.cn', '123qwe', NULL, NULL, NULL, NULL, 'no', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2014-04-17 20:36:33', '2014-04-17 20:36:33', NULL, NULL);
INSERT INTO `t_user` VALUES (4, '123456', '123456', 0, '123456', '123456', '男', '13999240000', '123456@163.com', '123456', NULL, NULL, NULL, NULL, 'no', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2014-04-17 20:36:33', '2014-04-17 20:36:33', NULL, NULL);
INSERT INTO `t_user` VALUES (5, '20120327', '20120327', 0, '20120327', '20120327', '男', '13999240008', '111@123.com', '123', NULL, NULL, NULL, NULL, 'no', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2014-04-17 20:36:33', '2014-04-17 20:36:33', NULL, NULL);
