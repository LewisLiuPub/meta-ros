# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "`image_geometry` contains C++ and Python libraries for interpreting images     geometrically. It interfaces the calibration parameters in sensor_msgs/CameraInfo     messages with OpenCV functions such as image rectification, much as cv_bridge     interfaces ROS sensor_msgs/Image with OpenCV data types."
AUTHOR = "Mikael Arguedas <mikael@osrfoundation.org>"
ROS_AUTHOR = "Patrick Mihelich"
HOMEPAGE = "http://www.ros.org/wiki/image_geometry"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "vision_opencv"
ROS_BPN = "image_geometry"

ROS_BUILD_DEPENDS = " \
    opencv \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    opencv \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    opencv \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/vision_opencv-release/archive/release/crystal/image_geometry/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c4f18587f63e6e62dff44cdca522982d"
SRC_URI[sha256sum] = "1fbf0988dbf901abd57568dc429988e5316f9184230dbe102d2cb783ccd7c913"
S = "${WORKDIR}/vision_opencv-release-release-crystal-image_geometry-2.1.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('vision-opencv', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('vision-opencv', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/vision-opencv/vision-opencv_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/vision-opencv/vision-opencv-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/vision-opencv/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/vision-opencv/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
