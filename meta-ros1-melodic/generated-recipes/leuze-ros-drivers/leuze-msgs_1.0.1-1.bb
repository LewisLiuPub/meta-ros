# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Contains the specific leuze messages."
AUTHOR = "Ludovic Delval <ludovic.delval@ipa.fraunhofer.de>"
ROS_AUTHOR = "Ludovic Delval <ludovic.delval@ipa.fraunhofer.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=740ffa6e787a40b3ec532a5b41b0c385"

ROS_CN = "leuze_ros_drivers"
ROS_BPN = "leuze_msgs"

ROS_BUILD_DEPENDS = " \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa-led/leuze_ros_drivers-release/archive/release/melodic/leuze_msgs/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/leuze_msgs"
SRC_URI = "git://github.com/ipa-led/leuze_ros_drivers-release;${ROS_BRANCH};protocol=https"
SRCREV = "fb2cb047fc61b02ed6dc2ea75076b4d039815494"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}