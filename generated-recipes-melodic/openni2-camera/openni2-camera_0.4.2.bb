# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Drivers for the Asus Xtion and Primesense Devices. For using a kinect   with ROS, try the <a href="http://wiki.ros.org/freenect_stack">freenect stack</a>"
AUTHOR = "Michael Ferguson <mferguson@fetchrobotics.com>"
ROS_AUTHOR = "Julius Kammerl <jkammerl@todo.todo>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "openni2_camera"
ROS_BPN = "openni2_camera"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libopenni2-dev} \
    camera-info-manager \
    dynamic-reconfigure \
    image-transport \
    message-generation \
    nodelet \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libopenni2-dev} \
    camera-info-manager \
    dynamic-reconfigure \
    image-transport \
    message-runtime \
    nodelet \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libopenni2-dev} \
    camera-info-manager \
    dynamic-reconfigure \
    image-transport \
    message-runtime \
    nodelet \
    roscpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/openni2_camera-release/archive/release/melodic/openni2_camera/0.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9368d367a1e254d0ae5c9e8cec310081"
SRC_URI[sha256sum] = "d154919dd68c19a6255bbbafd1d238d30baae4e6b146eb17875002511180181f"
S = "${WORKDIR}/openni2_camera-release-release-melodic-openni2_camera-0.4.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('openni2-camera', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('openni2-camera', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/openni2-camera/openni2-camera_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/openni2-camera/openni2-camera-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/openni2-camera/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/openni2-camera/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}