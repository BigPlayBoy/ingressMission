-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: db_examsystem
-- ------------------------------------------------------
-- Server version	5.7.16-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
DROP DATABASE IF EXISTS `db_examsystem`;
CREATE DATABASE `db_examsystem` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `db_examsystem`;

--
-- Table structure for table `course_tb`
--

DROP TABLE IF EXISTS `course_tb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course_tb` (
  `courseId` int(11) NOT NULL,
  `courseName` varchar(20) NOT NULL DEFAULT '',
  `courseUrl` varchar(120) DEFAULT NULL,
  `courseBeizhu` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`courseId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='课程资源表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course_tb`
--

LOCK TABLES `course_tb` WRITE;
/*!40000 ALTER TABLE `course_tb` DISABLE KEYS */;
INSERT INTO `course_tb` VALUES (1,'社会主义核心价值观','/aaa/bbb/ccc.txt','这里是测试代码，创建数据库时自动生成的');
/*!40000 ALTER TABLE `course_tb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exam_tb`
--

DROP TABLE IF EXISTS `exam_tb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exam_tb` (
  `studentId` varchar(10) DEFAULT NULL,
  `studentName` varchar(255) DEFAULT NULL,
  `result` int(11) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam_tb`
--

LOCK TABLES `exam_tb` WRITE;
/*!40000 ALTER TABLE `exam_tb` DISABLE KEYS */;
INSERT INTO `exam_tb` VALUES ('1330090002','崔明辉',99,'20170102'),('1330090002','崔明辉',99,'20170214'),('1330090002','崔明辉',98,'20170213'),('cui','123',20,'Sun Feb 19 21:43:32 CST 2017'),('cui','123',20,'Sun Feb 19 21:44:25 CST 2017'),('cui','123',30,'Mon Feb 20 12:50:12 CST 2017'),('cui','123',25,'Tue Feb 21 14:14:30 CST 2017'),('cui','123',30,'Tue Feb 21 22:14:24 CST 2017'),('1330090002','崔明辉',25,'Fri Mar 17 22:39:29 CST 2017'),('1330090002','崔明辉',25,'Sun Mar 19 22:29:16 CST 2017'),('1330090002','崔明辉',20,'Sun Mar 19 22:30:48 CST 2017'),('1330090002','崔明辉',20,'Sun Mar 19 22:31:48 CST 2017'),('1330090002','崔明辉',35,'Mon Mar 20 20:49:33 CST 2017'),('1330090002','崔明辉',25,'Mon Mar 20 20:52:13 CST 2017'),('1330090002','崔明辉',30,'Mon Mar 20 20:53:48 CST 2017'),('1330090002','崔明辉',20,'Mon Mar 20 20:54:13 CST 2017');
/*!40000 ALTER TABLE `exam_tb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `messageboard_tb`
--

DROP TABLE IF EXISTS `messageboard_tb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `messageboard_tb` (
  `messageId` int(11) NOT NULL,
  `UserName` varchar(20) NOT NULL DEFAULT '',
  `Theme` varchar(20) DEFAULT NULL,
  `Content` varchar(200) DEFAULT NULL,
  `Time` varchar(32) DEFAULT '1994',
  PRIMARY KEY (`messageId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='留言表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messageboard_tb`
--

LOCK TABLES `messageboard_tb` WRITE;
/*!40000 ALTER TABLE `messageboard_tb` DISABLE KEYS */;
INSERT INTO `messageboard_tb` VALUES (1,'崔明辉','测试代码','这里是测试代码，创建数据库时自动生成的','20170101'),(2,'崔明辉','早上好','早上好','2017-03-06'),(3,'胡永涛','晚上测试','<p>晚上测试 右上角的名字可以正常显示</p><p>留言者的名字应该根据登陆的人来自动显示</p>','2017-03-07'),(4,'胡永涛','qq去','钱钱钱钱钱钱钱钱钱钱钱钱去','2017-02-27'),(5,'胡永涛','请问企鹅','请问去完全请问 去请问去','2017-02-27'),(6,'胡永涛','深夜好','<p>深夜好 刚刚断开连接了？</p><p><br></p>','2017-03-01'),(7,'崔明辉','难道 发表留言后  就不能看了','水水水水水','2017-03-01'),(8,'崔明辉','早上好','做个测试','2017-02-27'),(9,'崔明辉','早上好2','早上好 现在还有问题','2017-03-02'),(10,'崔明辉','中午好','这里是留言内容 留言已经不能正常显示了','2017-03-15'),(11,'崔明辉','啊啊啊啊从','啊啊啊啊','2017-03-13'),(12,'崔明辉',' 威威','w我我我我','Thu Mar 16 16:46:42 CST 2017'),(13,'崔明辉','强强强强强强强强强强强强强强','&nbsp;qqqq &nbsp;分公司 <b>士大夫 的</b>个发 发的说说','Thu Mar 16 20:20:04 CST 2017'),(14,'崔明辉','晚上好，现在是测试时间。','<p>晚上好，现在是测试时间。晚上好，现在是测试时间。晚上好，现在是测试时间。晚上好，现在是测试时间。晚上好，现在是测试时间。</p>','Sun Mar 19 22:57:21 CST 2017');
/*!40000 ALTER TABLE `messageboard_tb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ppt_tb`
--

DROP TABLE IF EXISTS `ppt_tb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ppt_tb` (
  `pptId` int(11) NOT NULL AUTO_INCREMENT,
  `pptName` varchar(20) DEFAULT NULL,
  `pptDetail` varchar(255) DEFAULT NULL,
  `pptSourceUrl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pptId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='pdf资源表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ppt_tb`
--

LOCK TABLES `ppt_tb` WRITE;
/*!40000 ALTER TABLE `ppt_tb` DISABLE KEYS */;
INSERT INTO `ppt_tb` VALUES (1,'社会主义核心价值观','社会主义核心价值观介绍，富强民主，文明，和谐','../../source/ppt/1.ppt'),(2,'社會主義核心價值觀','社會主義核心價值觀介紹，還是繁體字哦','../../source/ppt/1.ppt'),(3,'数据库原理','三民主義','../../source/ppt/2.ppt'),(4,'数据库概率','数据库原理相关介绍，真的好多','../../source/ppt/1.ppt');
/*!40000 ALTER TABLE `ppt_tb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ppturls_tb`
--

DROP TABLE IF EXISTS `ppturls_tb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ppturls_tb` (
  `pptUrlsId` int(11) NOT NULL AUTO_INCREMENT,
  `pptId` int(11) DEFAULT NULL,
  `pptUrl` varchar(255) DEFAULT '/err.pdf',
  `pptUrlDetail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pptUrlsId`),
  KEY `f_pdfId` (`pptId`)
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ppturls_tb`
--

LOCK TABLES `ppturls_tb` WRITE;
/*!40000 ALTER TABLE `ppturls_tb` DISABLE KEYS */;
INSERT INTO `ppturls_tb` VALUES (1,1,'../../images/video/1.jpg','这里是一段介绍'),(2,1,'../../images/video/1.jpg','這是介紹'),(3,1,'../../images/video/2.jpg','這是介紹'),(4,2,'../../images/video/3.jpg','這是介紹'),(5,2,'../../images/video/4.jpg','這是介紹'),(6,3,'../../images/video/1.jpg','這是介紹'),(7,3,'../../images/video/2.jpg','第三个的ppt'),(8,4,'../../images/video/3.jpg','这里是这张ppt的介绍'),(9,3,'../../images/video/4.jpg','这里是这张ppt的介绍'),(10,3,'../../images/video/1.jpg','这里是这张ppt的介绍'),(11,4,'../../images/video/2.jpg','这里是这张ppt的介绍'),(12,1,'../../images/video/3.jpg','这里是这张ppt的介绍'),(13,1,'../../images/video/4.jpg','第一章ppt'),(14,1,'../../images/video/1.jpg','第一章ppt'),(15,1,'../../images/video/2.jpg','第一章ppt'),(16,2,'../../images/video/3.jpg','第一章ppt'),(17,2,'../../images/video/4.jpg','第一章ppt'),(18,2,'../../images/video/1.jpg','第一章ppt'),(19,2,'../../images/video/2.jpg','第一章ppt'),(20,2,'../../images/video/3.jpg','第一章ppt'),(21,2,'../../images/video/3.jpg','第一章ppt'),(22,4,'../../images/video/1.jpg','第一章ppt'),(23,5,'../../images/video/1.jpg','第一章ppt'),(24,1,'../../images/video/3.jpg','这是关于这一页的PPT介绍'),(25,1,'../../images/video/1.jpg','这是关于这一页的PPT介绍'),(26,1,'../../images/video/2.jpg','这是关于这一页的PPT介绍'),(27,1,'../../images/video/3.jpg','这是关于这一页的PPT介绍'),(28,1,'../../images/video/4.jpg','这是关于这一页的PPT介绍'),(29,1,'../../images/video/1.jpg','这是关于这一页的PPT介绍'),(30,1,'../../images/video/2.jpg','这是关于这一页的PPT介绍'),(31,1,'../../images/video/3.jpg','这是关于这一页的PPT介绍'),(32,1,'../../images/video/4.jpg','这是关于这一页的PPT介绍'),(33,2,'../../images/video/1.jpg','这是关于这一页的PPT介绍'),(34,2,'../../images/video/2.jpg','这是关于这一页的PPT介绍'),(35,2,'../../images/video/3.jpg','这是关于这一页的PPT介绍'),(36,2,'../../images/video/4.jpg','这是关于这一页的PPT介绍'),(37,2,'../../images/video/1.jpg','这是关于这一页的PPT介绍'),(38,2,'../../images/video/2.jpg','这是关于这一页的PPT介绍'),(39,2,'../../images/video/3.jpg','这是关于这一页的PPT介绍'),(40,2,'../../images/video/4.jpg','这是关于这一页的PPT介绍'),(41,2,'../../images/video/1.jpg','这是关于这一页的PPT介绍'),(42,2,'../../images/video/2.jpg','这是关于这一页的PPT介绍'),(43,2,'../../images/video/3.jpg','这是关于这一页的PPT介绍'),(44,2,'../../images/video/4.jpg','这是关于这一页的PPT介绍'),(45,3,'../../images/video/1.jpg','这是关于这一页的PPT介绍'),(46,3,'../../images/video/2.jpg','这是关于这一页的PPT介绍'),(47,3,'../../images/video/3.jpg','这是关于这一页的PPT介绍'),(48,3,'../../images/video/4.jpg','这是关于这一页的PPT介绍'),(49,3,'../../images/video/1.jpg','这是关于这一页的PPT介绍'),(50,3,'../../images/video/2.jpg','这是关于这一页的PPT介绍'),(51,3,'../../images/video/3.jpg','这是关于这一页的PPT介绍'),(52,3,'../../images/video/4.jpg','这是关于这一页的PPT介绍'),(53,3,'../../images/video/1.jpg','这是关于这一页的PPT介绍'),(54,3,'../../images/video/2.jpg','这是关于这一页的PPT介绍'),(55,3,'../../images/video/3.jpg','这是关于这一页的PPT介绍'),(56,3,'../../images/video/4.jpg','这是关于这一页的PPT介绍'),(57,4,'../../images/video/1.jpg','这是关于这一页的PPT介绍'),(58,4,'../../images/video/2.jpg','这是关于这一页的PPT介绍'),(59,4,'../../images/video/3.jpg','这是关于这一页的PPT介绍'),(60,4,'../../images/video/4.jpg','这是关于这一页的PPT介绍'),(61,4,'../../images/video/1.jpg','这是关于这一页的PPT介绍'),(62,4,'../../images/video/2.jpg','这是关于这一页的PPT介绍'),(63,4,'../../images/video/3.jpg','这是关于这一页的PPT介绍'),(64,4,'../../images/video/4.jpg','这是关于这一页的PPT介绍'),(65,4,'../../images/video/1.jpg','这是关于这一页的PPT介绍'),(66,4,'../../images/video/2.jpg','这是关于这一页的PPT介绍'),(67,4,'../../images/video/3.jpg','这是关于这一页的PPT介绍'),(68,4,'../../images/video/4.jpg','这是关于这一页的PPT介绍'),(69,4,'../../images/video/1.jpg','这是关于这一页的PPT介绍'),(70,4,'../../images/video/2.jpg','这是关于这一页的PPT介绍'),(71,4,'../../images/video/3.jpg','这是关于这一页的PPT介绍'),(72,4,'../../images/video/4.jpg','这是关于这一页的PPT介绍');
/*!40000 ALTER TABLE `ppturls_tb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_tb`
--

DROP TABLE IF EXISTS `student_tb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_tb` (
  `StudentID` varchar(10) NOT NULL,
  `StudentName` varchar(255) DEFAULT '',
  `StudentPassword` varchar(255) DEFAULT NULL,
  `salt` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`StudentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_tb`
--

LOCK TABLES `student_tb` WRITE;
/*!40000 ALTER TABLE `student_tb` DISABLE KEYS */;
INSERT INTO `student_tb` VALUES ('1330090002','崔明辉','123456','0509302'),('1330090007','王涛','123456','0509301');
/*!40000 ALTER TABLE `student_tb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject_tb`
--

DROP TABLE IF EXISTS `subject_tb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subject_tb` (
  `subjectId` int(11) NOT NULL AUTO_INCREMENT,
  `subjectTitle` varchar(255) DEFAULT NULL,
  `subjectOptionA` varchar(50) DEFAULT NULL,
  `subjectOptionB` varchar(50) DEFAULT NULL,
  `subjectOptionC` varchar(50) DEFAULT NULL,
  `subjectOptionD` varchar(50) DEFAULT NULL,
  `jdugeAnswer` varchar(1) DEFAULT NULL,
  `subjectParse` text,
  PRIMARY KEY (`subjectId`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8 COMMENT='试题信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject_tb`
--

LOCK TABLES `subject_tb` WRITE;
/*!40000 ALTER TABLE `subject_tb` DISABLE KEYS */;
INSERT INTO `subject_tb` VALUES (2,'下列各进制数中最大的数是( )。','227O','1FFH','1010001B','789D','D',NULL),(3,'( )不是微型计算机必须的工作环境。','恒温','良好的接地线路','远离强磁场','稳定的电源电压','A',NULL),(4,'( )不是文件。','设备','文档','应用程序','窗口','D','窗口不是文件'),(5,'( )不属于Word2003的文档打开方式。','读写方式','只读方式','备份方式','系统方式','D','系统方式不是Word2003的文档打开方式。'),(6,'( )菜单中含有设置字体的命令。','格式','编辑','视图','工具','A',NULL),(8,'( )的功能是将计算机外部的信息送入计算机。','输入设备','输出设备','软盘','电源线','A',''),(9,'( )的主要功能是使用户的计算机与远程主机相连，从而成为远程主机的终端。','E-mail','FTP','Telnet','BBS','C',''),(10,'( )视图方式可对文档不进行分页处理。','普通','联机版式','页面视图','大纲','B',''),(12,'( )是微型计算机的外存。 ','RAM','ROM','磁盘','虚拟盘','C',''),(13,'( )是用来存储程序及数据的装置。','输入设备','存储器','控制器','输出设备','B',''),(14,'NOVELLNETWARE是( )','网络操作系统','通用操作系统','实时操作系统','分时操作系统','A',''),(15,'预防计算机病毒的手段，错误的是( )。','要经常地对硬盘上的文件进行备份','凡不需要再写入数据的磁盘都应有写保护','将所有的.COM和.EXE文件赋以“只读”属性','对磁盘进行清洗','D',''),(16,'“32位微型计算机”中的32指的是( )','微机型号','内存容量','存储单位','机器字长','D',''),(17,'“奔腾”微型计算机采用的微处理器的型号是( )','80286','80386','80486','80586','D',''),(18,'“画图”程序是WINDOWS98的一个附件程序，能进行简单的图形处理，产生的文件为位图文件，扩展名为( )。','BMP','CRH','EXE','GPH','A',''),(19,'“开始”菜单中，注销命令将( )。','关闭系统','关闭当前窗口上的程序','关闭所有打开的程序','以上都不对','C',''),(20,'“文件”下拉菜单底部所显示的文件名是( )。','扩展名为DOC的全部文件','正要打印的文件名','正在使用的文件名','最近被Word处理过的文档','D',''),(21,'“溢出”一般是指计算机在运算过程中产生的( )。','数据量超过了内存量','文件个数超过了磁盘目录区规定的范围','数超过了机器的位所表示的范围','数超过了变量的表示范围','C',''),(22,'《计算机软件条例》中所称的计算机软件(简称软件)是指( )。','计算机程序','源程序和目标程序','源程序','计算机程序及其有关文档','D',''),(23,'10BaseF的含义是( )。','10Mbps的宽带光纤网络','10Mbps的基带同轴电缆网络','10Mbps的基带光纤网络','10Mbps的宽带同轴电缆网络','C',''),(24,'在微机中，主机由微处理器与( )组成。','运算器','磁盘存储器','软盘存储器','内存储器','D',''),(25,'1MB的存储容量相当于( )。','一百万个字节','2的10次方个字节','2的20次方个字节','1000KB','C',''),(26,'1nternet的分层结构是由( )这个四层组成。',' 应用层、传输层、通信子网层和物理层','应用层、表示层、传输层和网络层','物理层、数据链路层、网络层和传输层','网络接口层、网络层、传输层和应用层','D',''),(27,'WindowsXP中改变窗口的大小时，应操作( )。','窗口的四角或四边','窗口右上角的按钮','窗口的标题栏','窗口左上角的控制栏','A',''),(28,'在WindowsXP操作系统中，对话框的大小是( )。','可变的','可任意设置的','固定的','与不同的操作有关的','D',''),(29,'测试路考','向右转','向左转','向前','向后','D','应该向后！！！！'),(30,'这是一道测试题','A','B','C','D','A',NULL),(31,'这是第二题','A','A','A','A','C','wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww');
/*!40000 ALTER TABLE `subject_tb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher_tb`
--

DROP TABLE IF EXISTS `teacher_tb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacher_tb` (
  `teacherID` varchar(20) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`teacherID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教师信息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher_tb`
--

LOCK TABLES `teacher_tb` WRITE;
/*!40000 ALTER TABLE `teacher_tb` DISABLE KEYS */;
INSERT INTO `teacher_tb` VALUES ('teacher','teacher');
/*!40000 ALTER TABLE `teacher_tb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `video_tb`
--

DROP TABLE IF EXISTS `video_tb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `video_tb` (
  `videoId` int(11) NOT NULL AUTO_INCREMENT,
  `videoName` varchar(32) DEFAULT NULL,
  `videoDetail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`videoId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='存放视频目录';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `video_tb`
--

LOCK TABLES `video_tb` WRITE;
/*!40000 ALTER TABLE `video_tb` DISABLE KEYS */;
INSERT INTO `video_tb` VALUES (1,'数据库结构','这里是数据库结构课程，一共有299节视频'),(2,'数据库原理','这里是数据库原理课程，一共有299节视频'),(3,'信息技术','这里是信息技术课程，一共有299节视频'),(4,'Java编程思想','这里是java编程思想课程，一共有299节视频'),(5,'C语言程序设计','这里是C语言程序设计，一共有299节视频');
/*!40000 ALTER TABLE `video_tb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `videosource_tb`
--

DROP TABLE IF EXISTS `videosource_tb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `videosource_tb` (
  `videoSourceId` int(11) NOT NULL AUTO_INCREMENT,
  `videoId` int(11) DEFAULT NULL,
  `videoName` varchar(255) DEFAULT NULL,
  `videoUrl` varchar(255) DEFAULT NULL,
  `videoDetail` varchar(255) DEFAULT NULL,
  `videoImgUrl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`videoSourceId`)
) ENGINE=InnoDB AUTO_INCREMENT=108 DEFAULT CHARSET=utf8 COMMENT='存放视频地址';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `videosource_tb`
--

LOCK TABLES `videosource_tb` WRITE;
/*!40000 ALTER TABLE `videosource_tb` DISABLE KEYS */;
INSERT INTO `videosource_tb` VALUES (1,1,'第一节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(2,1,'第二节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(3,1,'第三节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(4,1,'第四节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(5,1,'第五节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(6,1,'第六节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(7,1,'第七节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(8,1,'第八节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(9,1,'第九节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(10,1,'第十节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(11,1,'第十一节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(12,1,'第十二节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(13,1,'第十三节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(14,1,'第十四节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(15,1,'第十五节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(16,1,'第十六节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(17,1,'第十七节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(18,1,'第十八节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(19,1,'第十九节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(20,1,'第二十节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(21,2,'第一节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(22,2,'第二节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(23,2,'第三节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(24,2,'第四节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(25,2,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(26,3,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(27,3,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(28,3,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(29,3,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(30,3,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(31,3,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(32,3,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(33,3,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(34,2,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(35,2,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(36,2,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(37,2,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(38,3,'第三节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(39,3,'第四节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(40,3,'第五节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(41,3,'第六节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(42,3,'第七节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(43,3,'第八节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(44,4,'第九节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(45,4,'第十节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(46,4,'第十一节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(47,4,'第十二节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(48,4,'第十三节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(49,4,'第十四节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(50,4,'第十五节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(51,4,'第十六节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(52,4,'第十七节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(53,4,'第十八节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(54,4,'第十九节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(55,4,'第二十节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(56,4,'第一节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(57,5,'第二节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(58,5,'第三节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(59,5,'第四节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(60,5,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(61,5,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(62,5,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(63,5,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(64,5,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(65,5,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(66,5,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(67,5,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(68,5,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(69,2,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(70,2,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(71,2,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(72,2,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(73,3,'第三节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(74,3,'第四节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(75,3,'第五节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(76,3,'第六节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(77,3,'第七节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(78,3,'第八节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(79,4,'第九节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(80,4,'第十节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(81,4,'第十一节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(82,4,'第十二节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(83,4,'第十三节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(84,4,'第十四节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(85,4,'第十五节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(86,4,'第十六节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(87,4,'第十七节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(88,4,'第十八节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(89,4,'第十九节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(90,4,'第二十节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(91,4,'第一节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(92,5,'第二节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(93,5,'第三节课程','../../video/5.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(94,5,'第四节课程','../../video/1.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(95,5,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(96,5,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(97,5,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(98,5,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(99,5,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(100,5,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-1.jpg'),(101,5,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(102,5,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(103,5,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(104,2,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(105,2,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(106,2,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg'),(107,2,'第五节课程','../../video/4.mp4','这里是视频介绍，可以在后台更改','../../images/course_sourse/img-2.jpg');
/*!40000 ALTER TABLE `videosource_tb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'db_examsystem'
--

--
-- Dumping routines for database 'db_examsystem'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-21 11:38:33
