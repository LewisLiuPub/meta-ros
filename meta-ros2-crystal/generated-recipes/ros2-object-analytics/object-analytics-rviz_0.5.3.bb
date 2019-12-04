# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_crystal
inherit ros_superflore_generated

DESCRIPTION = "Display object analytics result in rviz"
AUTHOR = "Chris Ye <chris.ye@intel.com>"
ROS_AUTHOR = "Chris Ye"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "ros2_object_analytics"
ROS_BPN = "object_analytics_rviz"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    message-filters \
    object-analytics-msgs \
    object-msgs \
    rclcpp \
    sensor-msgs \
    std-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    message-filters \
    object-analytics-msgs \
    object-msgs \
    rclcpp \
    sensor-msgs \
    std-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ros2_object_analytics-release/archive/release/crystal/object_analytics_rviz/0.5.3-0.tar.gz
ROS_BRANCH ?= "branch=release/crystal/object_analytics_rviz"
SRC_URI = "git://github.com/ros2-gbp/ros2_object_analytics-release;${ROS_BRANCH};protocol=https"
SRCREV = "88fd6be89a2de8052c816977fd4db7f26acce8e1"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}