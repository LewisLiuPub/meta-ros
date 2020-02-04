# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "roswtf is a tool for diagnosing issues with a running ROS system. Think of it as a FAQ implemented in code."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Ken Conley"
HOMEPAGE = "http://ros.org/wiki/roswtf"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_comm"
ROS_BPN = "roswtf"

ROS_BUILD_DEPENDS = " \
    rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${PYTHON_PN}-paramiko \
    ${PYTHON_PN}-rospkg \
    rosbuild \
    rosgraph \
    roslaunch \
    roslib \
    rosnode \
    rosservice \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${PYTHON_PN}-paramiko \
    ${PYTHON_PN}-rospkg \
    rosbuild \
    rosgraph \
    roslaunch \
    roslib \
    rosnode \
    rosservice \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    cmake-modules \
    rosbag \
    std-srvs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/roswtf/1.14.3-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/roswtf"
SRC_URI = "git://github.com/ros-gbp/ros_comm-release;${ROS_BRANCH};protocol=https"
SRCREV = "17c758225dcf61c47717854ce35b3bdaed065fa0"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
